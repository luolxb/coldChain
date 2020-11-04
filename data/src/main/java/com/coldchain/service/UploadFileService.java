package com.coldchain.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {

    //上传图片
    String uploadImage(MultipartFile file, String type);
}
