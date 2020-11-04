package com.coldchain.project.business.notices.mapper;

import com.coldchain.project.business.notices.domain.NoticesUserTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 通告用户标记Mapper接口
 *
 * @author nts
 * @date 2020-03-25
 */
public interface NoticesUserTagMapper {
    /**
     * 查询通告用户标记
     *
     * @param id 通告用户标记ID
     * @return 通告用户标记
     */
    public NoticesUserTag selectNoticesUserTagById(@Param("id") Long id);

    /**
     * 查询通告用户标记列表
     *
     * @param noticesUserTag 通告用户标记
     * @return 通告用户标记集合
     */
    public List<NoticesUserTag> selectNoticesUserTagList(NoticesUserTag noticesUserTag);

    /**
     * 新增通告用户标记
     *
     * @param noticesUserTag 通告用户标记
     * @return 结果
     */
    public int insertNoticesUserTag(NoticesUserTag noticesUserTag);

    /**
     * 修改通告用户标记
     *
     * @param noticesUserTag 通告用户标记
     * @return 结果
     */
    public int updateNoticesUserTag(NoticesUserTag noticesUserTag);

    /**
     * 删除通告用户标记
     *
     * @param id 通告用户标记ID
     * @return 结果
     */
    public int deleteNoticesUserTagById(@Param("id") Long id);

    /**
     * 批量删除通告用户标记
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNoticesUserTagByIds(String[] ids);

    /**
     * 根据通告ID查询
     *
     * @param noticeId 通知ID
     * @return 通告用户标记
     */
    NoticesUserTag selectNoticesUserTagByNoticeId(@Param("noticeId") Long noticeId);

    /**
     * 批量新增通告用户标记
     *
     * @param noticesUserTagList 通告用户标记列表
     * @return 结果
     */
    int insertNoticesUserTagBatch(@Param("noticesUserTagList") List<NoticesUserTag> noticesUserTagList);
}
