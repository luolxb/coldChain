package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.DataType;
import com.coldchain.project.business.dict.service.IDataTypeService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-数据类别Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictDataType")
public class DataTypeController extends BaseController
{
    private String prefix = "business/dictDataType";

    @Autowired
    private IDataTypeService dictDataTypeService;

    //("business:dictDataType:view")
    @GetMapping()
    public String dictDataType()
    {
        return prefix + "/dictDataType";
    }

    /**
     * 查询字典-数据类别列表
     */
    //("business:dictDataType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DataType dataType)
    {
        startPage();
        List<DataType> list = dictDataTypeService.selectDataTypeList(dataType);
        return getDataTable(list);
    }

    /**
     * 导出字典-数据类别列表
     */
    //("business:dictDataType:export")
    @Log(title = "字典-数据类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DataType dataType)
    {
        List<DataType> list = dictDataTypeService.selectDataTypeList(dataType);
        ExcelUtil<DataType> util = new ExcelUtil<DataType>(DataType.class);
        return util.exportExcel(list, "dictDataType");
    }

    /**
     * 新增字典-数据类别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-数据类别
     */
    //("business:dictDataType:add")
    @Log(title = "字典-数据类别", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DataType dataType)
    {
        return toAjax(dictDataTypeService.insertDataType(dataType));
    }

    /**
     * 修改字典-数据类别
     */
    @GetMapping("/edit/{dataTypeId}")
    public String edit(@PathVariable("dataTypeId") Integer dataTypeId, ModelMap mmap)
    {
        DataType dataType = dictDataTypeService.selectDataTypeById(dataTypeId);
        mmap.put("dataType", dataType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-数据类别
     */
    //("business:dictDataType:edit")
    @Log(title = "字典-数据类别", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DataType dataType)
    {
        return toAjax(dictDataTypeService.updateDataType(dataType));
    }

    /**
     * 删除字典-数据类别
     */
    //("business:dictDataType:remove")
    @Log(title = "字典-数据类别", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictDataTypeService.deleteDataTypeByIds(ids));
    }
}
