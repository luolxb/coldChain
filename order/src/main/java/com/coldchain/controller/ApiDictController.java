package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.project.business.dict.domain.NtsDictCarrier;
import com.coldchain.project.business.dict.service.INtsDictCarrierService;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 字典管理
 */
@Api(tags = "13.字典管理")
@RestController
@RequestMapping("/api/dict")
public class ApiDictController extends ApiBaseController {


    @Autowired
    private INtsDictCarrierService dictCarrierService;

    @ApiOperation("获取服务商数据字典")
    @GetMapping("/getCarrierList")
    public RestResponse getCarrierList(@ApiIgnore @LoginUser NtsUser loginUser) {
        List<NtsDictCarrier> ntsDictCarriers = dictCarrierService.selectNtsDictCarrierList(null);
        return RestResponse.success(ntsDictCarriers);
    }

}
