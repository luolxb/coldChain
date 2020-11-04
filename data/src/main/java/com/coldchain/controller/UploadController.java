package com.coldchain.controller;

import com.coldchain.service.UploadFileService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/upload")
@Api(value = "上传控制器", tags = {"上传相关控制器接口"})
public class UploadController {

    @Autowired
    private UploadFileService uploadFileService;

    @ApiOperation("上传图片")
    @PostMapping
    public SBApi singleFileUpload(@ApiParam("文件") @RequestParam("file") MultipartFile file,
                                  @ApiParam("图片类型") @RequestParam("type") String type) {
        return new SBApi(uploadFileService.uploadImage(file, type));
    }
}
