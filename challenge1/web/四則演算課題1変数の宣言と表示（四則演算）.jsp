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
final int BASE = 90;

int num1 = 2;

//足し算
int tasi = BASE+num1;out.print(tasi); out.print("<br>");

//引き算
int hiki = BASE-num1;out.print(hiki);out.print("<br>");

//掛け算
int kake = BASE*num1;out.print(kake);out.print("<br>");

//割り算
int wari = BASE/num1;out.print(wari);out.print("<br>");

//
int amari =BASE%7;out.print(amari);out.print("<br>");
//足してから表示
out.print(++num1);out.print("<br>");

//引いてから表示
out.print(--num1);out.print("<br>");

//表示してから引く
out.print(num1--);out.print("<br>");

//表示してから足す
out.print(num1++);out.print("<br>");

//表示
out.print(num1);out.print("<br>");
%>
    </body>
</html>
