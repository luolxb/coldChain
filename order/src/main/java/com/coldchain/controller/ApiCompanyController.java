package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.company.service.ICompanyService;
import com.coldchain.project.business.company.vo.CompanyListServerVo;
import com.coldchain.project.business.company.vo.CompanyVo;
import com.coldchain.project.business.device.domain.CompanyFlowDetailVo;
import com.coldchain.project.business.device.service.IDeviceFlowAggService;
import com.coldchain.project.business.dict.domain.AccountType;
import com.coldchain.project.business.dict.service.IAccountTypeService;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.business.user.service.INtsUserService;
import com.coldchain.project.business.user.vo.CompanyUserRq;
import com.coldchain.project.business.user.vo.CompanyUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.util.List;

/**
 * 企业管理
 */
@Api(tags = "08.企业管理")
@RestController
@RequestMapping("/api/company")
public class ApiCompanyController extends ApiBaseController {

    @Autowired
    private INtsUserService userService;
    @Autowired
    private IAccountTypeService accountTypeService;

    @Autowired
    private IDeviceFlowAggService deviceFlowAggService;

    @Autowired
    private ICompanyService companyService;

    @ApiOperation(value = "添加企业用户")
    @PostMapping("addUser")
    public RestResponse addUser(@RequestBody CompanyUserRq companyUserRq,
                                @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(companyUserRq.getCompanyName(), "企业名称不能为空");
        NtsAssert.isBlank(companyUserRq.getBusinessLeader(), "业务负责人不能为空");
        NtsAssert.isBlank(companyUserRq.getMobile(), "责任人电话不能为空");
        NtsAssert.isBlank(companyUserRq.getMailLeader(), "责任人邮箱不能为空");
        NtsAssert.isBlank(companyUserRq.getAddress(), "企业地址不能为空");
        NtsAssert.isBlank(companyUserRq.getPrimaryAccount(), "企业主账号不能为空");
        NtsAssert.isBlank(companyUserRq.getUsername(), "新建账户名称不能为空");
        NtsAssert.isBlank(companyUserRq.getPassword(), "新建账户密码不能为空");

        return userService.addCompanyUser(companyUserRq, loginUser, this.getClientIp());
    }

    @ApiOperation(value = "修改企业用户")
    @PostMapping("updateUser")
    public RestResponse updateUser(@RequestBody CompanyUserRq companyUserRq,
                                   @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(companyUserRq.getUsername(), "用户名称不能为空");
        NtsAssert.isBlank(companyUserRq.getMobile(), "手机号码不能为空");
        return userService.updateCompanyUser(companyUserRq, loginUser, this.getClientIp());
    }

    @ApiOperation(value = "账户类别列表")
    @PostMapping("accountType")
    public RestResponse accountTypeList(@ApiIgnore @LoginUser NtsUser loginUser) {
        List<AccountType> accountTypeList = accountTypeService.selectAccountTypeList(new AccountType());
        return RestResponse.success(accountTypeList);
    }

    @ApiOperation("企业用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("list")
    public TableDataInfo list(@ApiIgnore @LoginUser NtsUser loginUser, CompanyUserVo companyUserVo) {

        startPage();
        List<CompanyUserVo> users = userService.queryCompanyUserList(companyUserVo);
        return getDataTable(users);
    }


    @ApiOperation("删除企业信息")
    @ApiImplicitParam(name = "companyIds", value = "企业ID集合", required = true, dataType = "String", example = "2,3")
    @PostMapping("/deleteCompany")
    public RestResponse deleteCompany(@ApiIgnore @LoginUser NtsUser loginUser, @RequestBody String companyIds) {
        return userService.deleteCompany(loginUser, companyIds);

    }


    @ApiOperation("企业统计列表【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10"),
            @ApiImplicitParam(name = "companyName", value = "企业名称", required = false, dataType = "String", paramType = "query", example = "企业名称"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 GMT"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss GMT", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 GMT"),
    })
    @GetMapping("/getCompanyListServer")
    public TableDataInfo getCompanyListServer(@ApiIgnore @LoginUser NtsUser loginUser,
                                              String startDate,
                                              String overDate,
                                              String companyName) {
        startPage();
        List<CompanyListServerVo> companyListServerVoList = userService.getCompanyListServer(loginUser, startDate, overDate, companyName);
        return getDataTable(companyListServerVoList);
    }

    /**
     * 获取企业流量详情
     *
     * @return
     */
    @ApiOperation("获取企业流量详情(下)")
    @ApiImplicitParam(name = "companyId", value = "企业ID", required = true, dataType = "String", paramType = "query", example = "440")
    @GetMapping("getCompanyFlowDetail")
    public RestResponse getCompanyFlowDetail(@RequestParam("companyId") String companyId) throws ParseException {
        List<Index4GStaUseDataVo> index4GStaUseDataVos = deviceFlowAggService.getCompanyFlowDetail(companyId);
        return RestResponse.success(index4GStaUseDataVos);
    }


    /**
     * 获取企业流量详情
     *
     * @return
     */
    @ApiOperation("获取企业流量详情(上)")
    @GetMapping("/getCompanyFlowDetail2")
    @ApiImplicitParam(name = "companyId", value = "企业ID", required = true, dataType = "String", paramType = "query", example = "440")
    public RestResponse getCompanyFlowDetail2(@RequestParam("companyId") String companyId) {
        CompanyFlowDetailVo dataVos = deviceFlowAggService.getCompanyFlowDetail2(companyId);
        return RestResponse.success(null == dataVos ? new CompanyFlowDetailVo() : dataVos);

    }

    @ApiOperation("模糊搜索企业")
    @GetMapping("/searchCompany")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "search", value = "搜索信息", required = true, dataType = "String", paramType = "query", example = "新时空"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    public TableDataInfo searchCompany(String search) {
        startPage();
        List<CompanyVo> companyVoList = companyService.selectListByLike(search);
        return getDataTable(companyVoList);
    }
}
