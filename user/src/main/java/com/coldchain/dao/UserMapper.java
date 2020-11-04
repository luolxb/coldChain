package com.coldchain.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.dto.StoreMemberCountDto;
import com.coldchain.dto.StoreMemberIdsDto;
import com.coldchain.entity.User;
import com.coldchain.entity.vo.UserManagerVo;
import com.coldchain.vo.UserDayReport;
import com.coldchain.vo.UserExcel;
import com.common.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dyr
 * @since 2019-08-15
 */
public interface UserMapper extends BaseMapper<User> {
    List<UserDayReport> selectDayReport(Long startTime, Long endTime, Integer dayNum);

    //查询会员导出数据
    List<UserExcel> selectUserExportData(@Param(Constants.WRAPPER) QueryWrapper<UserExcel> wrapper);

    List<StoreMemberCountDto> selectStoreMemberCountGroup(@Param("storeIds") Set<Integer> storeIds);

    List<StoreMemberIdsDto> selectUserIdsByIsStoreMember(@Param("storeIds") Set<Integer> storeIds);

    List<UserManagerVo> userManagerVoPage(Page<UserManagerVo> userManagerVoPage,
                                          @Param("realname") String realname,
                                          @Param("nickname") String nickname,
                                          @Param("isLock") String isLock,
                                          @Param("start") Long start,
                                          @Param("end") Long end);

    UserDto getUserByCompanyId(@Param("companyId") Long companyId);
}


