package com.springMvc.handlermapping;

import com.springMvc.handlermapping.iface.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 通过bean标签的；props属性去查找处理器映射器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 21:04
 * @Version 1.0
 */
public class SimpleUrlHandlerMapping implements HandlerMapping {
    @Override
    public Object getHandler(HttpServletRequest request) {
        // TODO Auto-generated method stub
        return null;
    }
}
