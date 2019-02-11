<%--
  Created by IntelliJ IDEA.
  User: chencong
  Date: 2019-01-29
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.aicc.first.GenerateId" %> <!-- 利用page指令导入jar包或者类对象 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<H2>
    <div class="col-md-2 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;"  >
        <p><font color="#E4393C" name="resid_1" style="font-size:16px"><%= GenerateId.getResponse1() %></font></p>
        <p><font color="#E4393C" name="resid_2" style="font-size:16px"><%= GenerateId.getResponse1() %></font></p>
        <p><font color="#E4393C" name="resid_3" style="font-size:16px"><%= GenerateId.getResponse1() %></font></p>

    </div>

</H2>
</body>
</html>
