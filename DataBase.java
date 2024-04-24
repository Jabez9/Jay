package com.mycompany.gui;

import java.sql.*;

public class DataBase {
    public static void main(String[] args) {
        try {
            // or Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Class.forName("com.mysql.cj.jdbc.Driver");
            // String url =
            // "jdbc:mysql://localhost.3306/dbusername=StaffDB&&password=Mukoshi1";
            String url = "jdbc:mysql://localhost:3306/StaffDB";
            String username = "Huya";
            String password = "Mukoshi1";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            // st.execute("create table ")
            st.executeQuery("select* from Department");
            ResultSet rs = st.getResultSet();
            if (rs != null) {
                while (rs.next()) {
                    String uname = rs.getString(2);
                    String pword = rs.getString("Password");

                }
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        ;
    }

    // private static Connection DriverManager(String url,String username,String
    // password) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'DriverManager'");
    // }

}
