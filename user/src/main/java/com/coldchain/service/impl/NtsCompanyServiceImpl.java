package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsCompanyMapper;
import com.coldchain.entity.NtsCompany;
import com.coldchain.entity.NtsUserCompany;
import com.coldchain.entity.vo.NtsCompanyRq;
import com.coldchain.entity.vo.NtsCompanyVo;
import com.coldchain.service.CommonSequenceService;
import com.coldchain.service.NtsCompanyService;
import com.coldchain.service.NtsUserCompanyService;
import com.common.dto.NtsCompanyDto;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.NtsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class NtsCompanyServiceImpl extends ServiceImpl<NtsCompanyMapper, NtsCompany> implements NtsCompanyService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private NtsUserCompanyService userCompanyService;

    @Autowired
    private CommonSequenceService commonSequenceService;

    /**
     * 企业树
     *
     * @param companyId
     * @return
     */
    @Override
    public List<NtsCompanyVo> tree(Long companyId, Long userId,String companyName) {
        // 全部
        List<NtsCompanyVo> ntsCompanyVoList = this.baseMapper.tree(companyId, userId,companyName);
        // 根节点
        List<NtsCompanyVo> rootList = ntsCompanyVoList
                .stream()
                .filter(companyVo ->
                        !ntsCompanyVoList
                                .stream()
                                .map(NtsCompanyVo::getId)
                                .collect(Collectors.toList())
                                .contains(companyVo.getParentId()))
                .collect(Collectors.toList());

        getChild(ntsCompanyVoList, rootList);
        return rootList;
    }

    /**
     * 新增企业
     *
     * @param companyRq
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(NtsCompanyRq companyRq) {
        UserDto userDto = authenticationFacade.getUser();
        // 判断存证是否已经存证了
        checkCreateParam(companyRq);
        NtsCompany ntsCompany = new NtsCompany();
        BeanUtils.copyProperties(companyRq, ntsCompany);
        ntsCompany.setCreateTime(new Date());
        ntsCompany.setCreateBy(userDto.getNickname());
        // 新增企业
        this.save(ntsCompany);

        // 新增企业用户关联
        NtsUserCompany ntsUserCompany = new NtsUserCompany();
        ntsUserCompany.setCompanyId(ntsCompany.getId());
        ntsUserCompany.setUserId(userDto.getUserId());
        userCompanyService.save(ntsUserCompany);
    }

    @Override
    public NtsCompanyDto getGroupCompany(Integer userId) {
        return this.baseMapper.getGroupCompany(userId, null);
    }

    @Override
    public NtsCompanyDto getCompany(Long companyId) {
        Integer userId = null;
        if (companyId == null) {
            UserDto userDto = authenticationFacade.getUser();
            userId = userDto.getUserId();
        }
        return this.baseMapper.getGroupCompany(userId, companyId);
    }

    @Override
    public NtsCompanyVo userManagerCompanyDetail(Integer userId) {
        return this.baseMapper.userManagerCompanyDetail(userId);
    }

    /**
     * 企业分页
     *
     * @param companyName
     * @param companyPhone
     * @param status
     * @param start
     * @param end
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<NtsCompanyVo> serverPage(String companyName, String companyPhone, Integer status, Integer start, Integer end, Integer page, Integer size) {
        Page<NtsCompanyVo> ntsCompanyVoPage = new Page<>(page, size);
        List<NtsCompanyVo> ntsCompanyVoList = this.baseMapper.serverPage(ntsCompanyVoPage, companyName, companyPhone, status, start, end);
        return ntsCompanyVoPage.setRecords(ntsCompanyVoList);
    }

    /**
     * 服务端审核客户端新增的企业
     *
     * @param companyRq
     */
    @Override
    public void audit(NtsCompanyRq companyRq) {
        UserDto userDto = authenticationFacade.getUser();
        if (companyRq.getId() == null) {
            throw new ShopException(-1, "企业ID不能为空");
        }
        NtsCompany ntsCompany = this.getById(companyRq.getId());
        if (ntsCompany == null) {
            throw new ShopException(-1, "企业信息不存在");
        }
        // 判断企业状态
        if (ntsCompany.getAuditStatus() == 1) {
            throw new ShopException(-1, "企业状态错误");
        }
        ntsCompany.setCompanyCode(commonSequenceService.getCommonSequence(NtsUtil.generateCode(4) + "_c", null, 5, "\\'nts_company'\\"));
        ntsCompany.setAuditStatus(1);
        ntsCompany.setAuditBy(userDto.getNickname());
        ntsCompany.setUpdateTime(new Date());
        ntsCompany.setUpdateBy(userDto.getNickname());

        this.updateById(ntsCompany);

    }

    /**
     * 判断存证是否已经企业
     *
     * @param companyRq
     */
    private void checkCreateParam(NtsCompanyRq companyRq) {
        NtsCompany companyName = this.baseMapper.selectOne(new QueryWrapper<NtsCompany>().eq("company_name", companyRq.getCompanyName()));
        if (null != companyName) {
            throw new ShopException(-1, "企业名称已经存在");
        }
        NtsCompany socialCreditCode = this.baseMapper.selectOne(new QueryWrapper<NtsCompany>().eq("social_credit_code", companyRq.getSocialCreditCode()));
        if (null != socialCreditCode) {
            throw new ShopException(-1, "社会信用代码已经存在");
        }
        NtsCompany address = this.baseMapper.selectOne(new QueryWrapper<NtsCompany>().eq("company_address", companyRq.getCompanyAddress()));
        if (null != address) {
            throw new ShopException(-1, "企业地址已经存在");
        }
        NtsCompany phone = this.baseMapper.selectOne(new QueryWrapper<NtsCompany>().eq("company_phone", companyRq.getCompanyPhone()));
        if (null != phone) {
            throw new ShopException(-1, "企业电话已经存在");
        }

        boolean phone1 = NtsUtil.isPhone(companyRq.getCompanyPhone());
        if (!phone1) {
            throw new ShopException(-1, "手机格式不正确");
        }
    }

    /**
     * 递归获取子集
     *
     * @param ntsCompanyVoList
     * @param rootList
     */
    private void getChild(List<NtsCompanyVo> ntsCompanyVoList, List<NtsCompanyVo> rootList) {
        // 给上级新增下级
        rootList.forEach(root -> {
            // 获取子集
            List<NtsCompanyVo> companyVoList = ntsCompanyVoList
                    .stream()
                    .filter(companyVo -> companyVo.getParentId().equals(root.getId()))
                    .collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(companyVoList)) {
                root.setChildren(companyVoList);
                getChild(ntsCompanyVoList, companyVoList);
            }
        });
    }
}
