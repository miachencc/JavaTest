<%--
  Created by IntelliJ IDEA.
  User: chencong
  Date: 2019-01-29
  Time: 10:48
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
        String url = "jdbc:mysql://10.110.10.4:21002/god"; //数据库名
        String username = "root";  //数据库用户名
        String password = "@WSX#EDC6yhn";  //数据库用户密码
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
        String sql = "SELECT ge_dq,ejob_id FROM god_ejob;";  //查询语句
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        out.print("查询结果：");
        out.print("<br/>");
        while (rs.next()) {%>
    <tr>
        <td width="100" resId="resId"><%=rs.getString("ge_dq") %></td>
        <td width="100" resName="resName"><%=rs.getString("ejob_id") %></td>
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