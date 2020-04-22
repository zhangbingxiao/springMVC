package com.springMvc.servlet;

import com.springMvc.handle.iface.HttpRequestHandler;
import com.springMvc.handle.iface.SimpleControllerHandler;
import com.springMvc.handleradapter.HttpRequestHandlerAdapter;
import com.springMvc.handleradapter.SimpleControllerHandlerAdapter;
import com.springMvc.handleradapter.iface.HandlerAdapter;
import com.springMvc.handlermapping.BeanNameUrlHandlerMapping;
import com.springMvc.handlermapping.SimpleUrlHandlerMapping;
import com.springMvc.handlermapping.iface.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 前端控制器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:23
 * @Version 1.0
 */
public class DispatcherServlet extends AbstractHttpServlet {

    @Override
    public void doDispath(HttpServletRequest request, HttpServletResponse response) {
        //1、查找处理器（映射期）
        Object handle = getHandle(request);
        if (handle == null) {
            return;
        }
        //2、执行处理器中的方法
        HandlerAdapter ha = getHandleAdapter(handle);

        //3、执行并相应结果
        ha.handleRequest(handle,request,response);
    }

    /**
     * 获取处理器适配器
     * @param handle
     * @return
     */
    private HandlerAdapter getHandleAdapter(Object handle) {

        if (handle instanceof HttpRequestHandler) {
            return new HttpRequestHandlerAdapter();
        } else if (handle instanceof SimpleControllerHandler) {
            return new SimpleControllerHandlerAdapter();
        }
        return null;
    }

    /**
     * 查找处理器
     *
     * @param request
     * @return
     */
    private Object getHandle(HttpServletRequest request) {
        //匹配处理器
        HandlerMapping ha = null;
        Object handler = null;
        ha = new BeanNameUrlHandlerMapping();
        handler = ha.getHandler(request);
        if (handler != null) {
            return handler;
        }
        ha = new SimpleUrlHandlerMapping();
        handler = ha.getHandler(request);
        if (handler != null) {
            return handler;
        }
        return null;
    }
}
