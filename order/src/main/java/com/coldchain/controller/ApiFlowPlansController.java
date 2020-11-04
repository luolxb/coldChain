package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.project.business.flow.domain.FlowPlans;
import com.coldchain.project.business.flow.service.IFlowPlansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 流量套餐
 */
@Api(tags = "05.流量套餐")
@RestController
@RequestMapping("/api/flowPlans")
public class ApiFlowPlansController extends ApiBaseController {

    @Autowired
    private IFlowPlansService flowPlansService;

    @ApiOperation("流量套餐列表")
    @GetMapping("list")
    public RestResponse list() {
        List<FlowPlans> flowPlansList = flowPlansService.selectFlowPlansList(new FlowPlans());
        return RestResponse.success(flowPlansList);
    }
}
