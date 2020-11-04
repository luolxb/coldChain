package com.coldchain.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.User;
import com.coldchain.entity.UserSign;
import com.coldchain.service.UserSignService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.vo.SBApi;
import com.coldchain.vo.UserSignStatisticsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dyr
 * @since 2020-04-08
 */
@RestController
@RequestMapping("/sign")
@Api(hidden = true,tags = "",value = "")
public class UserSignController {
    @Autowired
    private AuthenticationFacade authenticationFacade;
    //@Autowired
    //private UserSignService userSignService;

    @GetMapping("/page")
    public IPage<UserSign> getUserSignPage(@RequestParam(value = "mobile", required = false) String mobile,
                                           @RequestParam(value = "p", defaultValue = "1") Integer p,
                                           @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return null;
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("获取会员签到统计")
    @GetMapping
    public UserSignStatisticsVo signStatistics() {
        return null;
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("会员签到")
    @PostMapping
    public SBApi sign() {
        User user = authenticationFacade.getPrincipal(User.class);
        //userSignService.sign(user);
        return new SBApi();
    }
}
