package com.demo.form.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/")
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        System.out.println("email entered is "+username);

        String pass = request.getParameter("password");
        System.out.println("password entered is "+pass);

        if(ValidateUser.checkUser(username, pass))
        {
            HttpSession session=request.getSession();
            session.setAttribute("name",username);
            response.sendRedirect(request.getContextPath() + "/form");

        }
        else
        {
            request.getSession().setAttribute("errorMessage", "Invalid username or password");
            response.sendRedirect("/demo_war");
        }
    }
}
