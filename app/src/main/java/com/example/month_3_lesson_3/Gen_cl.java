package com.example.month_3_lesson_3;

public class Gen_cl {
    private String name;
    private String desc;
    private String image;


    private String post;
    private String age;
    private String number;

    private String appName;
    private String time;
    private String status;
    private String ava;


    public Gen_cl(String name, String desc, String image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public Gen_cl(String name,String age, String post, String image) {
        this.name = name;
        this.age=age;
        this.post = post;
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAva() {
        return ava;
    }

    public void setAva(String ava) {
        this.ava = ava;
    }

    public Gen_cl(String appName, String time, String status, String ava,String number) {
        this.appName = appName;
        this.time=time;
        this.status = status;
        this.ava = ava;
        this.number=number;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}