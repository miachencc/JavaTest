package com.aicc.first;

import java.sql.*;

public class sqltest {

    //        public static void main(String[] args) throws SQLException {
//            //1.建立客户端
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123");
//            System.out.println(conn.isClosed());
//            //2.准备sql语句
//            Statement statement = conn.createStatement();//创建一个语句对象
//            //3.执行sql语句
//            //statement.executeUpdate("insert into student(sid,sname,birthday,sex) values(1010,'夏木','1998-08-08','女')");  //增删该
//            ResultSet result = statement.executeQuery("select * from user");//执行查询
//            while (result.next()){
//                System.out.println(result.getInt("sid")+"=="+result.getString("sname")+"=="+result.getDate("birthday")+"=="+result.getString("sex"));
//            }
//            //4.资源的清理
//            statement.close();
//            conn.close();
//        }
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test01";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from student";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("sid");
                String name = rs.getString("sname");
                //String url = rs.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                //System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }

}

