package com.coldchain.controller.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsContactPerson;
import com.coldchain.entity.vo.NtsContactPersonRq;
import com.coldchain.service.NtsContactPersonService;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "联系人控制器")
@RestController
@RequestMapping("ntsContactPerson/c")
public class NtsContactPersonController {

    @Autowired
    private NtsContactPersonService ntsContactPersonService;

    @ApiOperation("联系人分页")
    @GetMapping("page")
    public SBApi page(@ApiParam("搜索条件") @RequestParam(value = "search", required = false) String search,
                      @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                      @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<NtsContactPerson> contactPersonPage = ntsContactPersonService.contactPersonPage(search, page, size);
        return new SBApi(contactPersonPage);
    }

    @ApiOperation("新增联系人")
    @PostMapping("add")
    public SBApi add(@Valid @RequestBody NtsContactPersonRq ntsContactPersonRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        ntsContactPersonService.add(ntsContactPersonRq);
        return new SBApi();
    }

    @ApiOperation("修改联系人")
    @PostMapping("update")
    public SBApi update(@Valid @RequestBody NtsContactPersonRq ntsContactPersonRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        ntsContactPersonService.edit(ntsContactPersonRq);
        return new SBApi();
    }
    @ApiOperation("删除联系人")
    @PostMapping("delete")
    public SBApi delete( @RequestBody String ids) {
        ntsContactPersonService.delete(ids);
        return new SBApi();
    }


}
