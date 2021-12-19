<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%
    HttpSession nsession = request.getSession(false);
//    String email = request.getParameter("username");
    if(nsession!=null) {
        String data = (String) session.getAttribute("name");
        if (data != null) {
            response.sendRedirect(request.getContextPath() + "/form");
        }
    }
    if(null != request.getParameter("submit")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null || password == null || username.trim().equals("") || password.trim().equals("")) {
            request.setAttribute("errorMessage", "Invalid username or password");

        } else {
            RequestDispatcher rs = request.getRequestDispatcher("Login");
            rs.forward(request, response);
        }
    }
%>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<div>${userMessage}</div>
<div style="color:red">${errorMessage}</div>
<h1><%= "Enter username and password" %>
</h1>
<br/>
<form name="f" action="" method="POST">
    <table>
        <tbody>
        <tr>
            <td>User:</td>
            <td><input type="text" name="username" value="" size="50"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" size="50"></td>
        </tr>
        <tr>
            <td colspan="2"><input name="submit" type="submit" value="Login"></td>
        </tr>
        </tbody>
    </table>
</form>
<br/>
</body>
</html>