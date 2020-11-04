package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.DepositCertificateMapper;
import com.coldchain.dao.SellerMapper;
import com.coldchain.entity.DepositCertificate;
import com.coldchain.entity.Seller;
import com.coldchain.service.DepositCertificateService;
import com.coldchain.service.SellerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 卖家用户表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-11-14
 */
@Service("DepositCertificateService")
public class DepositCertificateServiceImpl extends ServiceImpl<DepositCertificateMapper, DepositCertificate> implements DepositCertificateService {
}

