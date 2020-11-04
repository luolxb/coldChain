package com.coldchain.project.business.notices.mapper;

import com.coldchain.project.business.notices.domain.Notices;
import com.coldchain.project.business.notices.vo.NoticesInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 通告Mapper接口
 *
 * @author nts
 * @date 2020-03-25
 */
public interface NoticesMapper {
    /**
     * 查询通告
     *
     * @param noticeId 通告ID
     * @return 通告
     */
    public Notices selectNoticesById(@Param("noticeId") Long noticeId);

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
     * 删除通告
     *
     * @param noticeId 通告ID
     * @return 结果
     */
    public int deleteNoticesById(@Param("noticeId") Long noticeId);

    /**
     * 批量删除通告
     *
     * @param noticeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNoticesByIds(String[] noticeIds);

    /**
     * 查询消息通知列表
     *
     * @param isRead    是否阅读 0-未读 1-已读
     * @param userId    用户ID
     * @param search    搜索关键字
     * @param isUndo    是否撤销
     * @param startDate 起始时间
     * @param overDate  结束时间
     * @return 结果
     */
    List<NoticesInfoVo> queryNoticesList(@Param("isRead") Integer isRead,
                                         @Param("userId") Long userId,
                                         @Param("search") String search,
                                         @Param("isUndo") Long isUndo,
                                         @Param("startDate") String startDate,
                                         @Param("overDate") String overDate);

    /**
     * 查询消息通知列表【管理端】
     *
     * @param search    搜索关键字
     * @param isUndo    是否撤销
     * @param startDate 起始时间
     * @param overDate  结束时间
     * @return 结果
     */
    List<NoticesInfoVo> queryNoticesListServer(@Param("search") String search,
                                               @Param("isUndo") Long isUndo,
                                               @Param("startDate") String startDate,
                                               @Param("overDate") String overDate);
}
