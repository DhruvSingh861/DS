<%-- 
    Document   : LoginCheck
    Created on : 31 May, 2021, 2:47:03 PM
    Author     : Anil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%
     String name=request.getParameter("name");
     String pass=request.getParameter("password");
     if(name.equals("DHRUV") && pass.equals("SINGH")){
         out.print("Welcom "+ name);
     }
     else{
         response.sendRedirect("Error.jsp");
     }
 %>
    </body>
</html>
