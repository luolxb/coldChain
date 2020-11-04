package com.coldchain.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.Store;
import com.coldchain.entity.StoreWithdrawals;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.StoreService;
import com.coldchain.service.StoreWithdrawalsService;
import com.common.utils.TimeUtil;
import com.coldchain.utils.excel.ExcelUtil;
import com.common.vo.SBApi;
import com.coldchain.vo.StoreWithdrawalsExcel;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dyr
 * @since 2019-12-18
 */
@RestController
@RequestMapping("store_withdrawals")
public class StoreWithdrawalsController {

    @Autowired
    private StoreWithdrawalsService storeWithdrawalsService;
    @Autowired
    private StoreService storeService;

    @GetMapping("page")
    public IPage<StoreWithdrawals> getPage(@RequestParam(value = "store_id", required = false) Integer storeId,
                                           @RequestParam(value = "start_time", required = false) Integer startTime,
                                           @RequestParam(value = "end_time", required = false) Integer endTime,
                                           @RequestParam(value = "status", required = false) Integer status,
                                           @RequestParam(value = "bank_card", required = false) String bankCard,
                                           @RequestParam(value = "realname", required = false) String realname,
                                           @RequestParam(value = "page", defaultValue = "1") Integer page,
                                           @RequestParam(value = "size", defaultValue = "10") Integer size) {
        QueryWrapper<StoreWithdrawals> queryWrapper = new QueryWrapper<>();
        if (storeId != null) {
            queryWrapper.eq("sw.store_id", storeId);
        }
        if (startTime != null) {
            queryWrapper.ge("sw.create_time", startTime);
        }
        if (endTime != null) {
            queryWrapper.lt("sw.create_time", endTime);
        }
        if (status != null) {
            queryWrapper.eq("sw.status", status);
        }
        if (!StringUtils.isEmpty(bankCard)) {
            queryWrapper.like("sw.bank_card", bankCard);
        }
        if (!StringUtils.isEmpty(realname)) {
            queryWrapper.like("sw.realname", realname);
        }
        queryWrapper.apply("1=1");
        queryWrapper.orderByDesc("sw.id");
        return storeWithdrawalsService.getStoreWithdrawalsPage(new Page<>(page, size), queryWrapper);
    }

    @GetMapping
    public StoreWithdrawals getStoreWithdrawalsById(@RequestParam("id") Integer id) {
        return storeWithdrawalsService.getStoreWithdrawalsById(id);
    }

    @PostMapping
    public SBApi addStoreWithdrawals(@Valid @RequestBody StoreWithdrawals storeWithdrawals) {

        return new SBApi();
    }

    @PutMapping
    public SBApi updateStoreWithdrawals(@Valid @RequestBody StoreWithdrawals storeWithdrawals) {
        storeWithdrawalsService.updateById(storeWithdrawals);
        return new SBApi();
    }

    @DeleteMapping("{id}")
    public SBApi deleteStoreWithdrawals(@PathVariable("id") Integer id) {
        storeWithdrawalsService.removeById(id);
        return new SBApi();
    }

    @PutMapping("status")
    public SBApi updateStoreWithdrawalsStatus(@RequestParam("ids") Set<Integer> ids,
                                              @RequestParam("status") Integer status) {
        storeWithdrawalsService.update(new UpdateWrapper<StoreWithdrawals>()
                .set("status", status)
                .set("check_time", System.currentTimeMillis() / 1000)
                .in("id", ids));
        return new SBApi();
    }

    @GetMapping("/export")
    public void export(@RequestParam(value = "ids", required = false) Set<Integer> ids,
                       @RequestParam(value = "store_id", required = false) Integer storeId,
                       @RequestParam(value = "start_time", required = false) Integer startTime,
                       @RequestParam(value = "end_time", required = false) Integer endTime,
                       @RequestParam(value = "status", required = false) Integer status,
                       @RequestParam(value = "bank_card", required = false) String bankCard,
                       @RequestParam(value = "realname", required = false) String realname,
                       HttpServletResponse response) {
        QueryWrapper<StoreWithdrawals> wrapper = new QueryWrapper<>();
        if (ids != null && !ids.isEmpty()) {
            wrapper.in("id", ids);
        } else {
            if (storeId != null) {
                wrapper.eq("sw.store_id", storeId);
            }
            if (startTime != null) {
                wrapper.ge("sw.create_time", startTime);
            }
            if (endTime != null) {
                wrapper.lt("sw.create_time", endTime);
            }
            if (status != null) {
                wrapper.eq("sw.status", status);
            }
            if (!StringUtils.isEmpty(bankCard)) {
                wrapper.like("sw.bank_card", bankCard);
            }
            if (!StringUtils.isEmpty(realname)) {
                wrapper.like("sw.realname", realname);
            }
        }
        wrapper.apply("1=1");
        wrapper.orderByDesc("sw.id");
        List<StoreWithdrawalsExcel> orderExcelList = storeWithdrawalsService.getStoreWithdrawalsExportData(wrapper);
        String fileName = "商家转款_" + TimeUtil.transForDateStr(System.currentTimeMillis() / 1000, "yyyy-MM-dd HH.mm.ss");
        ExcelUtil.writeExcel(response, orderExcelList, fileName, fileName, new StoreWithdrawalsExcel());
    }

    @GetMapping("count")
    public Integer getCount(@RequestParam(value = "status", required = false) Set<Integer> status) {
        QueryWrapper<StoreWithdrawals> wrapper = new QueryWrapper<>();
        if (status != null) {
            wrapper.in("status", status);
        }
        return storeWithdrawalsService.count(wrapper);
    }

}
