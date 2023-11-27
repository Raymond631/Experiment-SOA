package com.example.exp02.common.response;

import com.example.exp02.common.constants.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {
    /**
     * 消息状态码
     */
    private int code;
    /**
     * 消息内容
     */
    private String msg;
    /**
     * 消息对象
     */
    private Object data;
    /**
     * 下一步该调用的url
     */
    private String url;

    public static CommonResponse success(String msg, Object data, String url) {
        return new CommonResponse(HttpStatus.SUCCESS, msg, data, url);
    }

    public static CommonResponse success(String url) {
        return new CommonResponse(HttpStatus.SUCCESS, "操作成功", null, url);
    }

    public static CommonResponse error(String msg, String url) {
        return new CommonResponse(HttpStatus.ERROR, msg, null, url);
    }
}
