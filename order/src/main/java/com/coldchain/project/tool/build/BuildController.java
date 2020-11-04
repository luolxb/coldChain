package com.coldchain.project.tool.build;

import com.coldchain.framework.web.controller.BaseController;
//
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * build 表单构建
 * 
 * @author nts
 */
@Controller
@RequestMapping("/tool/build")
public class BuildController extends BaseController
{
    private String prefix = "tool/build";

    //("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/build";
    }
}
