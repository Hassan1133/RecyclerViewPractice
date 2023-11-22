package com.example.recyclerview;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String desc;
    private int img;
    private int checkImg;
    private String time;

    public User(String name, String desc, int img, int checkImg, String time) {
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.checkImg = checkImg;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }

    public int getCheckImg() {
        return checkImg;
    }

    public String getTime() {
        return time;
    }
}
