
package com.common.constant;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(
        prefix = "shop"
)
//@PropertySource({"classpath:shopConstant.properties"})
public class ShopConstant {
    private String goodsNoOriginalImage;
    private Integer orderGoodsBarCodeStart;
    private Integer orderGoodsBarCodeEnd;
    private String imageUpload;
    private Long imageMaxSize;
    private List<String> imageType;
    private String miniAppOauth;
    private Integer cartMostNum;

    public ShopConstant() {
    }

    public void setGoodsNoOriginalImage(String goodsNoOriginalImage) {
        this.goodsNoOriginalImage = goodsNoOriginalImage;
    }

    public void setOrderGoodsBarCodeStart(Integer orderGoodsBarCodeStart) {
        this.orderGoodsBarCodeStart = orderGoodsBarCodeStart;
    }

    public void setOrderGoodsBarCodeEnd(Integer orderGoodsBarCodeEnd) {
        this.orderGoodsBarCodeEnd = orderGoodsBarCodeEnd;
    }

    public void setImageUpload(String imageUpload) {
        this.imageUpload = imageUpload;
    }

    public void setImageMaxSize(Long imageMaxSize) {
        this.imageMaxSize = imageMaxSize;
    }

    public void setImageType(List<String> imageType) {
        this.imageType = imageType;
    }

    public void setMiniAppOauth(String miniAppOauth) {
        this.miniAppOauth = miniAppOauth;
    }

    public void setCartMostNum(Integer cartMostNum) {
        this.cartMostNum = cartMostNum;
    }

    public String getGoodsNoOriginalImage() {
        return this.goodsNoOriginalImage;
    }

    public Integer getOrderGoodsBarCodeStart() {
        return this.orderGoodsBarCodeStart;
    }

    public Integer getOrderGoodsBarCodeEnd() {
        return this.orderGoodsBarCodeEnd;
    }

    public String getImageUpload() {
        return this.imageUpload;
    }

    public Long getImageMaxSize() {
        return this.imageMaxSize;
    }

    public List<String> getImageType() {
        return this.imageType;
    }

    public String getMiniAppOauth() {
        return this.miniAppOauth;
    }

    public Integer getCartMostNum() {
        return this.cartMostNum;
    }
}
