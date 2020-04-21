package com.springMvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 前端控制器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:09
 * @Version 1.0
 */
public abstract class AbstractHttpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doDispath(request, response);
    }

    public abstract void doDispath(HttpServletRequest request, HttpServletResponse response);
}
