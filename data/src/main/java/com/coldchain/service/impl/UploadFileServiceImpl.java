package com.coldchain.service.impl;

import com.coldchain.service.UploadFileService;
import com.common.exception.ShopException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Random;

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Value("${spring.resources.static-locations}")
    private String staticLocation;

    @Override
    public String uploadImage(MultipartFile file, String type) {
        //文件大小限制
        Long imageMaxSize = 52428800L;
        if (file.getSize() > imageMaxSize) {
            throw new ShopException(-19000, "上传图片文件不能超过" + imageMaxSize / 1024 / 1024 + "M");
        }

        //  ../public/upload
        String uploadPath = staticLocation.substring(staticLocation.indexOf(":") + 1) + "/upload";
        //文件保存路径
        StringBuilder filePath = new StringBuilder(uploadPath);
        //保存到对应文件夹下对应当天日期文件夹
        String year = Calendar.getInstance().get(Calendar.YEAR) + "";
        String monthWithDay = Calendar.getInstance().get(Calendar.MONTH) + 1 + "-" + Calendar.getInstance().get(Calendar.DATE);
        filePath.append("/").append(type).append("/").append(year).append("/").append(monthWithDay).append("/");

        //随机文件名
        String originalFilename = file.getOriginalFilename();
        assert originalFilename != null;
        String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
        String randomFileName = new Random().nextInt(10000) + System.currentTimeMillis() + fileSuffix;
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(filePath.append(randomFileName).toString());
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
            }
            Files.write(path, bytes);
            String pathStr = path.toString().replace("\\", "/");
            //数据库保存路径
            return pathStr.substring(pathStr.indexOf(uploadPath.substring(uploadPath.indexOf("/"))));
        } catch (IOException e) {
            e.printStackTrace();
            throw new ShopException(-19002,"上传失败");
        }
    }
}
