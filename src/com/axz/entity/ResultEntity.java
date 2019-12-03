package com.axz.entity;

public class ResultEntity<T> {
    private int code;
    private String msg;
    private T data;

    public ResultEntity(T data) {
        this.code = 1;
        this.msg = "成功";
        this.data = data;
    }

    private ResultEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
