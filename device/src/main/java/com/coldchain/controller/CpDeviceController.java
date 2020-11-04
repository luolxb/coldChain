package com.coldchain.controller;

import com.coldchain.entity.CpDevice;
import com.coldchain.entity.vo.*;
import com.coldchain.service.CpDeviceService;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 设备表(CpDevice)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:39:41
 */
@RestController
@RequestMapping("/cpDevice")
@Api(value = "设备管理", tags = {"设备中心-设备相关接口"})
public class CpDeviceController {

    @Autowired
    private CpDeviceService cpDeviceService;

    /**
     * 获取没有绑定的设备
     *
     * @return
     */
    @ApiOperation("获取没有绑定的设备")
    @GetMapping("/noUseDevice")
    public SBApi noUseDevice() {
        List<CpDeviceVo> cpDeviceVoList = cpDeviceService.noUseDevice();
        return new SBApi(cpDeviceVoList);
    }

    /**
     * 根据企业id,获取分组设备
     */
    @ApiOperation("根据企业id,获取分组设备")
    @GetMapping("/getGroupDeviceByCompany")
    public SBApi getGroupDeviceByCompany(@ApiParam("企业ID") @RequestParam(value = "companyId", required = true) String companyId) {

        List<CpGroupDeviceVo> cpGroupDeviceVoList = cpDeviceService.getGroupDeviceByCompany(companyId);

        return new SBApi(cpGroupDeviceVoList);
    }

    @ApiOperation("新增设备")
    @PostMapping("/add")
    public SBApi add(@Valid @RequestBody CpDevice cpDevice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        return cpDeviceService.insertDevice(cpDevice);
    }

    @ApiOperation("修改设备")
    @PostMapping("/update")
    public SBApi update(@Valid @RequestBody CpDevice cpDevice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }

