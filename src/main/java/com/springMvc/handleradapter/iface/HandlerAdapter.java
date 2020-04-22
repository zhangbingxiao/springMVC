package com.springMvc.handleradapter.iface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理器适配器接口
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:48
 * @Version 1.0
 */
public interface HandlerAdapter {

    /**
     * 处理器适配器接口
     * @param handler
     * @param request
     * @param response
     */
    void handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response);
}
