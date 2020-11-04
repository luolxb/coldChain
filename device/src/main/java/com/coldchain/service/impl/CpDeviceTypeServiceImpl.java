package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.entity.CpDeviceType;
import com.coldchain.dao.CpDeviceTypeMapper;
import com.coldchain.entity.vo.CpDeviceTypeRq;
import com.coldchain.entity.vo.CpDeviceTypeVo;
import com.coldchain.service.CpDeviceTypeService;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 设备类型表(CpDeviceType)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
@Service("cpDeviceTypeService")
public class CpDeviceTypeServiceImpl extends ServiceImpl<CpDeviceTypeMapper, CpDeviceType> implements CpDeviceTypeService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Override
    public void add(CpDeviceTypeRq cpDeviceTypeRq) {

        CpDeviceType deviceType = getOne(new QueryWrapper<CpDeviceType>().eq("device_type_name", cpDeviceTypeRq.getDeviceTypeName()));
        if (deviceType != null) {
            throw new ShopException(-1, "设备类型名称已存在");
        }
        UserDto userDto = authenticationFacade.getUser();
        CpDeviceType cpDeviceType = new CpDeviceType();
        BeanUtils.copyProperties(cpDeviceTypeRq, cpDeviceType);
        cpDeviceType.setId(StringUtil.createUUID());
        cpDeviceType.setCreateDate(new Date());
        cpDeviceType.setCreateBy(userDto.getNickname());
        this.save(cpDeviceType);

    }

    @Override
    public void edit(CpDeviceTypeRq cpDeviceTypeRq) {
        if (cpDeviceTypeRq.getId() == null) {
            throw new ShopException(-1, "设备类型ID不能为空");
        }
        CpDeviceType deviceType = this.getById(cpDeviceTypeRq.getId());
        CpDeviceType deviceTypeName = getOne(new QueryWrapper<CpDeviceType>().eq("device_type_name", cpDeviceTypeRq.getDeviceTypeName()));
        if (deviceTypeName != null &&
                !StringUtils.equals(deviceType.getDeviceTypeName(), deviceTypeName.getDeviceTypeName())) {
            throw new ShopException(-1, "设备类型名称已存在");
        }

        UserDto userDto = authenticationFacade.getUser();
        CpDeviceType cpDeviceType = new CpDeviceType();
        BeanUtils.copyProperties(cpDeviceTypeRq, cpDeviceType);
        cpDeviceType.setUpdateDate(new Date());
        cpDeviceType.setUpdateBy(userDto.getNickname());
        this.updateById(cpDeviceType);

    }

    @Override
    public void delete(String ids) {
        JSONObject jsonObject = JSONObject.parseObject(ids);
        List<String> list = (List<String>) jsonObject.get("ids");
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(-1, "类型ID不能为空");
        }
        this.removeByIds(list);

    }

    @Override
    public Page<CpDeviceTypeVo> deviceTypePage(Long start, Long end, String deviceTypeName, Integer page, Integer size) {
        Page<CpDeviceTypeVo> deviceTypeVoPage = new Page<>(page, size);
        List<CpDeviceTypeVo> cpDeviceTypeVoList = this.baseMapper.deviceTypePage(deviceTypeVoPage, start, end, deviceTypeName);
        return deviceTypeVoPage.setRecords(cpDeviceTypeVoList);
    }
}