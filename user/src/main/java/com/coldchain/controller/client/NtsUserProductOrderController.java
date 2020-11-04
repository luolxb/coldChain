package com.coldchain.controller.client;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.NtsUserProductOrder;
import com.coldchain.entity.vo.NtsUserProductOrderRq;
import com.coldchain.entity.vo.NtsUserProductOrderVo;
import com.coldchain.service.NtsTransactionRecordService;
import com.coldchain.service.NtsUserProductOrderService;
import com.common.exception.ShopException;
import com.common.service.AlipayService;
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

@Api(tags = "产品订单")
@Slf4j
@RestController
@RequestMapping("productOrder")
public class NtsUserProductOrderController {

    @Autowired
    private NtsUserProductOrderService ntsUserProductOrderService;

    @Autowired
    private NtsTransactionRecordService ntsTransactionRecordService;

    @Autowired
    private WxPayService wxPayService;

    @Autowired
    private AlipayService alipayService;

    private String callbackUrl = "/user/productOrder/wx/notify";

    @ApiOperation("立即购买/下订单")
    @PostMapping("add")
    public SBApi add(@RequestBody NtsUserProductOrderRq productOrderRq) {
        NtsUserProductOrderVo productOrderVo = ntsUserProductOrderService.add(productOrderRq);
        return new SBApi(productOrderVo);
    }

    @ApiOperation("订单分页")
    @GetMapping("page")
    public SBApi productOrderPage(@ApiParam("订单类型") @RequestParam(value = "tyoe", required = false) String type,
                                  @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                                  @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size,
                                  @ApiParam("开始时间 时间戳") @RequestParam(value = "start", required = false) Long start,
                                  @ApiParam("结束时间 时间戳") @RequestParam(value = "end", required = false) Long end) {
        Page<NtsUserProductOrderVo> ntsUserProductOrderVoPage = ntsUserProductOrderService.productOrderPage(type, start, end, page, size);
        return new SBApi(ntsUserProductOrderVoPage);
    }

    @ApiOperation("余额支付订单")
    @PostMapping("userMoney/pay")
    public SBApi pay(@RequestBody NtsUserProductOrderRq productOrderRq) {
        ntsUserProductOrderService.pay(productOrderRq);
        return new SBApi();
    }


    @ApiOperation(value = "微信统一下单", notes = "微信统一下单")
    @PostMapping("wx/unifiedOrder")
    public SBApi wxUnifiedOrder(@RequestBody NtsUserProductOrderRq productOrderRq) {
        NtsUserProductOrder productOrder = checkParam(productOrderRq);
        return wxPayService.unifiedOrder(productOrder.getProductOrderCode(), productOrder.getBuyPrice(), "NATIVE", productOrder.getProductOrderContent(), null, callbackUrl);
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
            NtsUserProductOrder ntsUserProductOrder = new NtsUserProductOrder();
            Date date = new Date();
            ntsUserProductOrder.setUpdateTime(date);
            ntsUserProductOrder.setPayType("微信支付");
            ntsUserProductOrder.setPayStatus(1);
            ntsUserProductOrder.setUpdateBy("admin");
            ntsUserProductOrder.setBuyTime(date);

            NtsTransactionRecord ntsTransactionRecord = new NtsTransactionRecord();
            ntsTransactionRecord.setTransactionTime(date);
            ntsTransactionRecord.setUpdateBy("admin");
            ntsTransactionRecord.setUpdateTime(date);
            ntsTransactionRecord.setStatus(1);
            ntsTransactionRecord.setTable("微信支付");
            ntsUserProductOrderService.update(ntsUserProductOrder, new QueryWrapper<NtsUserProductOrder>().eq("product_order_code", outTradeNo));

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

    @ApiOperation(value = "支付宝统一下单", notes = "支付宝统一下单")
    @PostMapping("ali/unifiedOrder")
    public SBApi aliUnifiedOrder(@RequestBody NtsUserProductOrderRq productOrderRq) {
        NtsUserProductOrder productOrder = checkParam(productOrderRq);
        return new SBApi(alipayService.tradePayRequest(productOrder.getProductOrderCode(), productOrder.getBuyPrice(), productOrder.getProductOrderContent(), "WEB"));
    }

    private NtsUserProductOrder checkParam(NtsUserProductOrderRq productOrderRq) {
        if (productOrderRq.getId() == null) {
            throw new ShopException(-1, "订单ID不能为空");
        }
        NtsUserProductOrder productOrder = ntsUserProductOrderService.getById(productOrderRq.getId());
        if (productOrder == null) {
            throw new ShopException(-1, "订单不存在");
        }
        return productOrder;
    }


}
