package com.springMvc.handlermapping;

import com.springMvc.handle.AddUserHandler;
import com.springMvc.handle.QueryUserHandler;
import com.springMvc.handlermapping.iface.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Hashtable;
import java.util.Map;

/**
 * 通过bean标签的name属性去查找处理器映射器
 *
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:29
 * @Version 1.0
 */
public class BeanNameUrlHandlerMapping implements HandlerMapping {

    private Map<String, Object> urlHandlerMap = new Hashtable<>();

    public BeanNameUrlHandlerMapping() {
        init();
    }

    public void init(){
        urlHandlerMap.put("/queryUser",new QueryUserHandler());
        urlHandlerMap.put("/saveUser",new AddUserHandler());
    }
    @Override
    public Object getHandler(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return urlHandlerMap.get(requestURI);
    }
}
