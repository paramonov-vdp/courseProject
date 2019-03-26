
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel ="stylesheet" href = "/style/lab.css">
    </head>
    <body>


    <c:if test="${not empty list}">
        <p>Компетентность первого эксперта: ${list[0]}</p>
        <p>Компетентность второго эксперта: ${list[1]}</p>
        <p>Компетентность Третьего эксперта: ${list[2]}</p>
        <p>Компетентность четвертого эксперта: ${list[3]}</p>
    </c:if>


    <a href="/four">Четвертый тест</a>
    <a href="/mainpage">Главная</a>










    </body>
</html>