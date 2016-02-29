<%-- 
    Document   : PaginaPrincipal
    Created on : 30/12/2015, 01:07:02 PM
    Author     : Hacybeyker
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
String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
    if(cookie.getName().equalsIgnoreCase("usuario")) userName = cookie.getValue();
}
}
if(userName == null) response.sendRedirect("index.jsp");
%>
<h3>Hi <%= userName %>, Login successful.</h3>
<br>
<form action="CerrarSesion" method="post">
<input type="submit" value="Logout" >
</form>
        <h1>Hello World!</h1>
    </body>
</html>
