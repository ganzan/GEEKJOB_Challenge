<%-- 
    Document   : ループ処理課題3for文3
    Created on : 2018/04/27, 17:11:34
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
int result = 1;
for (int i = 2;i<=100;i++){
    result += i;
}
out.print(result);
%>
    </body>
</html>
