package com.coldchain.service.impl;

import cn.hutool.core.date.DateUnit;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpDeviceCorrelationTypeMapper;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpDeviceCorrelationType;
import com.coldchain.entity.CpDeviceGroup;
import com.coldchain.dao.CpDeviceGroupMapper;
import com.coldchain.entity.vo.CpDeviceGroupGet;
import com.coldchain.entity.vo.CpDeviceGroupRq;
import com.coldchain.entity.vo.CpDeviceGroupVo;
import com.coldchain.entity.vo.CpGroupDeviceVo;
import com.coldchain.service.CpDeviceGroupService;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.UserService;
import com.common.dto.CpDeviceGroupDto;
import com.common.dto.NtsCompanyDto;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.HttpClientUtil;
import com.common.utils.TLinkUtil;
import com.common.vo.SBApi;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static cn.hutool.core.date.DateUtil.now;
import static org.apache.ibatis.type.JdbcType.DATE;

/**
 * (CpDeviceGroup)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@Service("cpDeviceGroupService")
public class CpDeviceGroupServiceImpl extends ServiceImpl<CpDeviceGroupMapper, CpDeviceGroup> implements CpDeviceGroupService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private UserService userService;

    @Autowired
    private CpDeviceService cpDeviceService;

    /**
     * 设备分组分页
     *
     * @param start
     * @param end
     * @param groupName
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<CpDeviceGroupVo> deviceGroupPage(Long start, Long end, String groupName, Integer page, Integer size) {
        UserDto userDto = authenticationFacade.getUser();
        Page<CpDeviceGroupVo> cpDeviceGroupPage = new Page<>(page, size);
        List<CpDeviceGroupVo> deviceGroupVoList = this.baseMapper.deviceGroupPage(cpDeviceGroupPage, start, end, groupName, userDto.getUserId());
        cpDeviceGroupPage.setRecords(deviceGroupVoList);
        return cpDeviceGroupPage;
    }

    /**
     * 新增设备分组
     *
     * @param cpDeviceGroupRq
     */
    @Override
    public void add(CpDeviceGroupRq cpDeviceGroupRq) {
        int groupName = this.count(new QueryWrapper<CpDeviceGroup>().eq("group_name", cpDeviceGroupRq.getGroupName()));
        if (groupName > 0)  {
            throw new ShopException(-1, "分组名称已存在");
        }
        UserDto userDto = authenticationFacade.getUser();
        CpDeviceGroup cpDeviceGroup = new CpDeviceGroup();
        BeanUtils.copyProperties(cpDeviceGroupRq, cpDeviceGroup);
        cpDeviceGroup.setCreateBy(userDto.getNickname());
        cpDeviceGroup.setCreateDate(new Date());
//        cpDeviceGroup.setGroupCompany(getGroupCompany(userDto.getUserId()).getId() + "");
        cpDeviceGroup.setGroupUser(userDto.getUserId() + "");
        this.save(cpDeviceGroup);

    }

    /**
     * 修改分组
     *
     * @param cpDeviceGroupRq
     */
    @Override
    public void update(CpDeviceGroupRq cpDeviceGroupRq) {
        if (StringUtils.isBlank(cpDeviceGroupRq.getId())) {
            throw new ShopException(-1, "分组ID不能为空");
        }
        CpDeviceGroup deviceGroup = getById(cpDeviceGroupRq.getId());
        CpDeviceGroup cpDeviceGroup = getOne(new QueryWrapper<CpDeviceGroup>().eq("group_name", cpDeviceGroupRq.getGroupName()));
        if (cpDeviceGroup != null &&
                !StringUtils.equals(deviceGroup.getGroupName(), cpDeviceGroup.getGroupName())) {
            throw new ShopException(-1, "分组名称已存在");
        }
        UserDto userDto = authenticationFacade.getUser();

        CpDeviceGroup group = new CpDeviceGroup();
        group.setGroupName(cpDeviceGroupRq.getGroupName());
        group.setRemark(cpDeviceGroupRq.getRemark());
        group.setUpdateDate(new Date());
        group.setUpdateBy(userDto.getNickname());
        this.update(group, new UpdateWrapper<CpDeviceGroup>().eq("id", cpDeviceGroupRq.getId()));

    }
    /**
     *
     *
     * @param
     */
    @Override
    public List<CpDeviceGroup> getGroupByCompanyName(String groupCompany) {
        return list(new QueryWrapper<CpDeviceGroup>().eq("group_company", groupCompany));
    }

    /**
     * 删除分组
     *
     * @param ids
     */
    @Override
    public void delete(String ids) {
        JSONObject jsonObject = JSONObject.parseObject(ids);
        List<String> list = (List<String>)jsonObject.get("ids");
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(-1,"分组ID不能为空");
        }
        this.removeByIds(list);
    }

    @Override
    public List<CpGroupDeviceVo> getGroupByCompany(String companyId) {
        return this.baseMapper.getGroupByCompany(companyId);
    }

    @Override
    public List<CpDeviceGroupDto> getDeviceGroupByUserId(Page<CpDeviceGroupDto> deviceGroupDtoPage, Integer userId) {
        return this.baseMapper.getDeviceGroupByUserId(deviceGroupDtoPage,userId);
    }

    /**
     * APP 端设备分组 包含设备分页
     *
     * @param groupName
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<CpDeviceGroupVo> deviceGroupAppPage(String groupName, Integer page, Integer size) {
        Page<CpDeviceGroupVo> cpDeviceGroupVoPage = deviceGroupPage(null, null, groupName, page, size);
//        List<CpDeviceGroupVo> records = cpDeviceGroupVoPage.getRecords();
//        if (!CollectionUtils.isEmpty(records)) {
//            records.forEach(deviceGroupVo -> {
//                List<com.common.dto.CpDeviceDto> deviceVoList = cpDeviceService.getDeviceListByGroupId(deviceGroupVo.getId());
//                deviceGroupVo.setDeviceList(deviceVoList);
//            });
//        }
        return cpDeviceGroupVoPage;
    }
    /**
     * 根据用户id获取所属企业
     *
     * @param userId
     * @return
     */
    private NtsCompanyDto getGroupCompany(Integer userId) {
        NtsCompanyDto groupCompany = userService.getGroupCompany(userId);
        if (groupCompany == null) {
            throw new ShopException(-1,"请前往认证企业信息");
        }
        return groupCompany;
    }
}