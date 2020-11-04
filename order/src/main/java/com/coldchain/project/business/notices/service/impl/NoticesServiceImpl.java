package com.coldchain.project.business.notices.service.impl;

import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.company.domain.CompanyFlowPool;
import com.coldchain.project.business.company.service.ICompanyFlowPoolService;
import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.notices.domain.Notices;
import com.coldchain.project.business.notices.domain.NoticesUserTag;
import com.coldchain.project.business.notices.mapper.NoticesMapper;
import com.coldchain.project.business.notices.service.INoticesService;
import com.coldchain.project.business.notices.service.INoticesUserTagService;
import com.coldchain.project.business.notices.vo.NoticesInfoVo;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.business.user.service.INtsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 通告Service业务层处理
 *
 * @author nts
 * @date 2020-03-25
 */
@Service
public class NoticesServiceImpl implements INoticesService {
    @Autowired
    private NoticesMapper noticesMapper;

    @Autowired
    private INoticesUserTagService noticesUserTagService;

    @Autowired
    private ICompanyFlowPoolService companyFlowPoolService;

    @Autowired
    private INtsUserService userService;

    @Autowired
    private IDeviceService deviceService;

    /**
     * 查询通告
     *
     * @param noticeId 通告ID
     * @return 通告
     */
    @Override
    public Notices selectNoticesById(Long noticeId) {
        return noticesMapper.selectNoticesById(noticeId);
    }

    /**
     * 查询通告列表
     *
     * @param notices 通告
     * @return 通告
     */
    @Override
    public List<Notices> selectNoticesList(Notices notices) {
        return noticesMapper.selectNoticesList(notices);
    }

    /**
     * 新增通告
     *
     * @param notices 通告
     * @return 结果
     */
    @Override
    public int insertNotices(Notices notices) {
        return noticesMapper.insertNotices(notices);
    }

    /**
     * 修改通告
     *
     * @param notices 通告
     * @return 结果
     */
    @Override
    public int updateNotices(Notices notices) {
        return noticesMapper.updateNotices(notices);
    }

    /**
     * 删除通告对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNoticesByIds(String ids) {
        return noticesMapper.deleteNoticesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除通告信息
     *
     * @param noticeId 通告ID
     * @return 结果
     */
    @Override
    public int deleteNoticesById(Long noticeId) {
        return noticesMapper.deleteNoticesById(noticeId);
    }

    /**
     * 查询消息通知列表
     *
     * @param isRead 是否阅读 0-未读 1-已读
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<NoticesInfoVo> queryNoticesList(Integer isRead,
                                                Long userId,
                                                String search,
                                                Long isUndo,
                                                String startDate,
                                                String overDate) {
        if (null != isRead && isRead >= 0 && isRead <= 1) {
            return noticesMapper.queryNoticesList(isRead, userId, search, isUndo, startDate, overDate);
        } else {
            return noticesMapper.queryNoticesList(null, userId, search, isUndo, startDate, overDate);
        }
    }

    /**
     * 查询消息通知列表【管理端端】
     *
     * @param search    搜索关键字
     * @param isUndo    是否撤销
     * @param startDate 起始时间
     * @param overDate  结束时间
     * @return 结果
     */
    @Override
    public List<NoticesInfoVo> queryNoticesListServer(String search, Long isUndo, String startDate, String overDate) {
        return noticesMapper.queryNoticesListServer(search, isUndo, startDate, overDate);
    }

