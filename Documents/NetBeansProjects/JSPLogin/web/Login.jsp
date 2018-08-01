<%-- 
    Document   : Login
    Created on : Jul 30, 2018, 11:43:59 AM
    Author     : Sunrays
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="get">
            Username :<input type="text" name="username">
            Password :<input type="text" name="password">
            <input type="submit" value="Log-IN">
        </form>
    </body>
</html>
