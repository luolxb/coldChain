package com.coldchain.controller.client;

import com.coldchain.service.NtsProductVersionService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "产品版本")
@RequestMapping("product")
@RestController
public class NtsProductVersionControoler {

    @Autowired
    private NtsProductVersionService ntsProductVersionService;

    @ApiOperation("产品版本数组")
    @GetMapping("list")
    public SBApi list(){
        return new SBApi(ntsProductVersionService.list());
    }
}
