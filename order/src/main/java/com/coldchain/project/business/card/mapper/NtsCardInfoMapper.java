package com.coldchain.project.business.card.mapper;

import com.coldchain.project.business.card.domain.NtsCardInfo;
import com.coldchain.project.business.card.domain.NtsCardInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.coldchain.project.business.card.mapper
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 16:52
 **/
public interface NtsCardInfoMapper {

    /**
     * 根据iccid获取4G卡信息
     *
     * @param ntsCardInfo
     * @return
     */
    List<NtsCardInfoVo> selectNtsCardInfoList(NtsCardInfo ntsCardInfo);

    /**
     * 新增4G卡信息
     *
     * @param cardInfo
     * @return
     */
    Integer insertCardInfo(NtsCardInfo cardInfo);

    /**
     * 修改物联卡信息
     *
     * @param ntsCardInfo
     * @return
     */
    Integer updateCardInfo(NtsCardInfo ntsCardInfo);

    /**
     * 获取物联卡的状态
     *
     * @param userId
     * @return
     */
    Map<String, Object> getSatStatus(@Param("userId") Long userId);
}
