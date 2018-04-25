<%-- 
    Document   : if文課題3switch文2
    Created on : 2018/04/25, 16:39:22
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
char sample = 'あ';

switch(sample){
    case 'A':
        out.print("英語");
        break;
    case 'あ':
        out.print("日本語");
        break;
}
%>
    </body>
</html>
