package com.example.test;

public class recyclerviewData {
    private int img_path;
    private String pro_name;


    public recyclerviewData(int img_path, String pro_name) {
        this.img_path = img_path;
        this.pro_name = pro_name;
    }

    public int getImg_path() {
        return img_path;
    }

    public void setImg_path(int img_path) {
        this.img_path = img_path;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }
}
