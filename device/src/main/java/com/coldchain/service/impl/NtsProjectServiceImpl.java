package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsProjectMapper;
import com.coldchain.entity.*;
import com.coldchain.service.*;
import com.common.dto.*;
import com.coldchain.entity.vo.NtsProjectRq;
import com.coldchain.entity.vo.NtsProjectVo;
import com.common.exception.ShopException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class NtsProjectServiceImpl extends ServiceImpl<NtsProjectMapper, NtsProject> implements NtsProjectService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private NtsUserProjectService userProjectService;

    @Autowired
    private NtsProjectDeviceService projectDeviceService;

    @Autowired
    private CpDeviceService cpDeviceService;

    @Autowired
    private CpDeviceGroupService cpDeviceGroupService;

    @Autowired
    private UserService userService;


    /**
     * 新增项目
     *
     * @param projectRq
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(NtsProjectRq projectRq) {
        // 检查新增羡慕参数
        checkAddParam(projectRq);
        UserDto user = authenticationFacade.getUser();

        NtsProject ntsProject = new NtsProject();
        BeanUtils.copyProperties(projectRq, ntsProject);
        ntsProject.setCreateTime(new Date());
        ntsProject.setCreateBy(StringUtils.isBlank(user.getNickname()) ? "admin" : user.getNickname());
        // 新增项目
        this.save(ntsProject);
        // 新增项目设备关联
        addProjectDevice(projectRq.getDeviceList(), ntsProject.getId());
        // 新增用户项目关联
        addUserProject(Long.parseLong(user.getUserId() + ""), ntsProject.getId());
    }

    /**
     * 检查新增羡慕参数
     *
     * @param projectRq
     */
    private void checkAddParam(NtsProjectRq projectRq) {
        NtsProject projectName = getOne(new QueryWrapper<NtsProject>().eq("project_name", projectRq.getProjectName()));
        if (null != projectName) {
            throw new RuntimeException("项目名称已存在");
        }

        NtsProject projectAddress = getOne(new QueryWrapper<NtsProject>().eq("project_address", projectRq.getProjectAddress()));
        if (null != projectAddress) {
            throw new ShopException(400, "项目地址已存在");
        }

    }

    /**
     * 新增项目设备关联
     *
     * @param listDevice
     * @param projectId
     */
    private void addProjectDevice(List<CpDeviceDto> listDevice, Long projectId) {
        listDevice.forEach(device -> {
            NtsProjectDevice ntsProjectDevice = new NtsProjectDevice();
            ntsProjectDevice.setProjectId(projectId);
            ntsProjectDevice.setDeviceId(device.getId()+"");
            projectDeviceService.save(ntsProjectDevice);
        });
    }

    /**
     * 新增用户项目关联
     *
     * @param userId
     * @param projectId
     */
    private void addUserProject(Long userId, Long projectId) {
        NtsUserProject ntsUserProject = new NtsUserProject();
        ntsUserProject.setUserId(userId);
        ntsUserProject.setProjectId(projectId);
        userProjectService.save(ntsUserProject);
    }

    /**
     * 修改项目
     *
     * @param projectRq
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(NtsProjectRq projectRq) {
        if (projectRq.getId() == null) {
            throw new ShopException(-1, "项目ID不能为空");
        }
        // 检查修改项目参数
        checkUpdateParam(projectRq);
        UserDto user = authenticationFacade.getUser();

        NtsProject ntsProject = new NtsProject();
        BeanUtils.copyProperties(projectRq, ntsProject);
        ntsProject.setUpdateTime(new Date());
        ntsProject.setUpdateBy(StringUtils.isBlank(user.getNickname()) ? "admin" : user.getNickname());
        this.updateById(ntsProject);

        // 删除之前的项目设备关联 根据项目ID
        projectDeviceService.remove(new QueryWrapper<NtsProjectDevice>().eq("project_id", ntsProject.getId()));

        // 新增项目设备关联
        addProjectDevice(projectRq.getDeviceList(), ntsProject.getId());
    }

    /**
     * 检查修改项目参数
     *
     * @param projectRq
     */
    private void checkUpdateParam(NtsProjectRq projectRq) {
        NtsProject ntsProject = getById(projectRq.getId());

        NtsProject projectName = getOne(new QueryWrapper<NtsProject>().eq("project_name", projectRq.getProjectName()));
        if (null != projectName && !StringUtils.equals(ntsProject.getProjectName(), projectName.getProjectName())) {
            throw new ShopException(400, "项目名称已存在");
        }

        NtsProject projectAddress = getOne(new QueryWrapper<NtsProject>().eq("project_address", projectRq.getProjectAddress()));
        if (null != projectAddress && !StringUtils.equals(ntsProject.getProjectAddress(), projectAddress.getProjectAddress())) {
            throw new ShopException(400, "项目地址已存在");
        }

    }

    /**
     * 根据项目ID删除项目
     *
     * @param ids
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delByIds(String ids) {
        JSONObject parse = (JSONObject) JSONObject.parse(ids);
        List<Integer> list = (List<Integer>) parse.get("ids");
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(-1, "项目ID不能为空");
        }
        List<Long> longList = new ArrayList<>();
        list.forEach(l -> longList.add(Long.parseLong(l + "")));
        this.removeByIds(longList);

        // 删除用户项目关联，根据项目id删除
        projectDeviceService.remove(new QueryWrapper<NtsProjectDevice>().in("project_id", longList));
    }

    /**
     * 项目设备分页
     *
     * @param page
     * @param size
     */
    @Override
    @Transactional(readOnly = true)
    public Page<NtsProjectVo> projectDevicePage(Integer page, Integer size, String projectName, String projectType) {
        UserDto user = authenticationFacade.getUser();
        // 获取当前登录用户的项目分页
        Page<NtsProjectVo> projectVoPage = new Page<>(page, size);
        List<NtsProjectVo> ntsProjectVoList = this.baseMapper.projectDevicePage(projectVoPage, user.getUserId(), projectName, projectType);
        // 获取当前登录用户的项目设备的数量
        ntsProjectVoList.forEach(projectVo -> {
            List<NtsProjectDevice> projectDeviceList = projectDeviceService.list(new QueryWrapper<NtsProjectDevice>().eq("project_id", projectVo.getId()));
            if (!CollectionUtils.isEmpty(projectDeviceList)) {
                List<String> stringList = projectDeviceList.stream().map(NtsProjectDevice::getDeviceId).collect(Collectors.toList());
                int count = cpDeviceService.count(new QueryWrapper<CpDevice>().in("id", stringList));
                projectVo.setDeviceNum(count);
            }
        });
        projectVoPage.setRecords(ntsProjectVoList);
        return projectVoPage;
    }

    /**
     * 数据中心项目设备分组分页
     *
     * @param page
     * @param size
     * @param userId
     * @return
     */
    @Override
    public  Page<CpDeviceGroupDto> dataDeviceGroup(Integer page, Integer size, Integer userId, Long companyId) {
        // 如果企业ID不为空获取企业的用户ID
        if (null != companyId) {
            UserDto userDto = userService.getUserByCompanyId(companyId);
            if (userDto == null) {
                throw new ShopException(-1,"用户信息不存在");
            }
            userId = userDto.getUserId();
        }
        // 获取用户设备分组分页
        Page<CpDeviceGroupDto> deviceGroupDtoPage = new Page<>(page, size);
        List<CpDeviceGroupDto> cpDeviceGroupDtoList = cpDeviceGroupService.getDeviceGroupByUserId(deviceGroupDtoPage, userId);
        // 获取设备分组中的设备
        cpDeviceGroupDtoList.forEach(cpDeviceGroupDto -> {
            List<CpDeviceDto> cpDeviceDtoList = cpDeviceService.getDeviceListByGroupId(cpDeviceGroupDto.getId());
            cpDeviceGroupDto.setDeviceDtoList(cpDeviceDtoList);
        });

        deviceGroupDtoPage.setRecords(cpDeviceGroupDtoList);
        return deviceGroupDtoPage;
    }

    @Override
    public NtsProjectDto detailDeviceList(Long projectId, String deviceName, Long start, Long end, Integer page, Integer size) {
        NtsProject project = this.getById(projectId);
        if (project == null) {
            throw new ShopException(-1, "项目不存在");
        }
        Page<com.common.dto.CpDeviceDto> deviceList = cpDeviceService.devicePageByProjectId(page, size, project.getId(), deviceName, start, end);
        NtsProjectDto ntsProjectDto = new NtsProjectDto();
        BeanUtils.copyProperties(project, ntsProjectDto);
        ntsProjectDto.setDeviceList(deviceList);
        // 获取项目下的设备信息
        return ntsProjectDto;
    }

    @Override
    public NtsProjectVo detailDevice(Long projectId) {

        NtsProject project = this.getById(projectId);
        List<com.common.dto.CpDeviceDto> deviceList = cpDeviceService.devicePageByProjectId(project.getId());
        NtsProjectVo ntsProjectDto = new NtsProjectVo();
        BeanUtils.copyProperties(project, ntsProjectDto);
        ntsProjectDto.setDeviceList(deviceList);
        return ntsProjectDto;
    }


}
