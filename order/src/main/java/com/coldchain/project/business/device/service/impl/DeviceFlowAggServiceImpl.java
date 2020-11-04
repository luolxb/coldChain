package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.device.domain.CompanyFlowDetailVo;
import com.coldchain.project.business.device.domain.DeviceFlowAgg;
import com.coldchain.project.business.device.mapper.DeviceFlowAggMapper;
import com.coldchain.project.business.device.service.IDeviceFlowAggService;
import com.coldchain.project.business.device.vo.FlowAggListVo;
import com.coldchain.project.business.device.vo.FlowAggSumVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 设备流量日志统计Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceFlowAggServiceImpl implements IDeviceFlowAggService {
    @Autowired
    private DeviceFlowAggMapper deviceFlowAggMapper;

    /**
     * 查询设备流量日志统计
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 设备流量日志统计
     */
    @Override
    public DeviceFlowAgg selectDeviceFlowAggById(Long deviceFlowAggId) {
        return deviceFlowAggMapper.selectDeviceFlowAggById(deviceFlowAggId);
    }

    /**
     * 查询设备流量日志统计列表
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 设备流量日志统计
     */
    @Override
    public List<DeviceFlowAgg> selectDeviceFlowAggList(DeviceFlowAgg deviceFlowAgg) {
        return deviceFlowAggMapper.selectDeviceFlowAggList(deviceFlowAgg);
    }

    /**
     * 新增设备流量日志统计
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 结果
     */
    @Override
    public int insertDeviceFlowAgg(DeviceFlowAgg deviceFlowAgg) {
        deviceFlowAgg.setCreateTime(DateUtils.getNowDate());
        return deviceFlowAggMapper.insertDeviceFlowAgg(deviceFlowAgg);
    }

    /**
     * 修改设备流量日志统计
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 结果
     */
    @Override
    public int updateDeviceFlowAgg(DeviceFlowAgg deviceFlowAgg) {
        return deviceFlowAggMapper.updateDeviceFlowAgg(deviceFlowAgg);
    }

    /**
     * 删除设备流量日志统计对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowAggByIds(String ids) {
        return deviceFlowAggMapper.deleteDeviceFlowAggByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备流量日志统计信息
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowAggById(Long deviceFlowAggId) {
        return deviceFlowAggMapper.deleteDeviceFlowAggById(deviceFlowAggId);
    }

    /**
     * 根据流量统计列表
     *
     * @param deviceSn  设备SN
     * @param companyId 公司ID
     * @return 结果
     */
    @Override
    public List<FlowAggListVo> queryFlowAggList(String deviceSn, Long companyId) {
        return deviceFlowAggMapper.queryFlowAggList(deviceSn, companyId);
    }

    /**
     * 批量新增设备流量日志统计
     *
     * @param deviceFlowAggList 设备流量日志统计列表
     * @return 结果
     */
    @Override
    public int addDeviceFlowAgg(List<DeviceFlowAgg> deviceFlowAggList) {
        return deviceFlowAggMapper.addDeviceFlowAgg(deviceFlowAggList);
    }

    /**
     * 查询流量统计累计
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    @Override
    public List<FlowAggSumVo> queryFlowAggSum(String subscriberId, String startDate, String overDate, Long companyId) {
        return deviceFlowAggMapper.queryFlowAggSum(subscriberId, startDate, overDate, companyId);
    }

    /**
     * 根据订阅ID(设备SN）流量统计日志列表
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    @Override
    public List<FlowAggSumVo> queryFlowAggSumLog(String subscriberId, String startDate, String overDate) {
        return deviceFlowAggMapper.queryFlowAggSumLog(subscriberId, startDate, overDate);
    }

    /**
     * 获取4G卫星流量使用
     *
     * @param userId
     * @return
     */
    @Override
    public List<Index4GStaUseDataVo> get4GSatUseData(Long userId) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date d = c.getTime();
        String startDate = format.format(d);
        List<Index4GStaUseDataVo> gSatUseData = deviceFlowAggMapper.get4GSatUseData(userId, startDate, DateFormatUtils.format(new Date(), "yyyy-MM"));
        // 新建容器 存放新数据
        List<Index4GStaUseDataVo> gSatUseData1 = new ArrayList<>();

        getDateList(format, startDate, gSatUseData, gSatUseData1);
        return gSatUseData1;
    }

    private static int getMonthNum(Date start, Date end) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(start);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(end);
        return (cal2.get(1) - cal1.get(1)) * 12 + (cal2.get(2) - cal1.get(2));
    }

    /**
     * 获取4G卫星流量使用详情
     *
     * @param deviceSn
     * @return
     */
    @Override
    public List<Index4GStaUseDataVo> get4GSatUseFlow(String deviceSn, Long companyId) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date d = c.getTime();
        String startDate = format.format(d);
        String overDate = DateFormatUtils.format(new Date(), "yyyy-MM");

        List<Index4GStaUseDataVo> dataVoList = deviceFlowAggMapper.get4GSatUseFlow(deviceSn, companyId, startDate, overDate);

        List<Index4GStaUseDataVo> dataVoList1 = new ArrayList<>();

        getDateList(format, startDate, dataVoList, dataVoList1);
        return dataVoList1;
    }

    @Override
    public List<FlowAggSumVo> get4GSatUseFlow2(String deviceSn, Long companyId) {
        return deviceFlowAggMapper.get4GSatUseFlow2(deviceSn, companyId);
    }

    /**
     * 获取企业流量详情
     *
     * @param companyId
     * @return
     */
    @Override
    public List<Index4GStaUseDataVo>  getCompanyFlowDetail(String companyId) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date d = c.getTime();
        String startDate = format.format(d);
        String overDate = DateFormatUtils.format(new Date(), "yyyy-MM");

        List<Index4GStaUseDataVo> dataVoList = deviceFlowAggMapper.getCompanyFlowDetail(companyId, startDate, overDate);

        List<Index4GStaUseDataVo> dataVoList1 = new ArrayList<>();

        getDateList(format, startDate, dataVoList, dataVoList1);
        return dataVoList1;
    }

    private void getDateList(SimpleDateFormat format, String startDate, List<Index4GStaUseDataVo> dataVoList, List<Index4GStaUseDataVo> dataVoList1) throws ParseException {
        if (dataVoList == null || dataVoList.size() == 0) {
            for (int i = 0; i < 13; i++) {
                Index4GStaUseDataVo index4GStaUseDataVo = new Index4GStaUseDataVo();
                getIndex4GStaUseDataVo(format, startDate, i, index4GStaUseDataVo);
                index4GStaUseDataVo.setSumCard(null);
                index4GStaUseDataVo.setSumSat(null);
                dataVoList1.add(index4GStaUseDataVo);
            }
        } else {
            // 遍历 获取到数据
            for (int j = 0; j < dataVoList.size(); j++) {
                // 计算最后一条数据到现在
                if (StringUtils.equals(dataVoList.get(j).getDate(), dataVoList.get(dataVoList.size() - 1).getDate())) {
                    int monthNum = getMonthNum(format.parse(startDate), new Date());

                    for (int i = 0; i < monthNum + 1; i++) {
                        Index4GStaUseDataVo index4GStaUseDataVo = new Index4GStaUseDataVo();
                        Calendar calendar = Calendar.getInstance();
                        Date parse = format.parse(startDate);
                        calendar.setTime(parse);
                        calendar.add(Calendar.MONTH, i);
                        Date time = calendar.getTime();
                        String date1 = DateFormatUtils.format(time,"yyyy-MM");
                        index4GStaUseDataVo.setDate(date1);
                        if (StringUtils.equals(date1, dataVoList.get(dataVoList.size() - 1).getDate())) {
                            index4GStaUseDataVo.setSumCard(dataVoList.get(dataVoList.size() - 1).getSumCard());
                            index4GStaUseDataVo.setSumSat(dataVoList.get(dataVoList.size() - 1).getSumCard());
                        } else {
                            index4GStaUseDataVo.setSumCard(null);
                            index4GStaUseDataVo.setSumSat(null);
                        }
                        dataVoList1.add(index4GStaUseDataVo);
                    }
                    break;
                }

                String date = dataVoList.get(j).getDate();
                int monthNum = getMonthNum(format.parse(startDate), format.parse(date));

                for (int i = 0; i < monthNum; i++) {
                    Index4GStaUseDataVo index4GStaUseDataVo = new Index4GStaUseDataVo();
                    getIndex4GStaUseDataVo(format, startDate, i, index4GStaUseDataVo);
                    index4GStaUseDataVo.setSumCard(null);
                    index4GStaUseDataVo.setSumSat(null);
                    dataVoList1.add(index4GStaUseDataVo);
                }
                dataVoList1.add(dataVoList.get(j));

                Calendar calendar = Calendar.getInstance();
                Date parse = format.parse(dataVoList.get(j).getDate());
                calendar.setTime(parse);
                calendar.add(Calendar.MONTH, 1);
                Date time = calendar.getTime();
                startDate = format.format(time);
            }
        }
    }

    private void getIndex4GStaUseDataVo(SimpleDateFormat format, String startDate, int i, Index4GStaUseDataVo index4GStaUseDataVo) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Date parse = format.parse(startDate);
        calendar.setTime(parse);
        calendar.add(Calendar.MONTH, i);
        Date time = calendar.getTime();
        String date1 = DateFormatUtils.format(time, "yyyy-MM");
        index4GStaUseDataVo.setDate(date1);
    }

    @Override
    public CompanyFlowDetailVo getCompanyFlowDetail2(String companyId) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date d = c.getTime();
        String startDate = format.format(d);
        String overDate = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
        CompanyFlowDetailVo  companyFlowDetailVo = deviceFlowAggMapper.getCompanyFlowDetail2(companyId, startDate, overDate);

        return companyFlowDetailVo;
    }

}
