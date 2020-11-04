package com.coldchain.project.business.card.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.controller.ApiBaseController;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.carddetail.service.INtsCardUsagedDetailService;
import com.coldchain.project.business.cardlog.service.INtsCardUsagedLogService;
import com.coldchain.project.business.user.domain.NtsUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @PackageName: com.coldchain.project.business.card.controller
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 17:26
 **/
@RestController
@Slf4j
@RequestMapping("/api/cardInfo")
//@Api(tags = "物联卡")
public class NtsCardInfoController extends ApiBaseController {

    @Autowired
    private NtsCardInfoService ntsCardInfoService;

    @Autowired
    private INtsCardUsagedLogService ntsCardUsagedLogService;

    @Autowired
    private INtsCardUsagedDetailService cardUsagedDetailService;

    @GetMapping("/getAndInset")
//    @ApiOperation(value = "getAndInset")
    public RestResponse getAndInset(@RequestParam String iccid,
                                    @ApiIgnore @LoginUser NtsUser loginUser,
                                    @RequestParam Long deviceId) throws ParseException {
        Integer info = ntsCardInfoService.getAndInsertCardInfo(iccid, loginUser, deviceId);
        return RestResponse.success(info);
    }

//    @GetMapping("/getCardNoList")
    public RestResponse getCardNoList() {
        List cardNoList = ntsCardInfoService.getCardNoList();
        return RestResponse.success(cardNoList);
    }

    @GetMapping("/getCardUsagelog")
//    @ApiOperation(value = "getCardUsagelog")
    public RestResponse getCardUsagelog(String date) {
        if (StringUtils.isBlank(date)) {
            date = DateFormatUtils.format(new Date(), "yyyyMM");
        }
        List cardNoList = ntsCardUsagedLogService.getCardUsagelog(date);
        return RestResponse.success(cardNoList);
    }

//    @ApiOperation(value = "getCardUsagelogDetail")
    @GetMapping("/getCardUsagelogDetail")
    public RestResponse getCardUsagelogDetail(String date) {
        if (StringUtils.isBlank(date)) {
            date = DateFormatUtils.format(new Date(), "yyyyMM");
        }
        List cardUsagedelta = cardUsagedDetailService.getCardUsagedelta(date);
        return RestResponse.success(cardUsagedelta);
    }

//     @ApiOperation(value = "updateCardInfo")
    @GetMapping("/updateCardInfo")
    public RestResponse updateCardInfo() {

        ntsCardInfoService.updateCardInfo();
        return RestResponse.success();
    }




}