    /**
     * 新增通告
     *
     * @param notices   通告
     * @param loginUser 登录用户
     * @return 结果
     */
    @Transactional
    @Override
    public NoticesInfoVo addNotices(Notices notices, NtsUser loginUser) {
        int result = insertNotices(notices);
        if (result <= 0) throw new NtsException("新增通告失败");
        NoticesUserTag noticesUserTag = new NoticesUserTag();
        noticesUserTag.setNoticeId(notices.getNoticeId());
        noticesUserTag.setUserId(loginUser.getUserId());
        int result1 = noticesUserTagService.insertNoticesUserTag(noticesUserTag);
        if (result1 <= 0) throw new NtsException("新增通告失败");

        NoticesInfoVo noticesInfoVo = new NoticesInfoVo();
        noticesInfoVo.setNoticeId(notices.getNoticeId());
        noticesInfoVo.setTitle(notices.getTitle());
        noticesInfoVo.setContent(notices.getContent());
        noticesInfoVo.setReleaseTime(notices.getReleaseTime());
        noticesInfoVo.setIsUndo(notices.getIsUndo());
        noticesInfoVo.setUndoTime(notices.getUndoTime());
        noticesInfoVo.setPriority(notices.getPriority());
        noticesInfoVo.setNoticeObjType(notices.getNoticeObjType());
        noticesInfoVo.setAccountType(notices.getAccountType());
        noticesInfoVo.setIsRead(noticesUserTag.getIsRead());
        noticesInfoVo.setReadTime(noticesUserTag.getReadTime());
        return noticesInfoVo;
    }

    /**
     * 新增通告,多用户
     *
     * @param notices     通告
     * @param ntsUserList 用户列表
     * @return 结果
     */
    @Transactional
    @Override
    public NoticesInfoVo addNotices(Notices notices, List<NtsUser> ntsUserList) {
        int result = insertNotices(notices);
        if (result <= 0) throw new NtsException("新增通告失败");

        List<NoticesUserTag> noticesUserTagList = new ArrayList<>();
        for (NtsUser ntsUser : ntsUserList) {
            NoticesUserTag noticesUserTag = new NoticesUserTag();
            noticesUserTag.setNoticeId(notices.getNoticeId());
            noticesUserTag.setUserId(ntsUser.getUserId());
            noticesUserTag.setIsRead(0);
            noticesUserTagList.add(noticesUserTag);
        }
        int result1 = noticesUserTagService.insertNoticesUserTagBatch(noticesUserTagList);
        if (result1 <= 0) throw new NtsException("新增通告失败");

        NoticesInfoVo noticesInfoVo = new NoticesInfoVo();
        noticesInfoVo.setNoticeId(notices.getNoticeId());
        noticesInfoVo.setTitle(notices.getTitle());
        noticesInfoVo.setContent(notices.getContent());
        noticesInfoVo.setReleaseTime(notices.getReleaseTime());
        noticesInfoVo.setIsUndo(notices.getIsUndo());
        noticesInfoVo.setUndoTime(notices.getUndoTime());
        noticesInfoVo.setPriority(notices.getPriority());
        noticesInfoVo.setNoticeObjType(notices.getNoticeObjType());
        noticesInfoVo.setAccountType(notices.getAccountType());
        noticesInfoVo.setIsRead(0);
        return noticesInfoVo;
    }

    /**
     * 卫星流量预警任务
     */
    // 这里进行标注为异步任务，在执行此方法的时候，会单独开启线程来执行(并指定线程池的名字)
    @Async("threadPoolTaskExecutor")
    @Override
    public void satFlowWarningTask() {
        List<CompanyFlowPool> companyFlowPoolList = companyFlowPoolService.selectCompanyFlowPoolList(new CompanyFlowPool());
        if (companyFlowPoolList == null) return;

        for (CompanyFlowPool companyFlowPool : companyFlowPoolList) {
            double surplusFlow = companyFlowPool.getSurplusFlow();
            // 判断剩余流量，预警通知：0kb < 流量 < 10kb；停用通知：流量 <= 0kb
            if (0 < surplusFlow && surplusFlow < 10240d) {
                this.flowWarnNotice(companyFlowPool);
            } else if (surplusFlow <= 0) {
                this.deactivateNotice(companyFlowPool);
            }
        }
    }

