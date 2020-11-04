package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.coldchain.dao.UserAddressMapper;
import com.coldchain.entity.vo.UserAddressRq;
import com.common.dto.UserDto;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.entity.UserAddress;
import com.coldchain.service.UserAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-11-28
 */
@Service("userAddressService")
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Override
    public void addUserAddress(UserAddressRq userAddressRq) {
        UserDto userDto = authenticationFacade.getUser();

        int userAddressCount = count(new QueryWrapper<UserAddress>().eq("user_id", userDto.getUserId()));
        if (userAddressCount >= 20) {
            throw new ShopException(ResultEnum.TOO_MANY_ADDRESS);
        }
        UserAddress userAddress = new UserAddress();
        BeanUtils.copyProperties(userAddressRq, userAddress);
        userAddress.setUserId(userDto.getUserId());
        if (userAddressCount == 0) {
            userAddress.setIsDefault(1);
        }
        this.save(userAddress);
    }

    @Override
    public void updateUserAddress(UserAddressRq userAddressRq) {
        UserDto userDto = authenticationFacade.getUser();

        UserAddress userAddress = new UserAddress();
        BeanUtils.copyProperties(userAddressRq, userAddress);
        this.update(userAddress, new UpdateWrapper<UserAddress>()
                .eq("user_id", userDto.getUserId()).eq("address_id", userAddressRq.getAddressId()));
    }

    @Override
    public void removeUserAddress(String addressIds) {
        UserDto userDto = authenticationFacade.getUser();
        JSONObject jsonObject = JSONObject.parseObject(addressIds);
        List<Integer> ids = (List<Integer>)jsonObject.get("ids");
        this.removeByIds(ids);
        UserAddress one = getOne(new QueryWrapper<UserAddress>().eq("user_id", userDto.getUserId()).eq("is_default", 1));
        if (one == null) {
            //如果删除的是默认地址则修改最新一条地址为默认地址
            UserAddress ua = getOne(new QueryWrapper<UserAddress>()
                    .eq("user_id", userDto.getUserId()).orderByDesc("address_id").last("limit 1"));
            update(new UpdateWrapper<UserAddress>().set("is_default", 1).eq("address_id", ua.getAddressId()));
        }
    }

    @Override
    public void isDefaultUserAddress(String id) {
        UserDto userDto = authenticationFacade.getUser();
        JSONObject jsonObject = JSONObject.parseObject(id);
        Integer idj = (Integer)jsonObject.get("id");

        UserAddress one = this.getOne(new QueryWrapper<UserAddress>().eq("user_id", userDto.getUserId()).eq("address_id", idj));
        if (null == one) {
            throw new ShopException(-1,"用户地址不存在");
        }

        if (one.getIsDefault().equals(1)) {
            throw new ShopException(-1,"该地址已为默认地址");
        }
        UserAddress userAddress = new UserAddress();
        userAddress.setAddressId(idj);
        userAddress.setIsDefault(1);
        this.updateById(userAddress);

        UserAddress isDefault = this.getOne(new QueryWrapper<UserAddress>()
                .eq("user_id", userDto.getUserId())
                .eq("is_default", 1));
        isDefault.setIsDefault(0);
        this.updateById(isDefault);
    }
}
