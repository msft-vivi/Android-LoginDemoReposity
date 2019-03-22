package com.zhangwei.util;

/**
 * Created by zhangwei on 2018/3/8.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil{
    private static Connection conn;
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/logindemo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123";
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        try{
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConn(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}

