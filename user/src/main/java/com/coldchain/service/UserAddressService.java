package com.coldchain.service;

import com.coldchain.entity.User;
import com.coldchain.entity.UserAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.vo.UserAddressRq;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dyr
 * @since 2019-11-28
 */
public interface UserAddressService extends IService<UserAddress> {

    //添加收货地址
    void addUserAddress(UserAddressRq userAddressRq);

    //更新收货地址
    void updateUserAddress(UserAddressRq userAddressRq);

    //删除收货地址
    void removeUserAddress(String addressId);

    void isDefaultUserAddress(String id);
}
