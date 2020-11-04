package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.DeviceDataDownMapper;
import com.coldchain.entity.DeviceDataDown;
import com.coldchain.entity.vo.DeviceDataDownRq;
import com.coldchain.entity.vo.DeviceDataDownVo;
import com.coldchain.service.DeviceDataDownService;
import com.coldchain.service.DeviceService;
import com.common.dto.CpDeviceDto;
import com.common.dto.CpSensorDataDto;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.ExcelUtil;
import com.common.utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Slf4j
public class DeviceDataDownServiceImpl extends ServiceImpl<DeviceDataDownMapper, DeviceDataDown> implements DeviceDataDownService {

    /**
     * template模板引擎
     */
    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender javaMailSender;


    @Value("${spring.mail.username}")
    private String from;

    @Value("${spring.resources.static-locations}")
    private String staticLocation;

    @Autowired
    private IpUtil ipUtil;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private DeviceService deviceService;

    @Override

    public void down(DeviceDataDownRq deviceDataDownRq) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = dateFormat.format(deviceDataDownRq.getStartTime());
        String end = dateFormat.format(deviceDataDownRq.getEndTime());
        deviceDataDownRq.getDeviceList().forEach(device -> {
            // 新增设备数据下载
            Long id = addDeviceDataDown(deviceDataDownRq, dateFormat, start, end, device);

            // 获取设备的数据 下载到 ../public
            String excelUrl = getDateListToExcel(device, deviceDataDownRq.getStartTime(), deviceDataDownRq.getEndTime(), "excel");
            Map<String, Object> map = new HashMap<>(4);
            map.put("name", device.getDeviceName());
            map.put("start", start);
            map.put("end", end);
            map.put("href", "http://" + ipUtil.getIp() + ":9090/device" + excelUrl);

            DeviceDataDown deviceDataDown = new DeviceDataDown();
            deviceDataDown.setDownStatus(1);
            try {
                sendMial(deviceDataDownRq.getMail(), "设备数据", map);
            } catch (MessagingException e) {
                log.error("模板邮件发送失败->message:{}", e.getMessage());
//                throw new RuntimeException("邮件发送失败");
                deviceDataDown.setDownStatus(2);

            }
            deviceDataDown.setPath(excelUrl);

            // 修改 下载状态
            deviceDataDown.setId(id);
            deviceDataDown.setUpdateBy(authenticationFacade.getUser().getNickname());
            deviceDataDown.setUpdateTime(new Date());
            this.updateById(deviceDataDown);
            try {
                Thread.sleep(1000 * 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * 设备数据下载列表
     *
     * @param search
     * @param downStatus
     * @param page
     * @param size
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<DeviceDataDownVo> deviceDataDownPage(String search, Integer downStatus, Integer page, Integer size) {
        Page<DeviceDataDownVo> deviceDataDownVoPage = new Page<>(page, size);
        UserDto userDto = authenticationFacade.getUser();
        List<DeviceDataDownVo> deviceDataDownVoList = this.baseMapper.deviceDataDownPage(deviceDataDownVoPage, search, downStatus,userDto.getUserId());
        deviceDataDownVoPage.setRecords(deviceDataDownVoList);
        return deviceDataDownVoPage;
    }

    /**
     * 删除
     *
     * @param ids
     */
    @Override
    public void delete(String ids) {
        JSONObject parse = (JSONObject) JSONObject.parse(ids);
        List<Integer> list = (List<Integer>) parse.get("ids");
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(-1, "设备数据ID不能为空");
        }
        List<Long> longList = new ArrayList<>();
        list.forEach(l -> longList.add(Long.parseLong(l + "")));
        this.removeByIds(longList);
    }

    /**
     * 新增设备数据下载
     *
     * @param deviceDataDownRq
     * @param dateFormat
     * @param start
     * @param end
     * @param device
     */
    private Long addDeviceDataDown(DeviceDataDownRq deviceDataDownRq, SimpleDateFormat dateFormat, String start, String end, CpDeviceDto device) {
        DeviceDataDown deviceDataDown = new DeviceDataDown();
        UserDto user = authenticationFacade.getUser();
        deviceDataDown.setUserId(user.getUserId());
        deviceDataDown.setCreateBy(StringUtils.isBlank(user.getNickname()) ? "admin" : user.getNickname());
        deviceDataDown.setCreateTime(new Date());
        deviceDataDown.setDeviceId(device.getId());
        deviceDataDown.setReceivingMethod(deviceDataDownRq.getMail());
        try {
            deviceDataDown.setDownStart(dateFormat.parse(start));
            deviceDataDown.setDownEnd(dateFormat.parse(end));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.save(deviceDataDown);
        return deviceDataDown.getId();
    }

    /**
     * 设备数据写入到Excel
     *
     * @param device
     * @param start
     * @param end
     * @param excel
     * @return
     */
    private String getDateListToExcel(CpDeviceDto device, Long start, Long end, String excel) {
        // 获取设备的数据 下载到 ../public
        List<CpSensorDataDto> list = getSensorDataList(device.getId(), start / 1000, end / 1000);

        String uploadPath = staticLocation.substring(staticLocation.indexOf(":") + 1) + "/upload";
        //保存到对应文件夹下对应当天日期文件夹
        StringBuilder filePath = new StringBuilder(uploadPath);
        String year = Calendar.getInstance().get(Calendar.YEAR) + "";
        String monthWithDay = Calendar.getInstance().get(Calendar.MONTH) + 1 + "-" + Calendar.getInstance().get(Calendar.DATE);
        filePath.append("/").append(excel).append("/").append(year).append("/").append(monthWithDay).append("/");
        String randomFileName = device.getDeviceName() + ".xlsx";
        String filePathDown = filePath.append(randomFileName).toString();
        Path path = Paths.get(filePathDown);
        if (!Files.exists(path.getParent())) {
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                log.error("e", e);
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(filePathDown);
            ExcelUtil<CpSensorDataDto> util1 = new ExcelUtil<>(CpSensorDataDto.class);
            util1.getListToExcel(list, device.getDeviceName(), out);
        } catch (FileNotFoundException e) {
            log.error("e", e);
        }

        return filePathDown.substring(2);
    }

    /**
     * 获取设备传感器数据
     *
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    private List<CpSensorDataDto> getSensorDataList(String deviceId, Long start, Long end) {
        return deviceService.getSensorDataList(deviceId, start, end);
    }


    private void sendMial(String mail, String title, Map<String, Object> map) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        // 发送人的邮箱
        messageHelper.setFrom(from);
        //发给谁  对方邮箱
        messageHelper.setTo(mail);
        //标题
        messageHelper.setSubject(title);
        Context context = new Context();
        //定义模板数据
        context.setVariables(map);
        //获取thymeleaf的html模板
        //指定模板路径
        String emailContent = templateEngine.process("device_data_down", context);
        messageHelper.setText(emailContent, true);
        //发送邮件
        javaMailSender.send(mimeMessage);
    }
}
