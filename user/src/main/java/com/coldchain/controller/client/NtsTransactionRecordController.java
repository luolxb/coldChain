package com.coldchain.controller.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.vo.NtsTransactionRecordVo;
import com.coldchain.service.NtsTransactionRecordService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transactionRecord")
@Api(tags = "交易记录")
@Slf4j
public class NtsTransactionRecordController {

    @Autowired
    private NtsTransactionRecordService ntsTransactionRecordService;

    @ApiOperation("交易记录分页")
    @GetMapping("page")

    public SBApi page(@ApiParam("关键词") @RequestParam(value = "search", required = false) String search,
                      @ApiParam("类型") @RequestParam(value = "type", required = false) String type,
                      @ApiParam("开始时间 时间戳") @RequestParam(value = "start", required = false) Long start,
                      @ApiParam("结束时间 时间戳") @RequestParam(value = "end", required = false) Long end,
                      @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                      @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<NtsTransactionRecordVo> transactionRecordVoPage = ntsTransactionRecordService.transactionRecordVoPage(page, size, search, type, start, end);
        return new SBApi(transactionRecordVoPage);
    }
}
