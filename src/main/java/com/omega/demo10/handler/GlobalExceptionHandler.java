package com.omega.demo10.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Class ExceptionHandler
 *
 * @author KennySo
 * @date 2024/7/22
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常就不管是哪个 Handler 抛出的异常，都可以捕获
     */
    @ExceptionHandler({ClassCastException.class, NumberFormatException.class})
    public String globalException(Exception ex, HttpServletRequest request) {
        System.out.println("全局异常信息: " + ex.getMessage());
        request.setAttribute("reason", ex.getMessage());
        return "exception_page";
    }

}
