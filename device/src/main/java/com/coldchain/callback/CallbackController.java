package com.coldchain.callback;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.coldchain.callback.entity.CpSensorDataEntityDo;
import com.coldchain.entity.CpSensorData;
import com.coldchain.service.CpSensorDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = "数据回调")
@RequestMapping("callback")
@Slf4j
public class CallbackController {

    @Autowired
    private CpSensorDataService cpSensorDataService;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @ApiOperation("Tlink设备告警传感器数据")
    @PostMapping("/tlink/alert/device/sensor")
    public ResponseEntity<Object> test(@RequestBody JSONObject jsonObject) {
        log.info("Tlink设备告警传感器数据==>{}", jsonObject);
        Object flag = jsonObject.get("flag");
        if (flag.equals("00")) {
            Integer deviceUserid = (Integer) jsonObject.get("deviceUserid");
            String parentUserId = (String) jsonObject.get("parentUserId");
            Integer deviceId = (Integer) jsonObject.get("deviceId");
            JSONArray dataList = jsonObject.getJSONArray("sensorsDates");
            List<CpSensorDataEntityDo> cpSensorDataEntityList = JSONObject.parseArray(dataList.toJSONString(), CpSensorDataEntityDo.class);
            cpSensorDataEntityList.forEach(cpSensorDataEntity -> {
                CpSensorData cpSensorDataEntity1 = new CpSensorData();
                cpSensorDataEntity1.setCpSensorId(UUID.randomUUID().toString().replaceAll("-", ""));
                try {
                    cpSensorDataEntity1.setUpdateDate(dateFormat.parse(cpSensorDataEntity.getTimes()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                cpSensorDataEntity1.setFlag("00");
                cpSensorDataEntity1.setDeviceId(deviceId);
                cpSensorDataEntity1.setSensorId(cpSensorDataEntity.getSensorsId());
                cpSensorDataEntity1.setIsLine(cpSensorDataEntity.getIsLine() + "");
                cpSensorDataEntity1.setValue(cpSensorDataEntity.getValue());
                cpSensorDataEntity1.setIsAlarms(cpSensorDataEntity.getIsAlarm() + "");
                cpSensorDataEntity1.setSensorType(cpSensorDataEntity.getSensorsTypeId() + "");
                cpSensorDataService.save(cpSensorDataEntity1);

                // TODO 报警推送
            });
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
