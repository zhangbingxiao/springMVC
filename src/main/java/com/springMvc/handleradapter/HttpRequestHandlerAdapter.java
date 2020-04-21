package com.springMvc.handleradapter;

import com.springMvc.handle.iface.HttpRequestHandler;
import com.springMvc.handleradapter.iface.HandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HttpRequestHandler的适配器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:48
 * @Version 1.0
 */
public class HttpRequestHandlerAdapter implements HandlerAdapter {
    @Override
    public void handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response) {
        HttpRequestHandler requestHandler = (HttpRequestHandler) handler;
        requestHandler.handleRequest(request, response);
    }
}
