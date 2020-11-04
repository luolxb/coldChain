package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.UserSellerStoreMapper;
import com.coldchain.entity.UserSellerStore;
import com.coldchain.service.UserSellerStoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserSellerStoreServiceImpl extends ServiceImpl<UserSellerStoreMapper, UserSellerStore> implements UserSellerStoreService {
}
