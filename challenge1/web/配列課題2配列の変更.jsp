<%-- 
    Document   : 配列課題2配列の変更
    Created on : 2018/04/27, 14:07:14
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
<%@page import="java.util.ArrayList" %>
<%
ArrayList<String> data = new ArrayList<String>();

data.add("10");
data.add("100");
data.add("soeda");
data.add("hayashi");
data.add("-20");
data.add("18");
data.add("END");

out.print(data.get(0));out.print("<br>");
out.print(data.get(1));out.print("<br>");
out.print(data.get(2));out.print("<br>");
out.print(data.get(3));out.print("<br>");
out.print(data.get(4));out.print("<br>");
out.print(data.get(5));out.print("<br>");
out.print(data.get(6));out.print("<br>");

data.set(2, "33");//"soeda"を"33"に書き換え

out.print("<br><br>");
out.print(data.get(0));out.print("<br>");
out.print(data.get(1));out.print("<br>");
out.print(data.get(2));out.print("<br>");
out.print(data.get(3));out.print("<br>");
out.print(data.get(4));out.print("<br>");
out.print(data.get(5));out.print("<br>");
out.print(data.get(6));out.print("<br>");


%>
    </body>
</html>
