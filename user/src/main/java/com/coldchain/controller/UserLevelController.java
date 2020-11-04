package com.coldchain.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.UserLevel;
import com.coldchain.service.UserLevelService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dyr
 * @since 2019-10-10
 */
@RestController
@Api(hidden = true,tags = "",value = "")
@RequestMapping("user_level")
public class UserLevelController {

    @Autowired
    UserLevelService userLevelService;

    @GetMapping("page")
    public IPage<UserLevel> getUserLevelPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                             @RequestParam(value = "size", defaultValue = "16") Integer size){
        return userLevelService.page(new Page<>(page, size));
    }

    @GetMapping
    public UserLevel getUserLevel(@RequestParam(value = "level_id") Integer levelId){
        return userLevelService.getById(levelId);
    }

    @PostMapping
    public SBApi addUserLevel(@Valid @RequestBody UserLevel userLevel){
        userLevelService.save(userLevel);
        return new SBApi();
    }

    @PutMapping
    public SBApi updateUserLevel(@Valid @RequestBody UserLevel userLevel){
        userLevelService.updateById(userLevel);
        return new SBApi();
    }

    @DeleteMapping("{level_id}")
    public SBApi deleteUserLevel(@PathVariable("level_id") Integer levelId){
        userLevelService.removeById(levelId);
        return new SBApi();
    }
}