    /**
     * 流量预警通知发布
     *
     * @param companyFlowPool 企业流量池
     */
    private void flowWarnNotice(CompanyFlowPool companyFlowPool) {
        // 查询企业的账号
        NtsUser ntsUser = new NtsUser();
        ntsUser.setCompanyId(companyFlowPool.getCompanyId());
        List<NtsUser> ntsUserList = userService.selectNtsUserList(ntsUser);
        // 不存在企业用户，无法发送通知
        if (ntsUserList == null || ntsUserList.size() == 0) return;

        double surplusFlow = companyFlowPool.getSurplusFlow() / 1024; //剩余流量，单位换算为kb
        double usedFlow = companyFlowPool.getUsedFlow() / 1024; //已用流量，单位换算为kb

        Notices notices = new Notices();
        notices.setTitle("卫星流量预警通告");
        String content = "【新时空】卫星流量使用已经超过预设阈值，剩余流量：" + String.format("%.2f", surplusFlow) + "kb，已用流量：" +
                String.format("%.2f", usedFlow) + "kb，请您尽快充值流量，避免影响卫星设备使用，已充值请忽略。";
        notices.setContent(content);
        notices.setReleaseTime(DateUtils.getNowDate());
        notices.setPriority(2); // 优先级 0-默认 1-紧急 2-高 3-普通
        notices.setNoticeObjType(2); // 通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型
        // 新增通知，多用户推送
        this.addNotices(notices, ntsUserList);
    }

    /**
     * 设备禁用通知发布
     *
     * @param companyFlowPool 企业流量池
     */
    private void deactivateNotice(CompanyFlowPool companyFlowPool) {
        // 查询企业的使用设备数 激活状态为：1-已激活 3-启用
        List<Device> deviceList = deviceService.queryDeviceUsedByCompanyId(companyFlowPool.getCompanyId());
        // 不存在正在使用的设备，无法发送通知
        if (deviceList == null || deviceList.size() == 0) return;

        // 查询企业的账号
        NtsUser ntsUser = new NtsUser();
        ntsUser.setCompanyId(companyFlowPool.getCompanyId());
        List<NtsUser> ntsUserList = userService.selectNtsUserList(ntsUser);
        // 不存在企业用户，无法发送通知
        if (ntsUserList == null || ntsUserList.size() == 0) return;

        double surplusFlow = companyFlowPool.getSurplusFlow() / 1024; //剩余流量，单位换算为kb
        double usedFlow = companyFlowPool.getUsedFlow() / 1024; //已用流量，单位换算为kb

        Notices notices = new Notices();
        notices.setTitle("卫星设备禁用通告");
        String content = "【新时空】您企业所有卫星设备禁止使用，剩余流量：" + String.format("%.2f", surplusFlow) + "kb，已用流量：" +
                String.format("%.2f", usedFlow) + "kb，请您尽快充值流量，恢复卫星设备使用，已充值请忽略。";
        notices.setContent(content);
        notices.setReleaseTime(DateUtils.getNowDate());
        notices.setPriority(2); // 优先级 0-默认 1-紧急 2-高 3-普通
        notices.setNoticeObjType(2); // 通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型
        // 新增通知，多用户推送
        this.addNotices(notices, ntsUserList);

        // 调用ORBCOMM OCP系统的禁用接口
        // todo

        // 更新设备激活状态为禁用
        List<Device> upDeviceList = new ArrayList<>();
        for (Device device : deviceList) {
            Device dev = new Device();
            dev.setDeviceId(device.getDeviceId());
            dev.setActivate(4); // 激活状态：0-未激活 1-已激活 2-暂停 3-启用 4-禁用
            dev.setUpdateTime(DateUtils.getNowDate());
            upDeviceList.add(dev);
        }
        // 批量更新设备激活状态
        deviceService.updateDeviceActivateBatch(upDeviceList);
    }

    /**
     * 发布公告
     *
     * @param title    通告标题
     * @param content  通告内容
     * @param priority 优先级 1-紧急 2-高 3-普通
     * @return
     */
    @Transactional
    @Override
    public RestResponse sendNotice(String title, String content, Integer priority) {
        Notices notices = new Notices();
        notices.setTitle(title);
        notices.setContent(content);
        notices.setReleaseTime(DateUtils.getNowDate());
        notices.setPriority(priority == null ? 3 : priority);
        notices.setNoticeObjType(3);
        int result = insertNotices(notices);
        if (result <= 0) return RestResponse.error("发布公告失败");

        NoticesUserTag noticesUserTag = new NoticesUserTag();
        noticesUserTag.setNoticeId(notices.getNoticeId());
        int result1 = noticesUserTagService.insertNoticesUserTag(noticesUserTag);
        if (result1 <= 0) return RestResponse.error("发布公告失败");
        return RestResponse.success("发布公告成功");
    }
}
