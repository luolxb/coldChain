package com.coldchain.project.business.cardlog.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.card.domain.NtsCardInfoVo;
import com.coldchain.project.business.card.service.NtsCardInfoOutService;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.cardlog.domain.NtsCardUsagedLog;
import com.coldchain.project.business.cardlog.mapper.NtsCardUsagedLogMapper;
import com.coldchain.project.business.cardlog.service.INtsCardUsagedLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 物联网卡使用日志Service业务层处理
 *
 * @author nts
 * @date 2020-04-14
 */
@Service
public class NtsCardUsagedLogServiceImpl implements INtsCardUsagedLogService {
    @Autowired
    private NtsCardUsagedLogMapper ntsCardUsagedLogMapper;

    @Autowired
    private NtsCardInfoOutService cardInfoOutService;

    @Autowired
    private NtsCardInfoService cardInfoService;

    /**
     * 查询物联网卡使用日志
     *
     * @param id 物联网卡使用日志ID
     * @return 物联网卡使用日志
     */
    @Override
    public NtsCardUsagedLog selectNtsCardUsagedLogById(Long id) {
        return ntsCardUsagedLogMapper.selectNtsCardUsagedLogById(id);
    }

    /**
     * 查询物联网卡使用日志列表
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 物联网卡使用日志
     */
    @Override
    public List<NtsCardUsagedLog> selectNtsCardUsagedLogList(NtsCardUsagedLog ntsCardUsagedLog) {
        return ntsCardUsagedLogMapper.selectNtsCardUsagedLogList(ntsCardUsagedLog);
    }

    /**
     * 新增物联网卡使用日志
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 结果
     */
    @Override
    public int insertNtsCardUsagedLog(NtsCardUsagedLog ntsCardUsagedLog) {
        ntsCardUsagedLog.setCreateTime(DateUtils.getNowDate());
        return ntsCardUsagedLogMapper.insertNtsCardUsagedLog(ntsCardUsagedLog);
    }

    /**
     * 修改物联网卡使用日志
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 结果
     */
    @Override
    public int updateNtsCardUsagedLog(NtsCardUsagedLog ntsCardUsagedLog) {
        ntsCardUsagedLog.setUpdateTime(DateUtils.getNowDate());
        return ntsCardUsagedLogMapper.updateNtsCardUsagedLog(ntsCardUsagedLog);
    }

    /**
     * 删除物联网卡使用日志对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNtsCardUsagedLogByIds(String ids) {
        return ntsCardUsagedLogMapper.deleteNtsCardUsagedLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除物联网卡使用日志信息
     *
     * @param id 物联网卡使用日志ID
     * @return 结果
     */
    @Override
    public int deleteNtsCardUsagedLogById(Long id) {
        return ntsCardUsagedLogMapper.deleteNtsCardUsagedLogById(id);
    }

    /**
     * 物联卡用量日志
     * 物联卡当月或指定月份用量日志查询
     *
     * @return
     */
    @Override
    public List getCardUsagelog(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 物联卡表所有的卡信息
        List<NtsCardInfoVo> cardInfoVos = cardInfoService.getCardInfoByIccid(null);
        cardInfoVos.forEach(cardInfoVo -> {
            List<JSONObject> cardUsagelogs = (List<JSONObject>)cardInfoOutService.getCardUsagelog(cardInfoVo.getIccId(), date);

            // 保存数据到数据库
            cardUsagelogs.forEach(cardUsagelog ->{
                NtsCardUsagedLog ntsCardUsagedLog = new NtsCardUsagedLog();
                ntsCardUsagedLog.setCardId(cardInfoVo.getId());
                try {
                    ntsCardUsagedLog.setDate(simpleDateFormat.parse((String)cardUsagelog.get("date")));
                } catch (ParseException e) {
                    e.printStackTrace();
                    throw new NtsException("时间转换发生异常");
                }
                List<NtsCardUsagedLog> cardUsagedLogs = ntsCardUsagedLogMapper.selectNtsCardUsagedLogList(ntsCardUsagedLog);
                ntsCardUsagedLog.setDataUsage((String) cardUsagelog.get("data_usage"));
                if (CollectionUtils.isEmpty(cardUsagedLogs)) {
                    ntsCardUsagedLog.setCreateTime(DateUtils.getNowDate());
                    int i = ntsCardUsagedLogMapper.insertNtsCardUsagedLog(ntsCardUsagedLog);
                    if (i <= 0) {
                        throw new NtsException("新增物联卡用量日志失败 insertNtsCardUsagedLog");
                    }
                } else {
                    ntsCardUsagedLog.setId(cardUsagedLogs.get(0).getId());
                    ntsCardUsagedLog.setUpdateTime(DateUtils.getNowDate());
                    int i = ntsCardUsagedLogMapper.updateNtsCardUsagedLog(ntsCardUsagedLog);
                    if (i <= 0) {
                        throw new NtsException("新增物联卡用量日志失败 updateNtsCardUsagedLog");
                    }
                }
            });
        });

        return cardInfoVos;
    }
}
