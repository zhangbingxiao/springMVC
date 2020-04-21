package com.springMvc.handle;

import com.springMvc.handle.iface.HttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:41
 * @Version 1.0
 */
public class QueryUserHandler implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().print("QueryUserHandler");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
