
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%
        HttpSession nsession = request.getSession(false);
//    String email = request.getParameter("username");
        if(nsession!=null) {
            String data=(String)nsession.getAttribute( "name" );
            session.invalidate();
            if(data!=null){
            %>
   <h1>Thank you for submitting your details.</h1>
<%
        }
        else {
%>
    <div>Please login first</div>
<%
        }
    }
    else {
%>
    <div>Please login first! </div>
<%
    }
%>
</head>
<body>

</body>
</html>
