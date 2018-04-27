<%-- 
    Document   : ループ処理課題1for文1
    Created on : 2018/04/27, 15:51:46
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
long result = 1;
for (int i = 1; i <=20; i++){
    result = result*8;    
    result *= 8;    
}
out.print(result);
%>

    </body>
</html>
