<%-- 
    Document   : hello
    Created on : Jul 2, 2018, 1:57:48 PM
    Author     : Sunrays
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% out.print(5*855); %><br><br>
        <% out.print("Today is:"+java.util.Calendar.getInstance().getTime().getMonth()); %>
    </body>
</html>
