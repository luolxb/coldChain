package com.coldchain.controller;

import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.notices.domain.Notices;
import com.coldchain.project.business.notices.domain.NoticesUserTag;
import com.coldchain.project.business.notices.service.INoticesService;
import com.coldchain.project.business.notices.service.INoticesUserTagService;
import com.coldchain.project.business.notices.vo.NoticesInfoVo;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 消息通知
 */
@Api(tags = "10.消息通知")
@RestController
@RequestMapping("/api/notice")
public class ApiNoticesController extends ApiBaseController {

    @Autowired
    private INoticesService noticesService;

    @Autowired
    private INoticesUserTagService noticesUserTagService;

    @ApiOperation("通知列表【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "isRead", value = "是否阅读 0-未读 1-已读", required = false, dataType = "Integer", paramType = "query", example = "0"),
            @ApiImplicitParam(name = "search", value = "搜索关键字", required = false, dataType = "String", paramType = "query", example = "搜索关键字"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss ", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56"),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss ", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10"),
    })
    @GetMapping("list")
    public TableDataInfo list(Integer isRead, String search, String startDate,
                              String overDate, @ApiIgnore @LoginUser NtsUser loginUser) {
        startPage();
        List<NoticesInfoVo> noticesInfoVos = noticesService.queryNoticesList(isRead, Long.parseLong(loginUser.getUserId()+""), search, 0L, startDate, overDate);
        return getDataTable(noticesInfoVos);
    }

    @ApiOperation("通知列表【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "search", value = "搜索关键字", required = false, dataType = "String", paramType = "query", example = "搜索关键字"),
            @ApiImplicitParam(name = "isUndo", value = "是否撤销 0-默认 1-撤销", required = false, dataType = "Long", paramType = "query", example = "0"),
            @ApiImplicitParam(name = "startDate", value = "起始日期 yyyy-MM-dd HH:mm:ss", required = false, dataType = "String", paramType = "query", example = "2020-03-16 05:43:56 "),
            @ApiImplicitParam(name = "overDate", value = "截止日期 yyyy-MM-dd HH:mm:ss", required = false, dataType = "String", paramType = "query", example = "2020-03-16 07:43:56 "),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("listServer")
    public TableDataInfo listServer(String search, Long isUndo, String startDate, String overDate) {
        startPage();
        List<NoticesInfoVo> noticesInfoVos = noticesService.queryNoticesListServer(search, isUndo, startDate, overDate);
        return getDataTable(noticesInfoVos);
    }

    @ApiOperation("阅读通知")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", value = "通知ID", required = true, dataType = "Long", paramType = "query", example = "1")
    })
    @GetMapping("read")
    public RestResponse read(Long noticeId, @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isNull(noticeId, "通知ID不能为空");

        // 查询通告是否存在
        Notices notices = noticesService.selectNoticesById(noticeId);
        NtsAssert.isNull(notices, "通知不存在");
        // 查询通告用户标记是否存在
        NoticesUserTag noticesUserTag = noticesUserTagService.selectNoticesUserTagByNoticeId(noticeId);
        NtsAssert.isNull(noticesUserTag, "通知不存在");
        noticesUserTag.setUserId(Long.parseLong(loginUser.getUserId()+""));
        noticesUserTag.setIsRead(1); //是否阅读 0-未阅读 1-已阅读
        noticesUserTag.setReadTime(DateUtils.getNowDate());
        noticesUserTag.setAccountType(notices.getAccountType());

        // 更新通告用户标记
        int result = noticesUserTagService.updateNoticesUserTag(noticesUserTag);
        if (result > 0) return RestResponse.success();

        return RestResponse.error();
    }


    @ApiOperation("取消发布")
    @ApiImplicitParam(name = "noticeId", value = "通知ID", required = true, dataType = "Long", paramType = "query", example = "1")
    @PostMapping("/cancelReleaseNotices")
    public RestResponse cancelReleaseNotices(@RequestBody String noticeId) {
        JSONObject parse = (JSONObject) JSONObject.parse(noticeId);
        Notices notices = new Notices();
        notices.setNoticeId(Long.parseLong(parse.get("noticeId") + ""));
        notices.setUndoTime(DateUtils.getNowDate());
        notices.setIsUndo(1);
        int i = noticesService.updateNotices(notices);
        if (i <= 0) {
            return RestResponse.error("取消发布失败");
        }
        return RestResponse.success("取消发布成功");
    }


    @ApiOperation("删除公告")
    @ApiImplicitParam(name = "noticeId", value = "通知ID", required = true, dataType = "Long", paramType = "query", example = "1")
    @PostMapping("/delNotices")
    public RestResponse delNotices(@RequestBody String noticeId) {
        JSONObject parse = (JSONObject) JSONObject.parse(noticeId);
        Notices notices = new Notices();
        notices.setNoticeId(Long.parseLong(parse.get("noticeId") + ""));
        notices.setDelTime(DateUtils.getNowDate());
        notices.setIsDel(1);
        int i = noticesService.updateNotices(notices);
        if (i <= 0) {
            return RestResponse.error("删除公告失败");
        }
        return RestResponse.success("删除公告成功");
    }

    @ApiOperation(value = "发布公告【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "通告标题", required = true, dataType = "String", paramType = "query", example = "流量预警通告"),
            @ApiImplicitParam(name = "content", value = "通告内容", required = true, dataType = "String", paramType = "query", example = "流量预警通告"),
            @ApiImplicitParam(name = "priority", value = "优先级 1-紧急 2-高 3-普通", required = false, dataType = "Integer", paramType = "query", example = "3")
    })
    @PostMapping("sendNotice")
    public RestResponse sendNotice(String title, String content, Integer priority) {
        if (StringUtils.isEmpty(title)) {
            return RestResponse.error("通告标题不能为空！");
        }
        if (StringUtils.isEmpty(content)) {
            return RestResponse.error("通告内容不能为空！");
        }

        return noticesService.sendNotice(title, content, priority);
    }

}
