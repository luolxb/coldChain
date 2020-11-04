package com.coldchain.project.business.card.service;

import com.coldchain.project.business.card.domain.NtsCardInfo;
import com.coldchain.project.business.card.domain.NtsCardInfoVo;
import com.coldchain.project.business.user.domain.NtsUser;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.coldchain.project.business.card.service
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 16:50
 **/
public interface NtsCardInfoService {

    /**
     * 根据iccid获取4G卡信息
     *
     * @param iccid
     * @return
     */
    List<NtsCardInfoVo> getCardInfoByIccid(String iccid);

    /**
     * 新增4G卡信息
     *
     * @param cardInfo
     * @return
     */
    Integer insertCardInfo(NtsCardInfo cardInfo);

    /**
     * 查询卡是否存在，然后新增
     *
     * @param iccid
     * @return
     */
    Integer getAndInsertCardInfo(String iccid, NtsUser loginUser, Long deviceId) throws ParseException;

    /**
     * 查询卡是否存在，然后新增
     *
     * @return
     */
    List getCardNoList();

    /**
     * 修改卡基本信息
     */
    void updateCardInfo();

    /**
     * 获取物联卡的状态
     *
     * @param userId
     * @return
     */
    Map<String, Object> getCardStatus(Long userId);
}
