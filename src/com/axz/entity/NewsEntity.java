package com.axz.entity;

import java.sql.Timestamp;

public class NewsEntity {

    private int newsID;
    private String newsTitle;
    private String newsContent;
    private String newDate;
    private String newsDesc;
    private String newsImagePath;
    private int newRate;
    private boolean newsIscheck;
    private boolean newsIstop;

    public NewsEntity() {
    }

    public NewsEntity(int newsID, String newsTitle, String newsContent, String newDate, String newsDesc, String newsImagePath, int newRate, boolean newsIscheck, boolean newsIstop) {
        this.newsID = newsID;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newDate = newDate;
        this.newsDesc = newsDesc;
        this.newsImagePath = newsImagePath;
        this.newRate = newRate;
        this.newsIscheck = newsIscheck;
        this.newsIstop = newsIstop;
    }

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewDate() {
        return newDate;
    }

    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsImagePath() {
        return newsImagePath;
    }

    public void setNewsImagePath(String newsImagePath) {
        this.newsImagePath = newsImagePath;
    }

    public int getNewRate() {
        return newRate;
    }

    public void setNewRate(int newRate) {
        this.newRate = newRate;
    }

    public boolean isNewsIscheck() {
        return newsIscheck;
    }

    public void setNewsIscheck(boolean newsIscheck) {
        this.newsIscheck = newsIscheck;
    }

    public boolean isNewsIstop() {
        return newsIstop;
    }

    public void setNewsIstop(boolean newsIstop) {
        this.newsIstop = newsIstop;
    }


}
