package com.example.exp02.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonRequest {

    private int code;       //success:200;fail:500;
    private String msg;     //tips
    private Object data;    //数据


    public JsonRequest(int code, String msg, Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static JsonRequest error(String msg){
        return new JsonRequest(500, msg, null);
    }

    public static JsonRequest error(String msg, Object data){
        return new JsonRequest(500, msg, data);
    }

    public static JsonRequest success(){
        return new JsonRequest(200, "Success", null);
    }

    public static JsonRequest success(Object data){
        return new JsonRequest(200, "Success", data);
    }
}
