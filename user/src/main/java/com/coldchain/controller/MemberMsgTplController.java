package com.coldchain.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.MemberMsgTpl;
import com.coldchain.service.MemberMsgTplService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 用户消息模板 前端控制器
 * </p>
 *
 * @author dyr
 * @since 2020-03-10
 */
@RestController
@RequestMapping("/member_msg_tpl")
@Api(hidden = true,tags = "",value = "")
public class MemberMsgTplController {

    @Autowired
    private MemberMsgTplService memberMsgTplService;

    @GetMapping("page")
    public IPage<MemberMsgTpl> getPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                       @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return memberMsgTplService.page(new Page<>(page, size));
    }

    @GetMapping
    public MemberMsgTpl getStoreMsgTpl(@RequestParam(value = "mmt_code") String mmtCode) {
        return memberMsgTplService.getOne(new QueryWrapper<MemberMsgTpl>().eq("mmt_code", mmtCode));
    }

    @PutMapping
    public SBApi updateStoreMsgTpl(@Valid @RequestBody MemberMsgTpl memberMsgTpl) {
        memberMsgTplService.updateById(memberMsgTpl);
        return new SBApi();
    }

}
