package com.springcloud.entity.entity;

public class Res<T> {
    private int code;
    private String message;
    private T data;

    public static <T> Res success(T data) {
        Res res = new Res();
        res.setCode(200);
        res.setMessage("success");
        res.setData(data);
        return res;
    }

    public static <T> Res success(int code, String message, T data) {
        return Exception(code, message, data);
    }

    public static <T> Res Exception(int code, String message, T data) {
        Res res = new Res();
        res.setCode(code);
        res.setMessage(message);
        res.setData(data);
        return res;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
