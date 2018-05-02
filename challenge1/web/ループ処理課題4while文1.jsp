<%-- 
    Document   : ループ処理課題4while文1
    Created on : 2018/05/02, 11:22:33
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
float num = 1000;

while(num > 100 ){
    num /= 2;
}
out.print(num);
%>
    </body>
</html>
