<%-- 
    Document   : Login
    Created on : 30/12/2015, 12:56:32 PM
    Author     : Hacybeyker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loggin Sesion</title>
    </head>
    <body>
        <div align="center">
            <h1>Login con Sesión en JSP</h1>
            <form name="formLogin" action="IniciarSesion" method="post">
                <label>Usuario: </label><input type="text" name="usuario" id="usuario" placeholder="Usuario" autofocus="autofocus" autocomplete="" />
                <label>Password: </label><input type="password" name="password" id="password" placeholder="Password" autofocus="autofocus" autocomplete="" />
                <br><br>
                <input type="submit" value="Ingresar" />
            </form>
        </div>
    </body>
</html>
