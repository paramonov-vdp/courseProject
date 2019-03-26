
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


    <c:if test="${not empty result}">
        <p>Компетентность первого эксперта: ${result[0]}</p>
        <p>Компетентность второго эксперта: ${result[1]}</p>
        <p>Компетентность Третьего эксперта: ${result[2]}</p>
        <p>Компетентность четвертого эксперта: ${result[3]}</p>
        <p>Компетентность четвертого эксперта: ${result[4]}</p>
    </c:if>


    <a href="/seven">Седьмой тест </a>
    <a href="/mainpage">Главная</a>

   </form>












    </body>
</html>