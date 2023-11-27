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

    public static CommonResponse success(int code, String msg, Object data, String url) {
        return new CommonResponse(code, msg, data, url);
    }

    /**
     * 查询成功，返回数据
     */
    public static CommonResponse success(Object data) {
        return new CommonResponse(HttpStatus.SUCCESS, "操作成功", data, "http://localhost:8081/swagger-ui/index.html");
    }

    /**
     * “增、删、改”成功，返回消息
     */
    public static CommonResponse success() {
        return CommonResponse.success(null);
    }

    /**
     * 异常拦截响应
     */
    public static CommonResponse error(String msg) {
        return new CommonResponse(HttpStatus.ERROR, msg, null, "http://localhost:8081/swagger-ui/index.html");
    }
}
