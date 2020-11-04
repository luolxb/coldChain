package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.order.service.IOrderCompanyFlowService;
import com.coldchain.project.business.order.service.IOrderDeviceFlowService;
import com.coldchain.project.business.order.vo.OrderCompanyFlowVo;
import com.coldchain.project.business.order.vo.OrderDeviceFlowVo;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 订单管理
 */
@Api(tags = "06.订单管理")
@RestController
@RequestMapping("/api/order")
public class ApiOrderController extends ApiBaseController {

    @Autowired
    private IOrderDeviceFlowService orderDeviceFlowService;

    @Autowired
    private IOrderCompanyFlowService orderCompanyFlowService;

    @ApiOperation("设备流量购买订单【已废弃】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceId", value = "设备表ID", required = true, dataType = "Long", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "flowPlansId", value = "流量套餐ID", required = true, dataType = "Long", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "flowNumber", value = "流量数量 单位：kb", dataType = "Double", paramType = "query", example = "10")
    })
    @GetMapping("add")
    public Object add(Long deviceId, Long flowPlansId,
                      Double flowNumber, @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isNull(deviceId, "设备表ID不能为空");
        NtsAssert.isNull(flowPlansId, "流量套餐ID不能为空");

        if (StringUtils.isNotNull(flowNumber)) {
            // 购买数量范围[0.01，1048576]KB
            if (flowNumber < 0.01 || flowNumber > 1048576) {
                return RestResponse.error(50, "购买数量范围[0.01，1048576]KB");
            }
        }

        return orderDeviceFlowService.orderDeviceFlowAdd(deviceId, flowPlansId, flowNumber, loginUser);
    }

    @ApiOperation("企业流量购买订单【客户端】")

    @ApiImplicitParams({
            @ApiImplicitParam(name = "flowPlansId", value = "流量套餐ID", required = true, dataType = "Long", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "flowNumber", value = "流量数量 单位：kb", dataType = "Double", paramType = "query", example = "10.00")
    })
    @GetMapping("buyFlow")
    public Object buyFlow(Long flowPlansId, Double flowNumber,
                          @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isNull(flowPlansId, "流量套餐ID不能为空");

        if (StringUtils.isNotNull(flowNumber)) {
            // 购买数量范围[0.01，1048576]KB
            if (flowNumber < 0.01 || flowNumber > 1048576) {
                return RestResponse.error(50, "购买数量范围[0.01，1048576]KB");
            }
        }

        return orderCompanyFlowService.orderCompanyFlowAdd(flowPlansId, flowNumber, loginUser);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10"),
            @ApiImplicitParam(name = "search", value = "订单号", required = false, dataType = "String", paramType = "query", example = "1234567"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
    })
    @ApiOperation("企业流量订单列表【客户端】")
    @GetMapping("companyFlowList")
    public TableDataInfo companyFlowList(@ApiIgnore @LoginUser NtsUser loginUser,
                                         String search,
                                         String startDate,
                                         String overDate) {
        startPage();
        List<OrderCompanyFlowVo> orderCompanyFlowVos = orderCompanyFlowService.queryByCompanyId(loginUser.getCompanyId(), search, startDate, overDate);
        return getDataTable(orderCompanyFlowVos);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10"),
            @ApiImplicitParam(name = "search", value = "订单号", required = false, dataType = "String", paramType = "query", example = "1234567"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
    })
    @ApiOperation("企业流量订单列表【管理端】")
    @GetMapping("companyFlowListServer")
    public TableDataInfo companyFlowListServer(String search, String startDate, String overDate) {
        startPage();
        List<OrderCompanyFlowVo> orderCompanyFlowVos = orderCompanyFlowService.queryByCompanyId(null, search, startDate, overDate);
        return getDataTable(orderCompanyFlowVos);
    }

    @ApiOperation("设备流量订单列表【已废弃】")
    @GetMapping("deviceFlowList")
    public TableDataInfo deviceFlowList(@ApiIgnore @LoginUser NtsUser loginUser) {
        startPage();
        List<OrderDeviceFlowVo> orderDeviceFlowVos = orderDeviceFlowService.queryByCompanyId(loginUser.getCompanyId());
        return getDataTable(orderDeviceFlowVos);
    }
}
