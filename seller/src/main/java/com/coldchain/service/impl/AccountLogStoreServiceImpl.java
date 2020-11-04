package com.coldchain.service.impl;

import com.coldchain.entity.AccountLogStore;
import com.coldchain.dao.AccountLogStoreMapper;
import com.coldchain.service.AccountLogStoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-06-02
 */
@Service
public class AccountLogStoreServiceImpl extends ServiceImpl<AccountLogStoreMapper, AccountLogStore> implements AccountLogStoreService {

}
