package com.aicc.cn.servlet_config;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;


public class BServlet implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取servlet的name
        String name = getServletConfig().getServletName();
        //将字符串输出到客户端浏览器
        servletResponse.getWriter().print(name+"<br/>");
        /*
        * String getInitParameter(String name)
        * Enumeration getInitParameterNames()
        *
        * */
        Enumeration<String> en = getServletConfig().getInitParameterNames();
        while(en.hasMoreElements()){
            String key =en.nextElement();
            String value = getServletConfig().getInitParameter(key);

            servletResponse.getWriter().print("key="+key+"value="+value+"</br>");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
