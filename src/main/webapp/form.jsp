<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
<%
    HttpSession nsession = request.getSession(false);
//    String email = request.getParameter("username");
    if(nsession!=null) {
        String data=(String)nsession.getAttribute( "name" );
        if(data!=null){

%>
<div style="color:red">${errorMessage}</div>
<h1>Please fill the below form.</h1>
<p>All the fields are required to be filled</p>

<form name="f" action="formSubmit" method="POST">
    <table>
        <tbody>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" size="40"></td>
            </tr>

            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" size="50"></td>
            </tr>
            <tr>
                <td>Phone number:</td>
                <td><input type="text" name="phone" size="10"></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><input type="text" name="city" size="50"></td>
            </tr>
            <tr>
                <td>State:</td>
                <td><input type="text" name="state" size="50"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" size="60"></td>
            </tr>
            <tr>
                <td>Pincode:</td>
                <td><input type="text" name="pincode" size="10"></td>
            </tr>
        <tr><td colspan="2"><input name="submit" type="submit" value="Submit"></td></tr>
        <input name="_csrf" type="hidden" value="69763001-d32d-463f-9b80-d86ae8afd3b9">
        </tbody></table>
</form>
<%
        }
        else {
            %>
    <div>Please login first</div>
<%
//            request.setAttribute("userMessage", "Session is active " + data);
        }
    }
    else {
%>
<div>Please login first! </div>
<%
    }
%>
</body>
</html>
