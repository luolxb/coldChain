package com.coldchain.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpDeviceMapper;
import com.coldchain.entity.*;
import com.coldchain.entity.vo.*;
import com.coldchain.repository.CpDeviceEsRepository;
import com.coldchain.service.CpDeviceCorrelationSensorService;
import com.coldchain.service.CpDeviceGroupService;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorService;
import com.coldchain.utils.FormatTime;
import com.coldchain.utils.RedisUtils;
import com.common.dto.*;
import com.common.exception.ShopException;
import com.common.utils.HttpClientUtil;
import com.common.utils.RedisKey;
import com.common.utils.StringUtil;
import com.common.utils.TLinkUtil;
import com.common.vo.SBApi;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.coldchain.entity.vo.CpDeviceDto;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.spring.web.json.Json;
import sun.management.Sensor;

import javax.validation.Valid;
import java.util.*;


/**
 * 设备表(CpDevice)表服务实现类
 *
 * @author makejava
 * @since 2020-10-10 11:39:41
 */
@Service("cpDeviceService")
public class CpDeviceServiceImpl extends ServiceImpl<CpDeviceMapper, CpDevice> implements CpDeviceService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private CpSensorService cpSensorService;

    @Autowired
    private CpDeviceGroupService cpDeviceGroupService;

    @Autowired
    private CpDeviceCorrelationSensorService cpDeviceCorrelationSensorService;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private CpDeviceEsRepository cpDeviceEsRepository;


    @Override
    @Transactional(readOnly = true)
    public Page<com.common.dto.CpDeviceDto> devicePageByProjectId(Integer page, Integer size, Long projectId, String deviceName, Long start, Long end) {
        Page<com.common.dto.CpDeviceDto> cpDeviceDtoPage = new Page<>(page, size);
        List<com.common.dto.CpDeviceDto> cpDeviceDtos = this.baseMapper.devicePageByProjectId(cpDeviceDtoPage, projectId, deviceName, start, end);
        return cpDeviceDtoPage.setRecords(cpDeviceDtos);
    }

    @Override
    public List<com.common.dto.CpDeviceDto> devicePageByProjectId(Long projectId) {
        return this.baseMapper.devicePageByProjectId(null, projectId, null, null, null);

    }

    @Override
    @Transactional(readOnly = true)
    public List<CpDeviceVo> noUseDevice() {
        UserDto user = authenticationFacade.getUser();
        return this.baseMapper.noUseDevice(user.getUserId());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SBApi insertDevice(CpDevice cpDeviceRq) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/addDevice";
        Map<String, String> header = new HashMap<String, String>();
        header.put("accesstoken", "Bearer" + TLinkUtil.getoken());
        header.put("clientId", TLinkUtil.CLIENTID);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", TLinkUtil.UserId);
        jsonObject.put("deviceName", cpDeviceRq.getDeviceName());
        jsonObject.put("linkType", cpDeviceRq.getLinkType());
        jsonObject.put("lat", cpDeviceRq.getLat());
        jsonObject.put("lng", cpDeviceRq.getLng());
        jsonObject.put("timescale", cpDeviceRq.getTimescale());
        jsonObject.put("deviceSn", cpDeviceRq.getDeviceSn());
        String jsonStr = JSONObject.toJSONString(cpDeviceRq.getSensorList());
        JSONArray obj = JSON.parseArray(jsonStr);
        jsonObject.put("sensorList", obj);
        String res = HttpClientUtil.doPost(uri, header, jsonObject);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSON.parseObject(res);
        if ("00".equals(jsonObject2.get("flag").toString())) {
            String deviceNo = (String) jsonObject2.get("deviceNo");
            Long deviceId = Long.parseLong(jsonObject2.get("deviceId") + "");
            UserDto user = authenticationFacade.getUser();
            cpDeviceRq.setId(deviceId);
            // TODO
//            cpDeviceRq.setUId(user.getUserId());
            cpDeviceRq.setOemId(user.getUserId() + "");

            cpDeviceRq.setDeviceId(deviceId);
            cpDeviceRq.setDeviceSn(deviceNo);
            Integer re = this.baseMapper.insert(cpDeviceRq);
            //获取设备传感器，保存到本地
            List<CpSenSorDo> cpSenSorDos = getSensorinfoByDevice(cpDeviceRq.getDeviceSn());
            cpSenSorDos.forEach(cpSenSorDo -> {
                CpSensor sensor = new CpSensor();
                sensor.setSensorId(Integer.parseInt(cpSenSorDo.getId()));
//                sensor.setId(StringUtil.createUUID());
                sensor.setSensorType(cpSenSorDo.getSensorTypeId().toString());
                sensor.setCreateDate(DateUtil.now());
                sensor.setDecimals(cpSenSorDo.getDecimalPlacse());
                sensor.setSensorName(cpSenSorDo.getSensorName());
                sensor.setDeviceId(deviceId.toString());
                cpSensorService.save(sensor);
//                CpDeviceCorrelationSensor cpDeviceCorrelationSensor = new CpDeviceCorrelationSensor();
//                cpDeviceCorrelationSensor.setId(StringUtil.createUUID());
//                cpDeviceCorrelationSensor.setDeviceId(cpDeviceRq.getId());
//                cpDeviceCorrelationSensor.setSensorId(sensor.getId());
//                cpDeviceCorrelationSensorService.insertCpDeviceCorrelationSensor(cpDeviceCorrelationSensor);
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
        }
        return sbApi;
    }

    @Override
    public SBApi getDeviceByUserId(CpDeviceDto cpDeviceDto) {

        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getDevices";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", TLinkUtil.getTLinkUserId());
        paramBody.put("groupId", cpDeviceDto.getGroupId());
        paramBody.put("isDelete", cpDeviceDto.getIsDelete());
        paramBody.put("isLine", cpDeviceDto.getIsLine());
        paramBody.put("isAlarms", cpDeviceDto.getIsAlarms());
        paramBody.put("currPage", cpDeviceDto.getCurrPage());
        paramBody.put("pageSize", cpDeviceDto.getPageSize());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonObject2.get(TLinkUtil.FLAG).toString())) {
            JSONArray dataList = (JSONArray) jsonObject2.get("dataList");
            JSONArray dataList_ = new JSONArray();
            for (int i = 0; i < dataList.size(); i++) {
                JSONObject obj1 = dataList.getJSONObject(i);
                String deviceNo = obj1.getString("deviceNo");
                obj1.remove("deviceNo");
                obj1.put("deviceSn", deviceNo);
                dataList_.add(obj1);
            }
            List<CpDevice> deviceList = JSONObject.parseArray(dataList_.toJSONString(), CpDevice.class);

            deviceList.forEach(cpDevice -> {
                cpDevice.setDeviceId(Long.parseLong(cpDevice.getId() + ""));
                UpdateWrapper<CpDevice> wrapper = new UpdateWrapper<>();
                QueryWrapper<CpDevice> QueryWrapper = new QueryWrapper<>();
                QueryWrapper.eq("device_id", cpDevice.getDeviceId());
                CpDevice cpDevice_ = this.baseMapper.selectOne(QueryWrapper);
                if (cpDevice_ == null) {
                    this.baseMapper.insert(cpDevice);
                } else {
                    wrapper.eq("device_id", cpDevice.getDeviceId());
                    update(cpDevice, wrapper);
                }
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }


    @Override
    public SBApi getDeviceSensorDatas(CpDeviceDto cpDeviceDto) {

        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getDeviceSensorDatas";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", cpDeviceDto.getUserId());
        paramBody.put("groupId", cpDeviceDto.getGroupId());
        paramBody.put("isDelete", cpDeviceDto.getIsDelete());
        paramBody.put("isLine", cpDeviceDto.getIsLine());
        paramBody.put("isAlarms", cpDeviceDto.getIsAlarms());
        paramBody.put("currPage", cpDeviceDto.getCurrPage());
        paramBody.put("pageSize", cpDeviceDto.getPageSize());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonObject2.get(TLinkUtil.FLAG).toString())) {
            JSONArray dataList = (JSONArray) jsonObject2.get("dataList");
            JSONArray dataList_ = new JSONArray();
            for (int i = 0; i < dataList.size(); i++) {
                JSONObject obj1 = dataList.getJSONObject(i);

                String deviceNo = obj1.getString("deviceNo");
                obj1.remove("deviceNo");
                obj1.put("deviceSn", deviceNo);
                dataList_.add(obj1);
            }
            List<CpDevice> deviceList = JSONObject.parseArray(dataList_.toJSONString(), CpDevice.class);

            deviceList.forEach(cpDevice -> {
                cpDevice.setDeviceId(Long.parseLong(cpDevice.getId() + ""));
                UpdateWrapper<CpDevice> wrapper = new UpdateWrapper<>();
                QueryWrapper<CpDevice> QueryWrapper = new QueryWrapper<>();
                QueryWrapper.eq("device_id", cpDevice.getDeviceId());
                CpDevice cpDevice_ = this.baseMapper.selectOne(QueryWrapper);
                if (cpDevice_ == null) {
                    this.baseMapper.insert(cpDevice);
                } else {
                    wrapper.eq("device_id", cpDevice.getDeviceId());
                    this.baseMapper.update(cpDevice, wrapper);
                }
                List<CpSensor> sensorsList = cpDevice.getSensorsList();
                for (CpSensor cpSensor : sensorsList) {
                    if (cpSensor.getId().equals("0")) {
                        continue;
                    }
                    QueryWrapper<CpSensor> QueryWrapper2 = new QueryWrapper<>();
                    QueryWrapper2.eq("sensor_id", cpSensor.getId());
                    CpSensor sensor = cpSensorService.getOne(QueryWrapper2);
                    if (sensor == null) {
                        cpSensor.setSensorId(Integer.parseInt(cpSensor.getId()));
                        cpSensor.setId(null);
                        cpSensorService.save(cpSensor);
                    } else {
                        UpdateWrapper<CpSensor> wrapper_ = new UpdateWrapper<>();
                        wrapper_.eq("sensor_id", cpSensor.getId());
                        cpSensorService.update(cpSensor, wrapper_);
                    }
                }
            });
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public SBApi deleteDevcie(CpDevice cpDevice) {
//        CpDevice cpDeviceDel = this.getById(cpDevice.getId());
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/deleteDevice";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", TLinkUtil.UserId);
        paramBody.put("deviceId", cpDevice.getDeviceId());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            //删除本地设备和传感器触发器信息
            cpSensorService.deleteCpSensorByDeviceId(cpDevice.getDeviceId().toString());
            cpDeviceCorrelationSensorService.deleteDeviceCorrelationSensorByDeviceId(cpDevice.getDeviceId().toString());
            this.baseMapper.deleteById(cpDevice.getDeviceId().toString());
            //删除设备关联的传感器，和关联数据
            sbApi.setResult("");

            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }

    }

    @Override
    public CpDeviceNumberStatisticsVo getDeviceNumberTotal() {

        Integer adminId = null;
        Integer oemId = null;
        Integer uid = null;

        AdminDto adminDto = authenticationFacade.getAdmin();
        if (null == adminDto.getAdminId()) {
            SellerDto sellerDto = authenticationFacade.getSeller();
            if (null != sellerDto.getSellerId()) {
                oemId = sellerDto.getSellerId();
            } else {
                UserDto userDto = authenticationFacade.getUser();
                uid = userDto.getUserId();
            }
        }

        CpDeviceNumberStatisticsVo cpDeviceNumberStatisticsVo = new CpDeviceNumberStatisticsVo();
        Integer deviceTotal = this.baseMapper.getDeviceNumberTotal(null, null, null,adminId,oemId,uid);
        Integer isLineDeviceTotal = this.baseMapper.getDeviceNumberTotal(null, null, 1,adminId,oemId,uid);
        Integer isNotLineDeviceTotal = this.baseMapper.getDeviceNumberTotal(null, null, 0,adminId,oemId,uid);
        Integer isAlarmsDeviceTotal = this.baseMapper.getDeviceNumberTotal(1, null, null,adminId,oemId,uid);
        cpDeviceNumberStatisticsVo.setIsNotLineDeviceTotal(null == isNotLineDeviceTotal ? 0 : isNotLineDeviceTotal);
        cpDeviceNumberStatisticsVo.setIsLineDeviceTotal(null == isLineDeviceTotal ? 0 : isLineDeviceTotal);
        cpDeviceNumberStatisticsVo.setIsAlarmsDeviceTotal(null == isAlarmsDeviceTotal ? 0 : isAlarmsDeviceTotal);
        cpDeviceNumberStatisticsVo.setDeviceTotal(null == deviceTotal ? 0 : deviceTotal);
        return cpDeviceNumberStatisticsVo;
    }


    @Override
    public List<CpDeviceVo> getDeviceRealTimeLocation(String deviceName, String deviceSn, Integer status) {

        Integer adminId = null;
        Integer oemId = null;
        Integer uid = null;

        AdminDto adminDto = authenticationFacade.getAdmin();
        if (null == adminDto.getAdminId()) {
            SellerDto sellerDto = authenticationFacade.getSeller();
            if (null != sellerDto.getSellerId()) {
                oemId = sellerDto.getSellerId();
            } else {
                UserDto userDto = authenticationFacade.getUser();
                uid = userDto.getUserId();
            }
        }

        if (null != status && 0 == status) {
            return this.baseMapper.getDeviceRealTimeLocation(deviceName, deviceSn, null, null, 1,adminId,oemId,uid);
        }
        if (null != status && 1 == status) {
            return this.baseMapper.getDeviceRealTimeLocation(deviceName, deviceSn, null, null, 0,adminId,oemId,uid);
        }
        if (null != status && 2 == status) {
            return this.baseMapper.getDeviceRealTimeLocation(deviceName, deviceSn, 1, null, null,adminId,oemId,uid);
        }
        return this.baseMapper.getDeviceRealTimeLocation(deviceName, deviceSn, null, null, null,adminId,oemId,uid);
    }

    @Override
    public List<CpGroupDeviceVo> getGroupDeviceByCompany(String companyId) {
        List<CpGroupDeviceVo> cpGroupDeviceVoList = cpDeviceGroupService.getGroupByCompany(companyId);
        cpGroupDeviceVoList.forEach(cpGroupDeviceVo -> {
            List<CpDeviceVo> cpDeviceVoList = this.baseMapper.getDeviceByGroupId(cpGroupDeviceVo.getId());
            cpGroupDeviceVo.setCpDeviceVoList(cpDeviceVoList);
        });
        return cpGroupDeviceVoList;
    }

    @Override
    public Integer update1(CpDevice cpDevice) {
        return this.baseMapper.update1(cpDevice);
    }

    @Override
    public List<com.common.dto.CpDeviceDto> getDeviceListByGroupId(String deviceGroupId) {
        return this.baseMapper.getDeviceListByGroupId(null, deviceGroupId,null,null);
    }


    private List<CpSenSorDo> getSensorinfoByDevice(String deviceNo) {

        String uri = "https://app.dtuip.com/api/device/getSingleDeviceDatas";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceNo", deviceNo);
        paramBody.put("userId", TLinkUtil.UserId);
        paramBody.put("currPage", 1);
        paramBody.put("pageSize", 100);
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSON.parseObject(res);
        if (!jsonObject2.containsKey(TLinkUtil.FLAG)) {
            return null;
        }
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonObject2.get(TLinkUtil.FLAG).toString())) {
            JSONObject deviceinfo = (JSONObject) jsonObject2.get("device");
            JSONArray sensorsList = (JSONArray) deviceinfo.get("sensorsList");
            List<CpSenSorDo> deviceList = JSONObject.parseArray(sensorsList.toJSONString(), CpSenSorDo.class);

            return deviceList;
        } else {

            return null;
        }
    }

    /**
     * 获取单个设备的传感器数据
     */
    @Override
    public SBApi getSingleDeviceDatas(SingleDeviceDatasDto singleDeviceDatasDto) {
        SBApi sbApi = new SBApi();

        if (StringUtils.isBlank(singleDeviceDatasDto.getDeviceNo())
                && StringUtils.isBlank(singleDeviceDatasDto.getDeviceId())) {
            sbApi.setStatus(-1);
            sbApi.setResult("设备 Id 序列号二选一");
            return sbApi;
        }
        String uri = "https://app.dtuip.com/api/device/getSingleDeviceDatas";
        String s = JSON.toJSONString(singleDeviceDatasDto);
        JSONObject paramBody = JSONObject.parseObject(s);
        paramBody.put("userId", TLinkUtil.getTLinkUserId());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            JSONObject dataList = (JSONObject) jsonRes.get("device");
            JSONArray dataList_ = new JSONArray();
            JSONObject obj1 = dataList;

            String deviceNo = obj1.getString("deviceNo");
            obj1.remove("deviceNo");
            obj1.put("deviceSn", deviceNo);
            dataList_.add(obj1);

            List<CpDevice> deviceList = JSONObject.parseArray(dataList_.toJSONString(), CpDevice.class);

            deviceList.forEach(cpDevice -> {
                cpDevice.setDeviceId(Long.parseLong(cpDevice.getId() + ""));
                UpdateWrapper<CpDevice> wrapper = new UpdateWrapper<>();
                QueryWrapper<CpDevice> QueryWrapper = new QueryWrapper<>();
                QueryWrapper.eq("device_id", cpDevice.getDeviceId());
                CpDevice cpDevice_ = this.baseMapper.selectOne(QueryWrapper);
                if (cpDevice_ == null) {
                    this.baseMapper.insert(cpDevice);
                } else {
                    wrapper.eq("device_id", cpDevice.getDeviceId());
                    this.baseMapper.update(cpDevice, wrapper);
                }
                List<CpSensor> sensorsList = cpDevice.getSensorsList();
                for (CpSensor cpSensor : sensorsList) {
                    if (cpSensor.getId().equals("0")) {
                        continue;
                    }
                    ;
                    QueryWrapper<CpSensor> QueryWrapper2 = new QueryWrapper<>();
                    QueryWrapper2.eq("sensor_id", cpSensor.getId());
                    CpSensor sensor = cpSensorService.getOne(QueryWrapper2);
                    if (sensor == null) {
                        cpSensor.setSensorId(Integer.parseInt(cpSensor.getId()));
                        cpSensor.setId(null);
                        cpSensorService.save(cpSensor);
                    } else {
                        UpdateWrapper<CpSensor> wrapper_ = new UpdateWrapper<>();
                        wrapper.eq("sensor_id", cpSensor.getId());
                        cpSensorService.update(cpSensor, wrapper_);
                    }
                }
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public List<CpDevice> getDeviceByCompanyId(String companyId) {
        return this.baseMapper.getDeviceByCompanyId(companyId);
    }

    @Override
    public CpDeviceNumberStatisticsVo getDeviceNumberTotalByCompanyId(String companyId) {
        CpDeviceNumberStatisticsVo cpDeviceNumberStatisticsVo = new CpDeviceNumberStatisticsVo();
        Integer deviceTotal = this.baseMapper.getDeviceNumberTotalByCompanyId(companyId);
        cpDeviceNumberStatisticsVo.setDeviceTotal(deviceTotal);
        return cpDeviceNumberStatisticsVo;
    }

    @Override
    public SBApi update(CpDevice cpDevice) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/updateDevice";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", TLinkUtil.UserId);
        jsonObject.put("deviceName", cpDevice.getDeviceName());
        jsonObject.put("linkType", cpDevice.getLinkType());
        jsonObject.put("lat", cpDevice.getLat());
        jsonObject.put("lng", cpDevice.getLng());
        jsonObject.put("timescale", cpDevice.getTimescale());
        jsonObject.put("deviceId", cpDevice.getDeviceId());
        String jsonStr = JSONObject.toJSONString(cpDevice.getSensorList());
        JSONArray obj = JSON.parseArray(jsonStr);
        String jsonStr2 = JSONObject.toJSONString(cpDevice.getDelSensorIds());
        JSONArray obj2 = JSON.parseArray(jsonStr2);
        jsonObject.put("sensorList", obj);
        jsonObject.put("delSensorIds", obj2);
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), jsonObject);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            UserDto user = authenticationFacade.getUser();
            CpDevice cpDevice2 = new CpDevice();
            cpDevice2.setId(cpDevice.getDeviceId());
            cpDevice2.setDeviceName(cpDevice.getDeviceName());
            cpDevice2.setDeviceType(cpDevice.getDeviceType());
            cpDevice2.setLng(cpDevice.getLng());
            cpDevice2.setLinkType(cpDevice.getLinkType());
            cpDevice2.setLat(cpDevice.getLat());
            cpDevice2.setDeviceCompany(cpDevice.getDeviceCompany());
            cpDevice2.setDeviceGroup(cpDevice.getDeviceGroup());
            cpDevice2.setDeviceManufacturer(cpDevice.getDeviceManufacturer());
            cpDevice2.setDeviceProject(cpDevice.getDeviceProject());
            this.baseMapper.updateById(cpDevice2);
            //获取设备传感器，保存到本地
            List<CpSenSorDo> cpSenSorDos = getSensorinfoByDevice(cpDevice.getDeviceSn());
            cpSenSorDos.forEach(cpSenSorDo -> {
                CpSensor sensor = new CpSensor();
                sensor.setSensorId(Integer.parseInt(cpSenSorDo.getId()));
                sensor.setSensorType(cpSenSorDo.getSensorTypeId().toString());
                sensor.setCreateDate(DateUtil.now());
                sensor.setDecimals(cpSenSorDo.getDecimalPlacse());
                sensor.setSensorName(cpSenSorDo.getSensorName());
                sensor.setDeviceId(cpDevice.getDeviceId().toString());
                cpSensorService.updateById(sensor);
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
        }
        return sbApi;
    }

    /**
     * 删除设备
     *
     * @param ids
     */
    @Override
    public void deleteDeviceList(String ids) {
        JSONObject jsonObject = JSONObject.parseObject(ids);
        List<String> list = (List<String>) jsonObject.get("ids");
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(-1, "分组ID不能为空");
        }
        this.removeByIds(list);
        for (String deviceId : list) {
            cpSensorService.deleteCpSensorByDeviceId(deviceId);
            cpDeviceCorrelationSensorService.deleteDeviceCorrelationSensorByDeviceId(deviceId);
            this.baseMapper.deleteById(deviceId);
        }
    }

    /**
     * 设备分页
     *
     * @param start
     * @param end
     * @param deviceName
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<CpDevice> devicePageByOemId(Long start, Long end, String deviceName, Integer page, Integer size, Integer oemId, String deviceCompany, String deviceType) {
        UserDto userDto = authenticationFacade.getUser();
        Page<CpDevice> cpDevicePage = new Page<>(page, size);
        List<CpDevice> deviceList = this.baseMapper.devicePageByOemId(cpDevicePage, start, end, deviceName, oemId, deviceCompany, deviceType);
        cpDevicePage.setRecords(deviceList);
        return cpDevicePage;
    }

    @Override
    public Page<CpDevice> devicePage(Long start, Long end, String deviceName, Integer page, Integer size, String deviceCompany, String deviceType) {
        Page<CpDevice> cpDevicePage = new Page<>(page, size);
        AdminDto adminDto = authenticationFacade.getAdmin();
        List<CpDevice> deviceList = null;
        if (null != adminDto.getAdminId()) {
            deviceList = this.baseMapper.devicePageByAdminId(cpDevicePage, start, end, deviceName, deviceCompany, deviceType);
        } else {
            SellerDto sellerDto = authenticationFacade.getSeller();
            if (null != sellerDto.getSellerId()) {
                deviceList = this.baseMapper.devicePageByOemId(cpDevicePage, start, end, deviceName, sellerDto.getSellerId(), deviceCompany, deviceType);
            } else {
                UserDto userDto = authenticationFacade.getUser();
                deviceList = this.baseMapper.devicePageByUserId(cpDevicePage, start, end, deviceName, userDto.getUserId(), deviceCompany, deviceType);
            }
        }
        cpDevicePage.setRecords(deviceList);
        return cpDevicePage;
    }

    /**
     * 设定本地信息
     *
     * @param cpDeviceBindRq
     */
    @Override
    public void addByDeviceSn(CpDeviceBindRq cpDeviceBindRq) {
        UserDto userDto = authenticationFacade.getUser();
        SBApi sbApi = new SBApi();
        CpDevice cpDevice_ = this.getOne(new QueryWrapper<CpDevice>().eq("device_sn", cpDeviceBindRq.getDeviceSn()));
        Integer uidCount = this.count(new QueryWrapper<CpDevice>().eq("u_id", userDto.getUserId()));
        try {
            if (null != cpDevice_ || uidCount < 0) {
                cpDeviceBindRq.setCreateDate(DateUtil.now());
                cpDeviceBindRq.setFounder(userDto.getNickname());
                cpDeviceBindRq.setOemId(userDto.getUserId() + "");
                this.baseMapper.addByDeviceSn(cpDeviceBindRq);
            }
            if (null == cpDevice_) {
                cpDeviceBindRq.setUid(userDto.getUserId());
                cpDeviceBindRq.setCreateDate(DateUtil.now());
                cpDeviceBindRq.setFounder(userDto.getNickname());
                this.baseMapper.insertLocalDevice(cpDeviceBindRq);
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param cpDeviceBindRq
     */
    @Override
    public void updateByDeviceSn(CpDeviceBindRq cpDeviceBindRq) {
        UserDto userDto = authenticationFacade.getUser();
        SBApi sbApi = new SBApi();
        CpDevice cpDevice_ = this.getOne(new QueryWrapper<CpDevice>().eq("device_sn", cpDeviceBindRq.getDeviceSn()));
        Integer uidCount = this.count(new QueryWrapper<CpDevice>().eq("u_id", userDto.getUserId()));

        if (null != cpDevice_) {
            cpDevice_.setDeviceProject(cpDeviceBindRq.getDeviceProject()!=null?cpDeviceBindRq.getDeviceProject():cpDevice_.getDeviceProject());
            cpDevice_.setDeviceManufacturer(cpDeviceBindRq.getDeviceManufacturer()!=null?cpDeviceBindRq.getDeviceManufacturer():cpDevice_.getDeviceManufacturer());
            cpDevice_.setDeviceGroup(cpDeviceBindRq.getDeviceGroup()!=null?cpDeviceBindRq.getDeviceGroup():cpDevice_.getDeviceGroup());
            cpDevice_.setDeviceCompany(cpDeviceBindRq.getDeviceCompany()!=null?cpDeviceBindRq.getDeviceCompany():cpDevice_.getDeviceCompany());
            cpDevice_.setDeviceType(cpDeviceBindRq.getDeviceType()!=null?cpDeviceBindRq.getDeviceType():cpDevice_.getDeviceType());
            cpDevice_.setLat(cpDeviceBindRq.getLat()!=null?cpDeviceBindRq.getLat():cpDevice_.getLat());
            cpDevice_.setLng(cpDeviceBindRq.getLng()!=null?cpDeviceBindRq.getLng():cpDevice_.getLng());
            cpDevice_.setAdminId(cpDeviceBindRq.getAdminId()!=null?cpDeviceBindRq.getAdminId():cpDevice_.getAdminId());
            cpDevice_.setOemId(cpDeviceBindRq.getOemId()!=null?cpDeviceBindRq.getOemId():cpDevice_.getOemId());
            cpDevice_.setUId(cpDeviceBindRq.getUserId()!=null?cpDeviceBindRq.getUserId():cpDevice_.getUId());
            int i = this.baseMapper.updateById(cpDevice_);
        } else {
            throw new ShopException(-1, "修改失败");
        }
    }

    /**
     * @param
     */
    @Override
    public List<CpDevice> getDeviceByUid(String Uid) {
        UserDto userDto = authenticationFacade.getUser();
        return list(new QueryWrapper<CpDevice>().eq("u_id", Uid));
    }

    @Override
    public CpdeviceNumberStatisticsByCompanyVo getDeviceNumberTotalByCompany(Integer deviceCompany) {
        CpdeviceNumberStatisticsByCompanyVo cpdeviceNumberStatisticsByCompanyVo = new CpdeviceNumberStatisticsByCompanyVo();
        UserDto userDto = authenticationFacade.getUser();
        Integer deviceTotal = this.baseMapper.getDeviceNumberTotalByCompany(null, null, null, deviceCompany);
        Integer isLineDeviceTotal = this.baseMapper.getDeviceNumberTotalByCompany(null, null, 1, deviceCompany);
        Integer isNotLineDeviceTotal = this.baseMapper.getDeviceNumberTotalByCompany(null, null, 0, deviceCompany);
        Integer isAlarmsDeviceTotal = this.baseMapper.getDeviceNumberTotalByCompany(1, null, null, deviceCompany);
        cpdeviceNumberStatisticsByCompanyVo.setIsNotLineDeviceTotal(null == isNotLineDeviceTotal ? 0 : isNotLineDeviceTotal);
        cpdeviceNumberStatisticsByCompanyVo.setIsLineDeviceTotal(null == isLineDeviceTotal ? 0 : isLineDeviceTotal);
        cpdeviceNumberStatisticsByCompanyVo.setIsAlarmsDeviceTotal(null == isAlarmsDeviceTotal ? 0 : isAlarmsDeviceTotal);
        cpdeviceNumberStatisticsByCompanyVo.setDeviceTotal(null == deviceTotal ? 0 : deviceTotal);
        return cpdeviceNumberStatisticsByCompanyVo;
    }


    /**
     * 获取地图设备数据
     *
     * @return
     */
    @Override
    public CpDeviceMapDto deviceApp() {
        UserDto userDto = authenticationFacade.getUser();
        List<com.common.dto.CpDeviceDto> all = this.baseMapper.deviceMapAppByUserId(userDto.getUserId(), null);
        List<com.common.dto.CpDeviceDto> inLine = this.baseMapper.deviceMapAppByUserId(userDto.getUserId(), 1);
        List<com.common.dto.CpDeviceDto> off = this.baseMapper.deviceMapAppByUserId(userDto.getUserId(), 0);
        CpDeviceMapDto cpDeviceMapDto = new CpDeviceMapDto();
        cpDeviceMapDto.setAllDeviceList(all);
        cpDeviceMapDto.setInLineDeviceList(inLine);
        cpDeviceMapDto.setOffDeviceList(off);
        return cpDeviceMapDto;
    }

    /**
     * 根据搜索条件获取设备信息
     *
     * @param search
     * @return
     */
    @Override
    public List<com.common.dto.CpDeviceDto> search(String search) {
        UserDto userDto = authenticationFacade.getUser();
        return this.baseMapper.search(search, userDto.getUserId());
    }

    /**
     * 获取设备轨迹 ES
     *
     * @param search
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<com.common.dto.CpDeviceDto> track(String search, Long start, Long end) {
        // 根据设备名称/设备ID获取设备信息
        List<CpDevice> list = list(new QueryWrapper<CpDevice>().eq("id", search).or().eq("device_name", search));
        if (CollectionUtils.isEmpty(list) || list.size() > 1) {
            throw new ShopException(-1, "没有获取到设备数据");
        }
        //先把查询时间分片 将时间转换为毫秒
        Long startTime = start * 1000;
        Long endTime = end * 1000;
        String deviceId = list.get(0).getId()+"";
        List<String> dateList = FormatTime.formatTime(startTime, endTime);
        List<String> esKeyList = new ArrayList<>();
        List<com.common.dto.CpDeviceDto> deviceDtoList = new ArrayList<>();

        // 1.先去redis中查找
        findCpDeviceDtoFromRedis(dateList, deviceId, deviceDtoList, esKeyList);

        // 2.说明 redis中没有值，然后再去es中去查询
        if (!CollectionUtils.isEmpty(esKeyList)) {
            List<CpDeviceEs> cpDeviceEsList = getRecordListFromEs(esKeyList);
            if (!CollectionUtils.isEmpty(cpDeviceEsList)) {
                for (CpDeviceEs deviceEs : cpDeviceEsList) {
                    List<CpDevice> esDeviceList = deviceEs.getDeviceList();
                    if (!CollectionUtils.isEmpty(esDeviceList)) {
                        esDeviceList.forEach(esDevice -> {
                            com.common.dto.CpDeviceDto cpDeviceDto = new com.common.dto.CpDeviceDto();
                            BeanUtils.copyProperties(esDevice, cpDeviceDto);
                            deviceDtoList.add(cpDeviceDto);
                        });
                    }
                }
            }
        }
//        return FilterCoordinatesUtil.filterTrajectory(deviceDtoList);
        return deviceDtoList;
    }

    @Override
    public Page<com.common.dto.CpDeviceDto> devicePageApp(String groupId, Integer page, Integer size,String search) {
        Page<com.common.dto.CpDeviceDto> cpDeviceDtoPage = new Page<>(page, size);
        UserDto user = authenticationFacade.getUser();
        List<com.common.dto.CpDeviceDto> deviceVoList = this.baseMapper.getDeviceListByGroupId(cpDeviceDtoPage, groupId,search,user.getUserId());
        cpDeviceDtoPage.setRecords(deviceVoList);
        return cpDeviceDtoPage;
    }

    @Override
    public List<CpDeviceVo> getDeviceByUser(Integer adminId, Integer oemId, Integer uid) {

        AdminDto adminDto = authenticationFacade.getAdmin();
        if (null == adminDto.getAdminId()) {
            SellerDto sellerDto = authenticationFacade.getSeller();
            if (null != sellerDto.getSellerId()) {
                oemId = (null == oemId)?sellerDto.getSellerId():oemId;
            } else {
                UserDto userDto = authenticationFacade.getUser();
                uid = (null == uid)?userDto.getUserId():uid;
            }
        }
        return  this.baseMapper.getDeviceByUser(adminId, oemId, uid);
    }


    /**
     * 先从Redis查找轨迹记录
     *
     * @param dateList
     * @param deviceId
     * @param deviceDtoList
     * @param esKeyList
     */
    private void findCpDeviceDtoFromRedis(List<String> dateList,
                                          String deviceId,
                                          List<com.common.dto.CpDeviceDto> deviceDtoList,
                                          List<String> esKeyList) {
        for (String s : dateList) {
            String redisData = findRecordByTimeTick(s, deviceId);
            // 判断是否为空，如果为空则去 Elasticsearch中查询
            if (org.apache.commons.lang3.StringUtils.isNotBlank(redisData)) {
                // 查询出轨迹记录List
                List<com.common.dto.CpDeviceDto> cpDeviceDtoList = JSON.parseArray(redisData, com.common.dto.CpDeviceDto.class);
                if (!CollectionUtils.isEmpty(cpDeviceDtoList)) {
                    deviceDtoList.addAll(cpDeviceDtoList);
                }
            } else {
                String esKey = s + "." + deviceId;
                esKeyList.add(esKey);
            }
        }
    }

    /**
     * 按时间分片查找轨迹记录
     *
     * @param timeTick
     * @param deviceId
     * @return
     */
    private String findRecordByTimeTick(final String timeTick, final String deviceId) {
        String key = RedisKey.COLD_DEVICE_TRACK + timeTick + ":" + deviceId;
        // 先查redis看是否有数据
        return (String) redisUtils.get(key);
    }

    private List<CpDeviceEs> getRecordListFromEs(List<String> esKeyList) {
        List<CpDeviceEs> recordList = new ArrayList<>();
        for (String s : esKeyList) {
            Optional<CpDeviceEs> cpDeviceEs = cpDeviceEsRepository.findById(s);
            cpDeviceEs.ifPresent(recordList::add);
        }
        return recordList;
    }

}