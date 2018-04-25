<%-- 
    Document   : 四則演算課題1変数の宣言と表示（四則演算）
    Created on : 2018/04/25, 11:52:18
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
int BASE = 100;

int num1 = 1;

//足し算
out.print(num1+BASE); out.print("<br>");

//引き算
out.print(num1-BASE);out.print("<br>");

//掛け算
out.print(num1*BASE);out.print("<br>");

//割り算
out.print(BASE/num1);out.print("<br>");

//足してから表示
out.print(++num1);out.print("<br>");

//引いてから表示
out.print(--num1);out.print("<br>");

//表示してから引く
out.print(num1--);out.print("<br>");

//表示してから足す
out.print(num1++);out.print("<br>");

//
out.print(num1);out.print("<br>");num1 = 100+50;out.print(num1);
%>
    </body>
</html>
