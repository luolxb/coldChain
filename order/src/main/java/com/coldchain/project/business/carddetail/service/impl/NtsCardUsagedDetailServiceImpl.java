package com.coldchain.project.business.carddetail.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.card.domain.NtsCardInfoVo;
import com.coldchain.project.business.card.service.NtsCardInfoOutService;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.carddetail.domain.NtsCardUsagedDetail;
import com.coldchain.project.business.carddetail.mapper.NtsCardUsagedDetailMapper;
import com.coldchain.project.business.carddetail.service.INtsCardUsagedDetailService;
import com.coldchain.project.business.device.vo.FlowAggSumVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 物联卡流量使用使用详情Service业务层处理
 * 
 * @author nts
 * @date 2020-04-14
 */
@Service
public class NtsCardUsagedDetailServiceImpl implements INtsCardUsagedDetailService 
{
    @Autowired
    private NtsCardUsagedDetailMapper ntsCardUsagedDetailMapper;

    @Autowired
    private NtsCardInfoOutService cardInfoOutService;

    @Autowired
    private NtsCardInfoService cardInfoService;

    /**
     * 查询物联卡流量使用使用详情
     * 
     * @param id 物联卡流量使用使用详情ID
     * @return 物联卡流量使用使用详情
     */
    @Override
    public NtsCardUsagedDetail selectNtsCardUsagedDetailById(Long id)
    {
        return ntsCardUsagedDetailMapper.selectNtsCardUsagedDetailById(id);
    }

    /**
     * 查询物联卡流量使用使用详情列表
     * 
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 物联卡流量使用使用详情
     */
    @Override
    public List<NtsCardUsagedDetail> selectNtsCardUsagedDetailList(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        return ntsCardUsagedDetailMapper.selectNtsCardUsagedDetailList(ntsCardUsagedDetail);
    }

    /**
     * 新增物联卡流量使用使用详情
     * 
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 结果
     */
    @Override
    public int insertNtsCardUsagedDetail(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        ntsCardUsagedDetail.setCreateTime(DateUtils.getNowDate());
        return ntsCardUsagedDetailMapper.insertNtsCardUsagedDetail(ntsCardUsagedDetail);
    }

    /**
     * 修改物联卡流量使用使用详情
     * 
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 结果
     */
    @Override
    public int updateNtsCardUsagedDetail(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        ntsCardUsagedDetail.setUpdateTime(DateUtils.getNowDate());
        return ntsCardUsagedDetailMapper.updateNtsCardUsagedDetail(ntsCardUsagedDetail);
    }

    /**
     * 删除物联卡流量使用使用详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNtsCardUsagedDetailByIds(String ids)
    {
        return ntsCardUsagedDetailMapper.deleteNtsCardUsagedDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除物联卡流量使用使用详情信息
     * 
     * @param id 物联卡流量使用使用详情ID
     * @return 结果
     */
    @Override
    public int deleteNtsCardUsagedDetailById(Long id)
    {
        return ntsCardUsagedDetailMapper.deleteNtsCardUsagedDetailById(id);
    }

    /**
     * 物联卡查询指定月份每日使用量
     *
     * @param date
     * @return
     */
    @Override
    @Transactional
    public List getCardUsagedelta( String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 物联卡表所有的卡信息
        List<NtsCardInfoVo> cardInfoVos = cardInfoService.getCardInfoByIccid(null);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");

        cardInfoVos.forEach(cardInfoVo -> {
            List<JSONObject> cardUsagedeltas = (List<JSONObject>)cardInfoOutService.getCardUsagedelta(cardInfoVo.getIccId(), date);

            // 查询数据库是否有本月数据
            NtsCardUsagedDetail ntsCardUsagedDetail2 = new NtsCardUsagedDetail();
            ntsCardUsagedDetail2.setDate(new Date());
            ntsCardUsagedDetail2.setCardId(cardInfoVo.getId());
            List<NtsCardUsagedDetail> ntsCardUsagedDetails = ntsCardUsagedDetailMapper.selectNtsCardUsagedDetailList2(ntsCardUsagedDetail2);

            // 保存数据到数据库
            cardUsagedeltas.forEach(cardUsagedelta ->{
                NtsCardUsagedDetail ntsCardUsagedDetail = new NtsCardUsagedDetail();
                ntsCardUsagedDetail.setCardId(cardInfoVo.getId());
                try {
                    ntsCardUsagedDetail.setDate(simpleDateFormat.parse((String)cardUsagedelta.get("date")));
                } catch (ParseException e) {
                    e.printStackTrace();
                    throw new NtsException("时间转换发生异常");
                }
                ntsCardUsagedDetail.setDataUsage((String) cardUsagedelta.get("data_usage"));

                // 如果是每个月的1号就新增，否则修改
                if (StringUtils.equals("01",dateFormat.format(new Date())) ||
                        StringUtils.equals("1",dateFormat.format(new Date())) ||
                        CollectionUtils.isEmpty(ntsCardUsagedDetails)) {
                    ntsCardUsagedDetail.setCreateTime(DateUtils.getNowDate());
                    int i = ntsCardUsagedDetailMapper.insertNtsCardUsagedDetail(ntsCardUsagedDetail);
                    if (i <= 0) {
                        throw new NtsException("新增物联卡用量日志失败");
                    }
                } else {
                    ntsCardUsagedDetail.setUpdateTime(DateUtils.getNowDate());
                    ntsCardUsagedDetailMapper.updateNtsCardUsagedDetailByIccIdAndDate(ntsCardUsagedDetail);
                }
            });
        });

        return cardInfoVos;
    }


    /**
     * 4G流量统计日志详情
     *
     * @param iccId
     * @param startDate
     * @param overDate
     * @return
     */
    @Override
    public List<FlowAggSumVo> flow4GLogDetail(String iccId, String startDate, String overDate) {
        if (StringUtils.isBlank(overDate)) {
            overDate = DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        }
        List<FlowAggSumVo> flowAggSumVoList = ntsCardUsagedDetailMapper.flow4GLogDetail(iccId,startDate,overDate);

        return flowAggSumVoList;
    }
}
