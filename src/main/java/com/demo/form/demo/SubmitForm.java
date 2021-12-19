package com.demo.form.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SubmitForm {

   public Boolean submit(String username, String name, String address, String phone, String city, String state, String country,String pincode )
    {
        Boolean submit=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/secure_deployment","root","surbhigrover");

            // create a sql date object so we can use it in our INSERT statement
                       // the mysql insert statement
            String query = "  insert into go_get_form (username, name, address, phone, city, state, country, pincode)\n" +
                    "    values (?,?,?,?,?,?,?,?);";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, username);
            preparedStmt.setString (2, name);
            preparedStmt.setString   (3, address);
            preparedStmt.setString(4, phone);
            preparedStmt.setString    (5, city);
            preparedStmt.setString    (6, state);
            preparedStmt.setString    (7, country);
            preparedStmt.setString    (8, pincode);


            // execute the preparedstatement
            preparedStmt.execute();
            submit=true;
            con.close();
        }
        catch (Exception e)
        {
            submit=false;
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return submit;
    }
}