package cn.servlet.hello;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Aservlet",urlPatterns = "/first")
public class Aservlet implements Servlet{
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Aservelt init 方法被调用了");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.getWriter().println("hello world");
		System.out.println("Aservelt service 方法被调用了");
		
	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;

	}
	@Override
	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("Aservelt destory 方法被调用了");
	}

}
