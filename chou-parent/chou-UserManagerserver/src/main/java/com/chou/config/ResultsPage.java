package com.chou.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultsPage<T> implements Serializable {

    private T data;
    private Integer code;
    private String msg;

    public static <T>  ResultsPage<T> succeed(String msg){
        return succeedWith(null, CodeEnum.SUCCESS.getCode(), msg);
    }

    public static <T> ResultsPage<T> succeed(T model, String msg) {
        return succeedWith(model, CodeEnum.SUCCESS.getCode(), msg);
    }

    public static <T> ResultsPage<T> succeedWith(T data, Integer code, String msg) {
        return new ResultsPage<T>(data, code, msg);
    }

    public static <T> ResultsPage<T> Error(String msg) {
        return ErrorWith(null, CodeEnum.ERROR.getCode(), msg);
    }

    public static <T> ResultsPage<T> Error(T model, String msg) {
        return ErrorWith(model, CodeEnum.ERROR.getCode(), msg);
    }

    public static <T> ResultsPage<T> ErrorWith(T data, Integer code, String msg) {
        return new ResultsPage<T>(data, code, msg);
    }



}
