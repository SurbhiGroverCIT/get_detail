package com.demo.form.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateUser {

    public static boolean checkUser(String username, String pass) {
        {

            boolean st =false;
            if(username.trim().equals("") || username==null || username.length()>20 || !username.matches("^[a-zA-Z]*$")){
                System.out.println("Username is invalid");
                return st;
            }

            if(pass.trim().equals("") || pass==null || pass.length()>20){
                System.out.println("Password is invalid");
                return st;
            }
            try {
                //loading drivers for mysql
                Class.forName("com.mysql.jdbc.Driver");

                //creating connection with the database
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/secure_deployment","root","surbhigrover");
                PreparedStatement ps = con.prepareStatement("select * from user_login where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, pass);
                ResultSet rs =ps.executeQuery();
                while (rs.next()){
                    Boolean permission = rs.getBoolean("form_permission");
                    System.out.println("The permmission to access is "+permission);
                    st=permission;
                }
                }
                catch(Exception e) {
                e.printStackTrace();
            }
            return st;
        }
    }
}
