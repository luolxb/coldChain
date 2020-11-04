package com.coldchain.controller.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.vo.NtsCompanyRq;
import com.coldchain.entity.vo.NtsCompanyVo;
import com.coldchain.service.NtsCompanyService;
import com.common.dto.NtsCompanyDto;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("company/c")
@Api(tags = "企业管理")
public class NtsCompanyController {

    @Autowired
    private NtsCompanyService companyService;

    /**
     * 企业树
     *
     * @param companyId
     * @return
     */
    @ApiOperation("获取企业树")
    @GetMapping("/tree")
    public SBApi companyTree(@ApiParam("企业ID") @RequestParam(value = "companyId", required = false) Long companyId,
                             @ApiParam("企业名称") @RequestParam(value = "companyName", required = false) String companyName,
                             @ApiParam("用户ID") @RequestParam(value = "userId", required = false) Long userId) {
        List<NtsCompanyVo> ntsCompanyVos = companyService.tree(companyId, userId,companyName);
        return new SBApi(ntsCompanyVos);
    }

    @ApiOperation("新增企业信息")
    @PostMapping("/add")
    public SBApi create(@Valid @RequestBody NtsCompanyRq companyRq,
                        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }


        companyService.add(companyRq);

        return new SBApi();
    }

    @ApiOperation("企业信息")
    @GetMapping("/companyInfo")
    public SBApi getCompany(@RequestParam(value = "companyId", required = false) Long companyId) {
        return new SBApi(companyService.getCompany(companyId));
    }

    /**
     * 根据用户ID 获取企业信息
     *
     * @param userId
     * @return
     */
    @ApiOperation("根据用户ID 获取企业信息 服务之间的调用")
    @GetMapping("/company/userId")
    NtsCompanyDto getGroupCompany(@RequestParam("userId") Integer userId) {
        return companyService.getGroupCompany(userId);
    }

    @ApiOperation("企业分页/服务端")
    @GetMapping("page/server")
    public SBApi page(@ApiParam("企业名称") @RequestParam("companyName") String companyName,
                      @ApiParam("企业账号") @RequestParam("companyPhone") String companyPhone,
                      @ApiParam("状态") @RequestParam("status") Integer status,
                      @ApiParam("开始时间 时间戳") @RequestParam("start") Integer start,
                      @ApiParam("结束时间 时间戳") @RequestParam("end") Integer end,
                      @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                      @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<NtsCompanyVo> ntsCompanyVoPage = companyService.serverPage(companyName, companyPhone, status, start, end, page, size);
        return new SBApi(ntsCompanyVoPage);
    }

    @ApiOperation("审核")
    @PostMapping("audit/server")
    public SBApi audit(@RequestBody NtsCompanyRq companyRq) {
        companyService.audit(companyRq);
        return new SBApi();
    }

}
