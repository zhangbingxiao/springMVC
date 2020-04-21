package com.springMvc.handle;

import com.springMvc.handle.iface.SimpleControllerHandler;
import com.springMvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangbingxiao
 * @Date 2020-04-21 20:35
 * @Version 1.0
 */
public class AddUserHandler implements SimpleControllerHandler {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().print("AddUserHandler");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
