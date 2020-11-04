package com.coldchain.project.business.notices.service;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.project.business.notices.domain.Notices;
import com.coldchain.project.business.notices.vo.NoticesInfoVo;
import com.coldchain.project.business.user.domain.NtsUser;

import java.util.List;

/**
 * 通告Service接口
 *
 * @author nts
 * @date 2020-03-25
 */
public interface INoticesService {
    /**
     * 查询通告
     *
     * @param noticeId 通告ID
     * @return 通告
     */
    public Notices selectNoticesById(Long noticeId);

    /**
     * 查询通告列表
     *
     * @param notices 通告
     * @return 通告集合
     */
    public List<Notices> selectNoticesList(Notices notices);

    /**
     * 新增通告
     *
     * @param notices 通告
     * @return 结果
     */
    public int insertNotices(Notices notices);

    /**
     * 修改通告
     *
     * @param notices 通告
     * @return 结果
     */
    public int updateNotices(Notices notices);

    /**
     * 批量删除通告
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNoticesByIds(String ids);

    /**
     * 删除通告信息
     *
     * @param noticeId 通告ID
     * @return 结果
     */
    public int deleteNoticesById(Long noticeId);

    /**
     * 查询消息通知列表
     *
     * @param isRead 是否阅读 0-未读 1-已读
     * @param userId 用户ID
     * @return 结果
     */
    List<NoticesInfoVo> queryNoticesList(Integer isRead,
                                         Long userId,
                                         String search,
                                         Long isUndo,
                                         String startDate,
                                         String overDate);

    /**
     * 查询消息通知列表【管理端端】
     *
     * @param search    搜索关键字
     * @param isUndo    是否撤销
     * @param startDate 起始时间
     * @param overDate  结束时间
     * @return 结果
     */
    List<NoticesInfoVo> queryNoticesListServer(String search,
                                               Long isUndo,
                                               String startDate,
                                               String overDate);

    /**
     * 新增通告
     *
     * @param notices   通告
     * @param loginUser 登录用户
     * @return 结果
     */
    NoticesInfoVo addNotices(Notices notices, NtsUser loginUser);

    /**
     * 新增通告,多用户
     *
     * @param notices     通告
     * @param ntsUserList 用户列表
     * @return 结果
     */
    NoticesInfoVo addNotices(Notices notices, List<NtsUser> ntsUserList);

    /**
     * 卫星流量预警任务
     */
    void satFlowWarningTask();

    /**
     * 发布公告
     *
     * @param title    通告标题
     * @param content  通告内容
     * @param priority 优先级 1-紧急 2-高 3-普通
     * @return
     */
    RestResponse sendNotice(String title, String content, Integer priority);
}
