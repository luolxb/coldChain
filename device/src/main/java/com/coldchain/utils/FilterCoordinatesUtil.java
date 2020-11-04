package com.coldchain.utils;

import com.coldchain.entity.CpDevice;

import java.util.ArrayList;
import java.util.List;

public class FilterCoordinatesUtil {
    /**
     * 过滤相同坐标，俩坐标之间有相同坐标，只保留GPS时间最小和最大的坐标
     *
     * @param list
     * @return
     */
    public static List<CpDevice> filterCoordinates(List<CpDevice> list) {
        List<CpDevice> resultList = new ArrayList<>();
        String curr_lng = "";
        String curr_lat = "";
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            CpDevice cpDevice = list.get(i);
            if ("".equals(curr_lng) && "".equals(curr_lat)) {
                // 初始坐标
                curr_lng = cpDevice.getLng();
                curr_lat = cpDevice.getLat();
                resultList.add(cpDevice);
            } else {
                // 坐标不相同，保存当前坐标和上一坐标
                if (!curr_lng.equals(cpDevice.getLng()) && !curr_lat.equals(cpDevice.getLat())) {
                    curr_lng = cpDevice.getLng();
                    curr_lat = cpDevice.getLat();
                    if (num > 0) {
                        // 保存相同坐标的GPS时间最大的坐标
                        resultList.add(list.get(i - 1));
                    }
                    // 当前坐标
                    resultList.add(cpDevice);
                    // 重置
                    num = 0;
                } else {
                    //相同坐标,累计计数
                    num++;
                }
            }
        }
        return resultList;
    }

    /**
     * 过滤相同坐标，俩坐标之间有相同坐标，只保留GPS时间最小和最大的坐标
     *
     * @param list
     * @return
     */
    public static List<com.common.dto.CpDeviceDto>  filterTrajectory(List<com.common.dto.CpDeviceDto> list) {
        List<com.common.dto.CpDeviceDto> resultList = new ArrayList<>();
        String curr_lng = "";
        String curr_lat = "";
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            com.common.dto.CpDeviceDto message = list.get(i);
            if ("".equals(curr_lng) && "".equals(curr_lat)) {
                // 初始坐标
                curr_lng = message.getLng();
                curr_lat = message.getLat();
                resultList.add(message);
            } else {
                // 坐标不相同，保存当前坐标和上一坐标
                if (!curr_lng.equals(message.getLng()) && !curr_lat.equals(message.getLat())) {
                    curr_lng = message.getLng();
                    curr_lat = message.getLat();
                    if (num > 0) {
                        // 保存相同坐标的GPS时间最大的坐标
                        resultList.add(list.get(i - 1));
                    }
                    // 当前坐标
                    resultList.add(message);
                    // 重置
                    num = 0;
                } else {
                    //相同坐标,累计计数
                    num++;
                }
            }
        }
        return resultList;
    }
}
