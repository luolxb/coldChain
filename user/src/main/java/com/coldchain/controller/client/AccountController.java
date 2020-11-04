package com.coldchain.controller.client;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.NtsUserMoneyDetail;
import com.coldchain.entity.vo.NtsUserMoneyDetailRq;
import com.coldchain.entity.vo.NtsUserMoneyDetailVo;
import com.coldchain.service.NtsTransactionRecordService;
import com.coldchain.service.NtsUserMoneyDetailService;
import com.common.service.WxPayService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

@RestController
@RequestMapping("account")
@Api(tags = "账户管理")
@Slf4j
public class AccountController {


    @Autowired
    private NtsUserMoneyDetailService ntsUserMoneyDetailService;

    @Autowired
    private NtsTransactionRecordService ntsTransactionRecordService;

    @Autowired
    private WxPayService wxPayService;

    @ApiOperation("余额明细")
    @GetMapping("userMoneyDetailPage")
    public SBApi userMoneyDetailPage(@ApiParam("关键词") @RequestParam(value = "search", required = false) String search,
                                     @ApiParam("类型") @RequestParam(value = "type", required = false) String type,
                                     @ApiParam("开始时间 时间戳") @RequestParam(value = "start", required = false) Long start,
                                     @ApiParam("结束时间 时间戳") @RequestParam(value = "end", required = false) Long end,
                                     @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                                     @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<NtsUserMoneyDetailVo> ntsUserMoneyDetailVoPage = ntsUserMoneyDetailService.userMoneyDetailPage(page, size, search, type, start, end);
        return new SBApi(ntsUserMoneyDetailVoPage);
    }

    @ApiOperation("微信用户余额充值")
    @PostMapping("wx/userMoneyDetailAdd")
    public SBApi userMoneyDetailAdd(@RequestBody NtsUserMoneyDetailRq ntsUserMoneyDetailRq) {
        return new SBApi(ntsUserMoneyDetailService.userMoneyDetailAdd(ntsUserMoneyDetailRq, 1));
    }

    @ApiOperation(value = "支付宝统一下单", notes = "支付宝统一下单")
    @PostMapping("ali/userMoneyDetailAdd")
    public SBApi aliUnifiedOrder(@RequestBody NtsUserMoneyDetailRq ntsUserMoneyDetailRq) {
        return new SBApi(ntsUserMoneyDetailService.userMoneyDetailAdd(ntsUserMoneyDetailRq, 2));
    }

    /**
     * 微信支付异步通知
     */
    @ApiOperation("微信支付异步通知")
    @GetMapping(value = "wx/notify")
    public String payNotify(HttpServletRequest request) {
        InputStream is = null;
        String xmlBack = "<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[报文为空]]></return_msg></xml> ";
        try {
            is = request.getInputStream();
            // 将InputStream转换成String
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            // 修改 订单状态
            String outTradeNo = wxPayService.notify(sb.toString());
            Date date = new Date();
            NtsUserMoneyDetail ntsUserMoneyDetail = new NtsUserMoneyDetail();
            ntsUserMoneyDetail.setBuyTime(date);
            ntsUserMoneyDetail.setUpdateBy("admin");
            ntsUserMoneyDetail.setUpdateTime(date);
            ntsUserMoneyDetail.setTStatus(1);

            NtsTransactionRecord ntsTransactionRecord = new NtsTransactionRecord();
            ntsTransactionRecord.setTransactionTime(date);
            ntsTransactionRecord.setUpdateBy("admin");
            ntsTransactionRecord.setUpdateTime(date);
            ntsTransactionRecord.setStatus(1);
            ntsUserMoneyDetailService.update(ntsUserMoneyDetail, new QueryWrapper<NtsUserMoneyDetail>().eq("t_user_money_code", outTradeNo));
            ntsTransactionRecordService.update(ntsTransactionRecord, new QueryWrapper<NtsTransactionRecord>().eq("transaction_record_code", outTradeNo));
            xmlBack = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
        } catch (Exception e) {
            log.error("微信手机支付回调通知失败：", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return xmlBack;
    }
}
