package com.yuqiyu.chapter24;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: ycig
 * @Date: 2018/7/25 16:40
 * @Description:
 */
@ControllerAdvice
@RestController
public class MyExceptionHandler {

    @ExceptionHandler
    public String myExceptionHandler(Exception e){
        return e.getMessage();
    }
}
