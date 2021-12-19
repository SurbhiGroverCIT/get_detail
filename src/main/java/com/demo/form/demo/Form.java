package com.demo.form.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="formSubmit",value = "/formSubmit")
public class Form extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ValidateForm validateForm = new ValidateForm();
        SubmitForm submitForm=new SubmitForm();

        String username=getUsername(request);

        String name = request.getParameter("name");
        System.out.println("Name entered is "+name);

        String address = request.getParameter("address");
        System.out.println("Address entered is "+address);

        String phone_number = request.getParameter("phone");
        System.out.println("Number entered is "+phone_number);

        String city = request.getParameter("city");
        System.out.println("City entered is "+city);

        String state = request.getParameter("state");
        System.out.println("State entered is "+state);

        String country = request.getParameter("country");
        System.out.println("Country entered is "+country);

        String pincode = request.getParameter("pincode");
        System.out.println("Pincode entered is "+pincode);

        if(!validateForm.validateName(name)){
            request.getSession().setAttribute("errorMessage", "Invalid Name!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!validateForm.validateAddress(address)){
            request.getSession().setAttribute("errorMessage", "Invalid Address!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!validateForm.validatePhone(phone_number)){
            request.getSession().setAttribute("errorMessage", "Invalid Phone number!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!validateForm.validateCity(city)){
            request.getSession().setAttribute("errorMessage", "Invalid City!!");
            response.sendRedirect("/demo_war/form");
        }
        else if (!validateForm.validateState(state)){
            request.getSession().setAttribute("errorMessage", "Invalid State!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!validateForm.validateCountry(country)){
            request.getSession().setAttribute("errorMessage", "Invalid Country!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!validateForm.validatePincode(pincode)){
            request.getSession().setAttribute("errorMessage", "Invalid Pincode!!");
            response.sendRedirect("/demo_war/form");
        }
        else if(!submitForm.submit(username,name,address,phone_number,city,state,country,pincode)){
            request.getSession().setAttribute("errorMessage", "Something went wrong! Please try again!!");
            response.sendRedirect("/demo_war/form");
        }
        else {
            response.sendRedirect(request.getContextPath() + "/success");

        }




//        PrintWriter out = response.getWriter();
//        out.println("Welcome user");
    }

    private String getUsername(HttpServletRequest request) {
        String data = null;
        HttpSession nsession = request.getSession(false);
        if(nsession!=null) {
            data = (String) nsession.getAttribute("name");
        }
        System.out.println("username is still there "+data);
        return data;
        
    }

}
