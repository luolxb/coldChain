package com.coldchain.controller.app;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsNotice;
import com.coldchain.service.NtsNoticeService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.dto.UserDto;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "app端消息")
@RestController
@RequestMapping("app/notice")
public class NoticeAppController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private NtsNoticeService ntsNoticeService;

    @ApiOperation("消息列表")
    @GetMapping("/page")
    public SBApi page(@ApiParam("搜索条件") @RequestParam(value = "search",required = false) String search,
                      @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                      @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        QueryWrapper<NtsNotice> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(search)) {
            queryWrapper.like("notice_type", search);
        }
        UserDto userDto = authenticationFacade.getUser();
        queryWrapper.eq("user_id", userDto.getUserId());
        Page<NtsNotice> noticePage = ntsNoticeService.page(new Page<>(page, size), queryWrapper);
        return new SBApi(noticePage);
    }

    @ApiOperation("消息查看")
    @GetMapping("detail")
    public SBApi detail(@ApiParam("消息ID") @RequestParam("id") Long id) {
        NtsNotice ntsNotice = ntsNoticeService.getById(id);
        return new SBApi(ntsNotice);
    }
}
