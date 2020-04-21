package com.springMvc.handleradapter;

import com.springMvc.handle.iface.SimpleControllerHandler;
import com.springMvc.handleradapter.iface.HandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SimpleControllerHandler的适配器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 21:00
 * @Version 1.0
 */
public class SimpleControllerHandlerAdapter implements HandlerAdapter {
    @Override
    public void handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response) {
        SimpleControllerHandler simpleControllerHandler = (SimpleControllerHandler) handler;
        simpleControllerHandler.handleRequest(request, response);
    }
}
