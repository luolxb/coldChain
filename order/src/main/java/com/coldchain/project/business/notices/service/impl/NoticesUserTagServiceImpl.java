package com.coldchain.project.business.notices.service.impl;

import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.notices.domain.NoticesUserTag;
import com.coldchain.project.business.notices.mapper.NoticesUserTagMapper;
import com.coldchain.project.business.notices.service.INoticesUserTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通告用户标记Service业务层处理
 *
 * @author nts
 * @date 2020-03-25
 */
@Service
public class NoticesUserTagServiceImpl implements INoticesUserTagService {
    @Autowired
    private NoticesUserTagMapper noticesUserTagMapper;

    /**
     * 查询通告用户标记
     *
     * @param id 通告用户标记ID
     * @return 通告用户标记
     */
    @Override
    public NoticesUserTag selectNoticesUserTagById(Long id) {
        return noticesUserTagMapper.selectNoticesUserTagById(id);
    }

    /**
     * 查询通告用户标记列表
     *
     * @param noticesUserTag 通告用户标记
     * @return 通告用户标记
     */
    @Override
    public List<NoticesUserTag> selectNoticesUserTagList(NoticesUserTag noticesUserTag) {
        return noticesUserTagMapper.selectNoticesUserTagList(noticesUserTag);
    }

    /**
     * 新增通告用户标记
     *
     * @param noticesUserTag 通告用户标记
     * @return 结果
     */
    @Override
    public int insertNoticesUserTag(NoticesUserTag noticesUserTag) {
        return noticesUserTagMapper.insertNoticesUserTag(noticesUserTag);
    }

    /**
     * 修改通告用户标记
     *
     * @param noticesUserTag 通告用户标记
     * @return 结果
     */
    @Override
    public int updateNoticesUserTag(NoticesUserTag noticesUserTag) {
        return noticesUserTagMapper.updateNoticesUserTag(noticesUserTag);
    }

    /**
     * 删除通告用户标记对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNoticesUserTagByIds(String ids) {
        return noticesUserTagMapper.deleteNoticesUserTagByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除通告用户标记信息
     *
     * @param id 通告用户标记ID
     * @return 结果
     */
    @Override
    public int deleteNoticesUserTagById(Long id) {
        return noticesUserTagMapper.deleteNoticesUserTagById(id);
    }

    /**
     * 根据通告ID查询
     *
     * @param noticeId 通知ID
     * @return 通告用户标记
     */
    @Override
    public NoticesUserTag selectNoticesUserTagByNoticeId(Long noticeId) {
        return noticesUserTagMapper.selectNoticesUserTagByNoticeId(noticeId);
    }

    /**
     * 批量新增通告用户标记
     *
     * @param noticesUserTagList 通告用户标记列表
     * @return 结果
     */
    @Override
    public int insertNoticesUserTagBatch(List<NoticesUserTag> noticesUserTagList) {
        return noticesUserTagMapper.insertNoticesUserTagBatch(noticesUserTagList);
    }
}
