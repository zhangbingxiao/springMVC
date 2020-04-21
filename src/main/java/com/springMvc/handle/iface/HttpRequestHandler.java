package com.springMvc.handle.iface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 制定一个处理器类的编写标准
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:35
 * @Version 1.0
 */
public interface HttpRequestHandler {

    void handleRequest(HttpServletRequest request, HttpServletResponse response);
}
