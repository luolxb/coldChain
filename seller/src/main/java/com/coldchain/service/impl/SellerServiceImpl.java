package com.coldchain.service.impl;

import com.coldchain.dao.SellerMapper;
import com.coldchain.entity.Seller;
import com.coldchain.service.SellerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 卖家用户表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-11-14
 */
@Service("sellerService")
public class SellerServiceImpl extends ServiceImpl<SellerMapper, Seller> implements SellerService {
}
