package com.warmfrog.star.common;

import com.warmfrog.star.common.constant.StarConstant;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author libo
 * @date 2020/2/5
 */
public class Response implements Serializable {
    private String code;
    private Object data;
    private String message;

    public Response(String code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static Response successResponse(Object data){
        Response response = new Response(StarConstant.SUCCESS_CODE, data, StarConstant.SUCCESS_MSG);
        return response;
    }

    public static Response failResponse(){
        Response response = new Response(StarConstant.FAIL_CODE, new ArrayList<>(), StarConstant.FAIL_MSG);
        return response;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
