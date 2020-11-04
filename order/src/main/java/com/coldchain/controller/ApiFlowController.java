package com.coldchain.controller;

import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtil;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.carddetail.service.INtsCardUsagedDetailService;
import com.coldchain.project.business.device.service.IDeviceFlowAggService;
import com.coldchain.project.business.device.service.IDeviceFlowDetailsService;
import com.coldchain.project.business.device.vo.DeviceFlowDetailsVo;
import com.coldchain.project.business.device.vo.FlowAggSumVo;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.util.List;

/**
 * 卫星流量管理
 */
@Api(tags = "04.流量管理")
@RestController
@Slf4j
@RequestMapping("/api/flow")
public class ApiFlowController extends ApiBaseController {

    @Autowired
    private IDeviceFlowAggService deviceFlowAggService;
    @Autowired
    private IDeviceFlowDetailsService deviceFlowDetailsService;

    @Autowired
    private INtsCardUsagedDetailService cardUsagedDetailService;


    @ApiOperation("卫星流量统计查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceSn", value = "设备SN", required = false, dataType = "String", paramType = "query", example = "89314404000147712179"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("satAggSum")
    public TableDataInfo satAggSum(String deviceSn,
                                   String startDate,
                                   String overDate,
                                   @ApiIgnore @LoginUser NtsUser ntsUser) {
        // 检查起始日期格式
        if (StringUtils.isNotEmpty(startDate)) {
            boolean isDate = DateUtil.isDateFormat(startDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("起始日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        // 检查截止日期格式
        if (StringUtils.isNotEmpty(overDate)) {
            boolean isDate = DateUtil.isDateFormat(overDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("截止日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        startPage();
        List<FlowAggSumVo> flowAggSumList = deviceFlowAggService.queryFlowAggSum(deviceSn, startDate, overDate, ntsUser.getCompanyId());
        return getDataTable(flowAggSumList);
    }

    @ApiOperation("卫星流量统计日志")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceSn", value = "设备SN", required = false, dataType = "String", paramType = "query", example = "89314404000147712179"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("satAggSumLog")
    public TableDataInfo satAggSumLog(String deviceSn,
                                      String startDate,
                                      String overDate) {
        // 检查起始日期格式
        if (StringUtils.isNotEmpty(startDate)) {
            boolean isDate = DateUtil.isDateFormat(startDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("起始日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        // 检查截止日期格式
        if (StringUtils.isNotEmpty(overDate)) {
            boolean isDate = DateUtil.isDateFormat(overDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("截止日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        startPage();
        List<FlowAggSumVo> flowAggSumList = deviceFlowAggService.queryFlowAggSumLog(deviceSn, startDate, overDate);
        return getDataTable(flowAggSumList);
    }

    @ApiOperation("卫星流量使用日志【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceSn", value = "设备SN", required = false, dataType = "String", paramType = "query", example = "89314404000147712179"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("satDetailLog")
    public TableDataInfo satDetail(String deviceSn, String startDate, String overDate,
                                   @ApiIgnore @LoginUser NtsUser ntsUser) {
//        NtsAssert.isBlank(deviceSn, "设备SN不能为空");
        // 检查起始日期格式
        if (StringUtils.isNotEmpty(startDate)) {
            boolean isDate = DateUtil.isDateFormat(startDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("起始日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        // 检查截止日期格式
        if (StringUtils.isNotEmpty(overDate)) {
            boolean isDate = DateUtil.isDateFormat(overDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("截止日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        startPage();
        List<DeviceFlowDetailsVo> flowDetailsList = deviceFlowDetailsService.queryFlowDetailsList(ntsUser.getCompanyId(), deviceSn, startDate, overDate);
        return getDataTable(flowDetailsList);
    }

    @ApiOperation("卫星流量使用日志【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceSn", value = "设备SN", required = false, dataType = "String", paramType = "query", example = "89314404000147712179"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("satDetailLogServer")
    public TableDataInfo satDetailServer(String deviceSn, String startDate, String overDate) {
//        NtsAssert.isBlank(deviceSn, "设备SN不能为空");
        // 检查起始日期格式
        if (StringUtils.isNotEmpty(startDate)) {
            boolean isDate = DateUtil.isDateFormat(startDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("起始日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        // 检查截止日期格式
        if (StringUtils.isNotEmpty(overDate)) {
            boolean isDate = DateUtil.isDateFormat(overDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("截止日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        startPage();
        List<DeviceFlowDetailsVo> flowDetailsList = deviceFlowDetailsService.queryFlowDetailsList(null, deviceSn, startDate, overDate);
        return getDataTable(flowDetailsList);
    }


    @ApiOperation("4G流量统计日志详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "iccId", value = "iccId", required = true, dataType = "String", paramType = "query", example = "898607B8101980020440"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("flow4GLogDetail")
    public TableDataInfo flow4GLogDetail(@RequestParam String iccId,
                                         String startDate,
                                         String overDate) {
        // 检查起始日期格式
        if (StringUtils.isNotEmpty(startDate)) {
            boolean isDate = DateUtil.isDateFormat(startDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("起始日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        // 检查截止日期格式
        if (StringUtils.isNotEmpty(overDate)) {
            boolean isDate = DateUtil.isDateFormat(overDate, DateUtil.DATE_TIME_PATTERN_GMT);
            if (!isDate) throw new NtsException("截止日期格式错误，正确格式：yyyy-MM-dd HH:mm:ss GMT");
        }
        startPage();
        List<FlowAggSumVo> flowAggSumList = cardUsagedDetailService.flow4GLogDetail(iccId, startDate, overDate);
        return getDataTable(flowAggSumList);
    }


    /**
     * 获取4G卫星流量使用详情
     *
     * @return
     */
    @ApiOperation("获取4G卫星流量使用详情(下)")
    @GetMapping("/get4GSatUseFlow")
    public RestResponse get4GSatUseFlow(@RequestParam String deviceSn,
                                        @ApiIgnore @LoginUser NtsUser ntsUser) throws ParseException {
        List<Index4GStaUseDataVo> dataVos = deviceFlowAggService.get4GSatUseFlow(deviceSn, ntsUser.getCompanyId());
        return RestResponse.success(dataVos);

    }

    /**
     * 获取4G卫星流量使用详情
     *
     * @return
     */
    @ApiOperation("获取4G卫星流量使用详情(上)")
    @GetMapping("/get4GSatUseFlow2")
    public RestResponse get4GSatUseFlow2(@RequestParam String deviceSn, @ApiIgnore @LoginUser NtsUser ntsUser) {
        List<FlowAggSumVo> dataVos = deviceFlowAggService.get4GSatUseFlow2(deviceSn, ntsUser.getCompanyId());
        return RestResponse.success(dataVos);

    }
}
