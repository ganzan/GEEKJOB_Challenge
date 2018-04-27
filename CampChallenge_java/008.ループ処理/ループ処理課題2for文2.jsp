<%-- 
    Document   : ループ処理課題2for文2
    Created on : 2018/04/27, 16:52:05
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
String moji = "A";
for (int i = 0; i <30; i++){
    moji = moji +"A";
}out.print(moji);
%>
    </body>
</html>
