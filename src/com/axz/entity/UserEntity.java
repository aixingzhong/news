package com.axz.entity;

public class UserEntity {
    private int user_id;
    private String name;
    private String phone;
    private String passwd;
    private String email;
    private String time;
    private String userimg;
    private int privately_owned;

    public UserEntity() {
    }

    public UserEntity(int user_id, String name, String phone, String passwd, String email, String time, String userimg, int privately_owned) {
        this.user_id = user_id;
        this.name = name;
        this.phone = phone;
        this.passwd = passwd;
        this.email = email;
        this.time = time;
        this.userimg = userimg;
        this.privately_owned = privately_owned;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public int getPrivately_owned() {
        return privately_owned;
    }

    public void setPrivately_owned(int privately_owned) {
        this.privately_owned = privately_owned;
    }
}