        return cpDeviceService.update(cpDevice);
    }

    @ApiOperation("删除设备")
    @PostMapping("/del")
    public SBApi del(@Valid @RequestBody CpDevice cpDevice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceService.deleteDevcie(cpDevice);
        return new SBApi();
    }

    /**
     * 分页获取用户设备(不包含传感器数据)
     *
     * @return
     */
    @ApiOperation("分页获取用户设备(不包含传感器数据)")
    @PostMapping("/getdevice")
    public SBApi getDeviceByUserId(@Valid @RequestBody CpDeviceDto cpDeviceDto) {
        return cpDeviceService.getDeviceByUserId(cpDeviceDto);
    }

    /**
     * 分页获取用户设备传感器(含传感器实时数据)
     *
     * @return
     */
    @ApiOperation("分页获取用户设备传感器(含传感器实时数据)")
    @PostMapping("/getDeviceSensorDatas")
    public SBApi getDeviceSensorDatas(@Valid @RequestBody CpDeviceDto cpDeviceDto) {
        return cpDeviceService.getDeviceSensorDatas(cpDeviceDto);
    }

    /**
     * 获取单个设备的传感器数据
     *
     * @return
     */
    @ApiOperation("获取单个设备的传感器数据")
    @PostMapping("/getSingleDeviceDatas")
    public SBApi getSingleDeviceDatas(@Valid @RequestBody SingleDeviceDatasDto singleDeviceDatasDto) {
        return cpDeviceService.getSingleDeviceDatas(singleDeviceDatasDto);
    }

    /**
     * 根据公司ID获取所属的所有的设备
     *
     * @return
     */
    @ApiOperation("根据公司ID获取所属的所有的设备")
    @GetMapping("/getDeviceByCompanyId")
    public SBApi getDeviceByCompanyId(@Valid @RequestParam String companyId) {
        List<CpDevice> cpDeviceList = cpDeviceService.getDeviceByCompanyId(companyId);
        return new SBApi(cpDeviceList);
    }

    /**
     * 统计根据公司ID获取所属的所有的设备数量
     *
     * @return
     */
    @ApiOperation("统计根据公司ID获取所属的所有的设备数量")
    @GetMapping("/getDeviceNumberTotalByCompanyId")
    public SBApi getDeviceNumberTotalByCompanyId(@Valid @RequestParam String companyId) {
        CpDeviceNumberStatisticsVo cpDeviceNumberStatisticsVo = cpDeviceService.getDeviceNumberTotalByCompanyId(companyId);
        return new SBApi(cpDeviceNumberStatisticsVo);
    }

    @ApiOperation("删除设备集合")
    @PostMapping("deleteDeviceList")
    public SBApi deleteDeviceList(@RequestBody String ids) {
        cpDeviceService.deleteDeviceList(ids);
        return new SBApi();
    }

    @ApiOperation("设备分页根据OemId")
    @GetMapping("devicePageByOemId")
    public SBApi devicePageByOemId(@ApiParam("开始时间") @RequestParam(value = "start", required = false) Long start,
                                   @ApiParam("结束时间") @RequestParam(value = "end", required = false) Long end,
                                   @ApiParam("设备名称") @RequestParam(value = "deviceName", required = false) String deviceName,
                                   @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                                   @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size,
                                   @ApiParam("oem_id") @RequestParam(value = "oemId", defaultValue = "-1") Integer oemId,
                                   @ApiParam("设备企业") @RequestParam(value = "deviceCompany", required = false) String deviceCompany,
                                   @ApiParam("设备类型") @RequestParam(value = "deviceType", required = false) String deviceType
    ) {
        return new SBApi(cpDeviceService.devicePageByOemId(start, end, deviceName, page, size, oemId, deviceCompany, deviceType));
    }

    @ApiOperation("设备分页根据Uid")
    @GetMapping("devicePageByUid")
    public SBApi devicePageByUid(@ApiParam("开始时间") @RequestParam(value = "start", required = false) Long start,
                                 @ApiParam("结束时间") @RequestParam(value = "end", required = false) Long end,
                                 @ApiParam("设备名称") @RequestParam(value = "deviceName", required = false) String deviceName,
                                 @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size,
                                 @ApiParam("设备企业") @RequestParam(value = "deviceCompany", required = false) String deviceCompany,
                                 @ApiParam("设备类型") @RequestParam(value = "deviceType", required = false) String deviceType
    ) {
        return new SBApi(cpDeviceService.devicePage(start, end, deviceName, page, size, deviceCompany, deviceType));
    }


    @ApiOperation("获取设备根据登陆用户Id")
    @GetMapping("getDeviceByUid")
    public List<CpDevice> getDeviceByUid(@RequestParam String Uid) {
        return cpDeviceService.getDeviceByUid(Uid);
    }

    @ApiOperation("新增设备")
    @PostMapping("addByDeviceSn")
    public SBApi addByDeviceSn(@Valid @RequestBody CpDeviceBindRq cpDeviceBindRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceBindRq.setUserId(null);
        cpDeviceService.addByDeviceSn(cpDeviceBindRq);
        return new SBApi();
    }


    @ApiOperation("修改设备")
    @PostMapping("updateByDeviceSn")
    public SBApi updateByDeviceSn(@Valid @RequestBody CpDeviceBindRq cpDeviceBindRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceService.updateByDeviceSn(cpDeviceBindRq);
        return new SBApi();
    }

    /**
     * 根据公司ID统计设备数量
     */
    @ApiOperation("根据公司ID统计设备数量")
    @GetMapping("/getDeviceNumberTotalByCompany")
    public SBApi getDeviceNumberTotalByCompany(@RequestParam Integer deviceCompany) {
        CpdeviceNumberStatisticsByCompanyVo cpdeviceNumberStatisticsByCompanyVo = cpDeviceService.getDeviceNumberTotalByCompany(deviceCompany);
        return new SBApi(cpdeviceNumberStatisticsByCompanyVo);
    }


}