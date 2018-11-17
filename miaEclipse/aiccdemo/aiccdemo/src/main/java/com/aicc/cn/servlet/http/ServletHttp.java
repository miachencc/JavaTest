package com.aicc.cn.servlet.http;

import com.aicc.cn.servlet_config.GenericServlet;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class ServletHttp extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        //优化 我们开发项目都是基于http协议的，而且服务器在service方法中传给的servletrequest就是httpservletrequest
        // request和 respond强转成http
        HttpServletRequest request= null;
        HttpServletResponse response= null;
        service(request,response);
        try{
            request = (HttpServletRequest) req;
            response = (HttpServletResponse) resp;
        }catch(Exception e){

        }
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //优化二 ： 根据请求方式的不同 做不同的事情
        //1. 获得客户端的请求方式，2. 根据请求方式调用不同的方法
        String method=request.getMethod();
        if (method.equals("GET")){
            doGet(request,response);}
            else if(method.equals("POST")){
                doPost(request,response);
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) {

    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {

    }
}





