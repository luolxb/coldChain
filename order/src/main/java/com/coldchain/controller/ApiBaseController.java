package com.coldchain.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.sql.SqlUtil;
import com.coldchain.framework.web.page.PageDomain;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.framework.web.page.TableSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * API基础控制类
 * 创建时间：2019年11月20日
 */
public class ApiBaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 得到request对象
     */
    @Autowired
    protected HttpServletRequest request;
    /**
     * 得到response对象
     */
//    @Autowired
//    protected HttpServletResponse response;

    /**
     * initBinder 初始化绑定 <br>
     * 这里处理了3种类型<br>
     * 1、字符串自动 trim 去掉前后空格 <br>
     * 2、java.util.Date 转换为 "yyyy-MM-dd HH:mm:ss" 格式<br>
     * 3、java.sql.Date 转换为 "yyyy-MM-dd" 格式<br>
     * 4、java.util.Timestamps 时间转换
     *
     * @param binder  WebDataBinder 要注册的binder
     * @param request 前端请求
     */
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        // 字符串自动Trim
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
    }

    /**
     * 获取请求方IP
     *
     * @return 客户端Ip
     */
    public String getClientIp() {
        String xff = request.getHeader("x-forwarded-for");
        if (xff == null) {
            return request.getRemoteAddr();
        }
        return xff;
    }

    public JSONObject getJsonRequest() {
        JSONObject result = null;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = request.getReader();) {
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1) {
                sb.append(buff, 0, len);
            }
            result = JSONObject.parseObject(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage() {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage(Integer pageNum, Integer pageSize) {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        pageDomain.setPageNum(pageNum);
        pageDomain.setPageSize(pageSize);
        Integer pageNum_ = pageDomain.getPageNum();
        Integer pageSize_ = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum_) && StringUtils.isNotNull(pageSize_)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum_, pageSize_, orderBy);
        }
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected TableDataInfo getDataTable(List<?> list) {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }
}
