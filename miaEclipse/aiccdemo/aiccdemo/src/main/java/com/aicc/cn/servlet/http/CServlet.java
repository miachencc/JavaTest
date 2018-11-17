package com.aicc.cn.servlet.http;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static com.aicc.utils.GetRequestJsonUtils.getRequestPostStr;


public class CServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //设置字符编码
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        resp.setCharacterEncoding("UTF-8");

        // 设置头信息
        resp.setHeader("Content-type","text/html;charset=UTF-8");
        //获取数据
       String username = req.getParameter("username");
        String password = req.getParameter("password");

       try {
            //resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().write(getRequestPostStr(req));
            resp.getWriter().flush();
            resp.getWriter().close();

          //  resp.sendRedirect(req.getContextPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("您现在使用的是GET方式访问");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
        System.out.println("您现在使用的是POST方式访问");
    }
}
