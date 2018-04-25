<%-- 
    Document   : 課題文字列1文字の連結表示
    Created on : 2018/04/25, 14:39:03
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
<%
String A = "groove";
String B = "-";
String C = "gear";

out.print(A + B + C);
%>
    </body>
</html>
