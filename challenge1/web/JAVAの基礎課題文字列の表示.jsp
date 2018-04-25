<%-- 
    Document   : JAVAの基礎課題文字列の表示
    Created on : 2018/04/23, 17:24:50
    Author     : guest1Day
--%>
<% String name="私の名前は丸山瑛久です"; 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%out.print("Hello world.");%>
    </body>
</html>
