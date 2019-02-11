<%--
  Created by IntelliJ IDEA.
  User: chencong
  Date: 2019-01-28
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>  <%--导入java.sql包--%>
<html>
<head>
    <title >test</title>
</head>
<body>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");  ////驱动程序名
        String url = "jdbc:mysql://localhost:3306/test01"; //数据库名
        String username = "root";  //数据库用户名
        String password = "123";  //数据库用户密码
        Connection conn = DriverManager.getConnection(url, username, password);  //连接状态

        if(conn != null){
            out.print("数据库连接成功！");
            out.print("<br />");
%>
<table border="2">
    <tr>
        <td width="100" number="title">学号</td>
        <td width="100" name="title">姓名</td>
    </tr>
    <%
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM student;";  //查询语句
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        out.print("查询结果：");
        out.print("<br/>");
        while (rs.next()) {%>
    <tr>
        <td width="100" resId="resId"><%=rs.getString("sid") %></td>
        <td width="100" resName="resName"><%=rs.getString("sname") %></td>
    </tr>
    <%
                }
            }else{
                out.print("连接失败！");
            }
        }catch (Exception e) {
            //e.printStackTrace();
            out.print("数据库连接异常！");
        }
    %>
</table>
</body>
</html>

