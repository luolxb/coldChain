package com.common.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@Component
@Slf4j
@ConfigurationProperties(prefix = "qrcode")
public class QRCodeGenerator {

    private String filePath;

    /***
     * 生产二维码
     * @param text
     * @return
     * @throws WriterException
     * @throws IOException
     */
    public String generateQRCodeImage(String text) throws WriterException, IOException {

//        String filePath = "D:\\MyQRCode.png";
//        String filePath = "../public/QRcode/MyQRCode.png";
//        String file = "http://mall.ntscic.cn/order/file/MyQRCode.png";
//        String file = "http://192.162.168.31.162/order/file/MyQRCode.png";
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 350, 350);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
        return filePath.substring(2);
    }

}
