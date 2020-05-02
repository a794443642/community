package com.nuc.wcj.community.advice;

import com.nuc.wcj.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"com.nuc.wcj.community.controller"})
public class CustomsizeExceptionHandler{
    @ExceptionHandler(Exception.class)
    ModelAndView handle(HttpServletRequest request, Throwable ex) {
        ModelAndView modelAndView = new ModelAndView("errorPage");
        if (ex instanceof CustomizeException){
            modelAndView.addObject("message",ex.getMessage());
        }else {
            modelAndView.addObject("message","服务冒烟了,要不然你稍后再试试");
        }
        return modelAndView;
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
