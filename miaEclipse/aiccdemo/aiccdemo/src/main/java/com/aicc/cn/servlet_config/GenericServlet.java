package com.aicc.cn.servlet_config;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

    public abstract class GenericServlet implements Servlet, ServletConfig {

        private ServletConfig config;

        @Override
        public void init(ServletConfig arg0) throws ServletException {
            this.config = arg0;
            this.init();
        }
        public void init(){

        }

        @Override
        public ServletConfig getServletConfig() {
            return config;
        }

        @Override
        public abstract void service(ServletRequest arg0, ServletResponse arg1)
                throws ServletException, IOException;



        @Override
        public String getServletInfo() {
            return "";
        }

        @Override
        public void destroy() {

        }

        @Override
        public String getServletName() {
            return getServletConfig().getServletName();
        }

        @Override
        public ServletContext getServletContext() {
            return getServletConfig().getServletContext();
        }

        @Override
        public String getInitParameter(String arg0) {
            return getServletConfig().getInitParameter(arg0);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return getServletConfig().getInitParameterNames();
        }
    }
