package com.springMvc.handlermapping.iface;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理器映射器接口
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:29
 * @Version 1.0
 */
public interface HandlerMapping {

    /**
     * 获取相应的处理器
     * @param request
     * @return
     */
    Object getHandler(HttpServletRequest request);
}
