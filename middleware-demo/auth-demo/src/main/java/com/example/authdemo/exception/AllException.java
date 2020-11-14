package com.example.authdemo.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class AllException {

    /// 角色權权限异常捕捉
    @ExceptionHandler(value = UnauthorizedException.class)
    @ResponseBody // 在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public String roleException(UnauthorizedException e) {
        log.error("" , e);
        return "角色权限不够！！！";
        // return "/abc";
    }

    // 其它异常异常捕捉
    @ExceptionHandler(value = Exception.class)
    @ResponseBody // 在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public String allException(Exception e) {
        log.error("" , e);
        return "系統出现异常！！！";
    }

}
