package com.example.exp02.common.exception;


import com.example.exp02.common.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 业务异常
     */
    @ExceptionHandler(ServiceException.class)
    public CommonResponse handleServiceException(ServiceException e, HttpServletRequest request) {
        log.error(e.getMessage(), e);
        return CommonResponse.error(e.getMessage(),null);
    }

    /**
     * 参数校验异常
     */
    @ExceptionHandler(BindException.class)
    public CommonResponse handleBindException(BindException e) {
        String message = e.getAllErrors().get(0).getDefaultMessage();
        log.error(e.getMessage(), e);
        return CommonResponse.error(message,null);
    }

    /**
     * 系统异常
     */
    @ExceptionHandler(Exception.class)
    public CommonResponse handleException(Exception e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}',发生系统异常.", requestURI, e);
        return CommonResponse.error("服务器繁忙，请稍后再试~",null);
    }
}
