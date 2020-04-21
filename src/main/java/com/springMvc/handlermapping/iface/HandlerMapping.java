package com.springMvc.handlermapping.iface;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理器映射器
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:29
 * @Version 1.0
 */
public interface HandlerMapping {

    Object getHandler(HttpServletRequest request);
}
