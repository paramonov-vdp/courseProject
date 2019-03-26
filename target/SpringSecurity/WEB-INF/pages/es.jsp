
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel ="stylesheet" href = "/style/main.css">
    </head>
    <body>

    


    <form name='Form' class= "form-horizontal" action="<c:url value='/postes' />" method='POST'>


        <div class ="es">





            <c:choose>
                <c:when test="${op.finalanswer!= null}">
                    <h1>Вам подходит</h1>
                    <p>${node}</p>
                    <p>${op.finalanswer}</p>

                    <a href="/maines">Еще раз</a>
                </c:when>
                <c:when test="${op.finalanswer == null}">
                    <p>${node}</p>

                    <input type="checkbox" name = "oneee" value="1" >Да</input>
                    <input type="checkbox" name = "oneee" value="0" >Нет</input>
                        <div id = "next"> <input name="submit" type="submit"
                                                 value="Далее" /></div>

                </c:when>


            </c:choose>







        </div>




   </form>












    </body>
</html>