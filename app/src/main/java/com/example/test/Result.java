package com.example.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("shop_url")
    @Expose
    private String shopUrl;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("pro_name")
    @Expose
    private String proName;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("delivery_fee")
    @Expose
    private String deliveryFee;
    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("img_path")
    @Expose
    private String imgPath;
    @SerializedName("wish")
    @Expose
    private String wish;
    @SerializedName("alram")
    @Expose
    private String alram;

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getAlram() {
        return alram;
    }

    public void setAlram(String alram) {
        this.alram = alram;
    }

}