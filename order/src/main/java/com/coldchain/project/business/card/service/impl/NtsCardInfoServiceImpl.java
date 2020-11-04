package com.coldchain.project.business.card.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.exception.NtsException;
import com.coldchain.project.business.card.domain.NtsCardInfo;
import com.coldchain.project.business.card.domain.NtsCardInfoVo;
import com.coldchain.project.business.card.mapper.NtsCardInfoMapper;
import com.coldchain.project.business.card.service.NtsCardInfoOutService;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.user.domain.NtsUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.coldchain.project.business.card.service.impl
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 16:51
 **/
@Service
@Slf4j
public class NtsCardInfoServiceImpl implements NtsCardInfoService {

    @Autowired
    private NtsCardInfoMapper ntsCardInfoMapper;

    @Autowired
    private NtsCardInfoOutService ntsCardInfoOutService;

    /**
     * 根据iccid获取4G卡信息
     *
     * @param iccid
     * @return
     */
    @Override
    public List<NtsCardInfoVo> getCardInfoByIccid(String iccid) {
        NtsCardInfo ntsCardInfo = new NtsCardInfo();
        ntsCardInfo.setIccId(iccid);
        List<NtsCardInfoVo> cardInfoVos = ntsCardInfoMapper.selectNtsCardInfoList(ntsCardInfo);
        return cardInfoVos;
    }

    /**
     * 新增4G卡信息
     *
     * @param cardInfo
     */
    @Override
    public Integer insertCardInfo(NtsCardInfo cardInfo) {
        return ntsCardInfoMapper.insertCardInfo(cardInfo);
    }


    /**
     * 查询卡是否存在，然后新增
     *
     * @param iccid
     * @return
     */
    @Override
    public Integer getAndInsertCardInfo(String iccid, NtsUser loginUser, Long deviceId) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 根据 iccid 获取 物联卡是否存在
        List<NtsCardInfoVo> ntsCardInfoVos = this.getCardInfoByIccid(iccid);

        if (!CollectionUtils.isEmpty(ntsCardInfoVos)) {
            throw new NtsException("物联卡已存在");
        }
        // 调用第三方平台接口获取物联卡信息
        JSONObject cardInfo = (JSONObject) ntsCardInfoOutService.getCardInfo(iccid);
        NtsCardInfo ntsCardInfo = new NtsCardInfo();
        ntsCardInfo.setCreateTime(new Date());
        ntsCardInfo.setUserId(loginUser.getUserId());
        ntsCardInfo.setCompanyId(loginUser.getCompanyId());
        ntsCardInfo.setDeviceId(deviceId);
        // 将获取到信息json 封装到ntsCardInfo对象中
        parseJson(simpleDateFormat, cardInfo, ntsCardInfo);
        // 保存到数据库中
        Integer integer = this.insertCardInfo(ntsCardInfo);
        log.info("getAndInsertCardInfo == > {}", integer);
        return integer;
    }

    /**
     * 解析json
     *
     * @param simpleDateFormat
     * @param cardInfo
     * @param ntsCardInfo
     * @throws ParseException
     */
    private void parseJson(SimpleDateFormat simpleDateFormat, JSONObject cardInfo, NtsCardInfo ntsCardInfo) throws ParseException {
        ntsCardInfo.setMsisdn((String) cardInfo.get("msisdn"));
        ntsCardInfo.setIccId((String) cardInfo.get("iccid"));
        ntsCardInfo.setImsi((String) cardInfo.get("imsi"));
        ntsCardInfo.setCarrier((String) cardInfo.get("carrier"));
        ntsCardInfo.setSpCode((String) cardInfo.get("sp_code"));
        ntsCardInfo.setDataPlan((String) cardInfo.get("data_plan"));
        ntsCardInfo.setExpiryDate(simpleDateFormat.parse((String) cardInfo.get("expiry_date")));
        ntsCardInfo.setDataUsage((String) cardInfo.get("data_usage"));
        ntsCardInfo.setAccountStatus((String) cardInfo.get("account_status"));
        ntsCardInfo.setActive((Boolean) cardInfo.get("active") == true ? 1 : 0);
        ntsCardInfo.setTestValidDate(simpleDateFormat.parse((String) cardInfo.get("test_valid_date")));
        ntsCardInfo.setSilentValidDate(simpleDateFormat.parse((String) cardInfo.get("silent_valid_date")));
        ntsCardInfo.setOutboundDate(simpleDateFormat.parse((String) cardInfo.get("outbound_date")));
        ntsCardInfo.setActiveDate(cardInfo.get("active_date") == null ? null : simpleDateFormat.parse((String) cardInfo.get("active_date")));
        ntsCardInfo.setSupportSms((Boolean) cardInfo.get("support_sms") == true ? 1 : 0);
        ntsCardInfo.setDataBalance((String) cardInfo.get("data_balance"));
        ntsCardInfo.setTestUsedDataUsage((String) cardInfo.get("test_used_data_usage"));
    }


    /**
     * 获取全部物联网
     *
     * @return
     */
    @Override
    public List getCardNoList() {
        return ntsCardInfoOutService.getCardNoList();
    }

    /**
     * 修改卡基本信息
     */
    @Override
    public void updateCardInfo() {
        List<NtsCardInfoVo> cardInfoVos = this.getCardInfoByIccid(null);
        cardInfoVos.forEach(cardInfoVo -> {
            JSONObject cardInfo = (JSONObject) ntsCardInfoOutService.getCardInfo(cardInfoVo.getIccId());
            NtsCardInfo ntsCardInfo = new NtsCardInfo();
            ntsCardInfo.setUpdateTime(new Date());
            ntsCardInfo.setId(cardInfoVo.getId());
            try {
                // 解析json
                parseJson(new SimpleDateFormat("yyyy-MM-dd"), cardInfo, ntsCardInfo);
            } catch (ParseException e) {
                e.printStackTrace();
                log.error("解析时间异常", e);
            }
            Integer integer = ntsCardInfoMapper.updateCardInfo(ntsCardInfo);
            if (integer <= 0) {
                throw new NtsException("修改物联卡信息失败");
            }
        });

    }

    /**
     * 获取物联卡的状态
     *
     * @param userId
     * @return
     */
    @Override
    public Map<String, Object> getCardStatus(Long userId) {
        return ntsCardInfoMapper.getSatStatus(userId);
    }


}
