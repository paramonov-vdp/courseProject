
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

    
    <h1 align = "center">Первый тип</h1>

    <form name='Form' class= "form-horizontal" action="<c:url value='/postsix' />" method='POST'>

        <%--<div class ="firstype">
            <h3>Эксперт 1</h3>


            <p> 1. В каких пределах финансирование научных исследований на промышленном предприятии (ПП) является опти
                мальным?</p>
            <input type="text" name = "mlfirst"  >ml</input>
            <input type="text" name = "mrfirst"  >mr</input>
            <input type="text" name = "afirst"  >a</input>
            <input type="text" name = "bfirst"  >b</input>




            <p>2. Какие сроки будут оптимальными, по мнению эксперта, для ввода ПП в эксплуатацию?</p>
            <input type="text" name = "mlsecond"  >ml</input>
            <input type="text" name = "mrsecond"  >mr</input>
            <input type="text" name = "asecond"  >a</input>
            <input type="text" name = "bsecond"  >b</input>


            <p>3. Какая прибыль ожидается в первый год функционирования ПП?</p>
            <input type="text" name = "mlthird"  >ml</input>
            <input type="text" name = "mrthird"  >mr</input>
            <input type="text" name = "athird"  >a</input>
            <input type="text" name = "bthird"  >b</input>




        </div>



        <div class ="firstype">
            <h3>Эксперт 2</h3>


            <p> 1. В каких пределах финансирование научных исследований на промышленном предприятии (ПП) является опти
                мальным?</p>
            <input type="text" name = "mlfirst"  >ml</input>
            <input type="text" name = "mrfirst"  >mr</input>
            <input type="text" name = "afirst"  >a</input>
            <input type="text" name = "bfirst"  >b</input>




            <p>2. Какие сроки будут оптимальными, по мнению эксперта, для ввода ПП в эксплуатацию?</p>
            <input type="text" name = "mlsecond"  >ml</input>
            <input type="text" name = "mrsecond"  >mr</input>
            <input type="text" name = "asecond"  >a</input>
            <input type="text" name = "bsecond"  >b</input>


            <p>3. Какая прибыль ожидается в первый год функционирования ПП?</p>
            <input type="text" name = "mlthird"  >ml</input>
            <input type="text" name = "mrthird"  >mr</input>
            <input type="text" name = "athird"  >a</input>
            <input type="text" name = "bthird"  >b</input>




        </div>


        <div class ="firstype">
            <h3>Эксперт 3</h3>


            <p> 1. В каких пределах финансирование научных исследований на промышленном предприятии (ПП) является опти
                мальным?</p>
            <input type="text" name = "mlfirst"  >ml</input>
            <input type="text" name = "mrfirst"  >mr</input>
            <input type="text" name = "afirst"  >a</input>
            <input type="text" name = "bfirst"  >b</input>




            <p>2. Какие сроки будут оптимальными, по мнению эксперта, для ввода ПП в эксплуатацию?</p>
            <input type="text" name = "mlsecond"  >ml</input>
            <input type="text" name = "mrsecond"  >mr</input>
            <input type="text" name = "asecond"  >a</input>
            <input type="text" name = "bsecond"  >b</input>


            <p>3. Какая прибыль ожидается в первый год функционирования ПП?</p>
            <input type="text" name = "mlthird"  >ml</input>
            <input type="text" name = "mrthird"  >mr</input>
            <input type="text" name = "athird"  >a</input>
            <input type="text" name = "bthird"  >b</input>




        </div>
--%>


        <div class ="firstype">
            <h3>Эксперт 4</h3>


            <p> 1. В каких пределах финансирование научных исследований на промышленном предприятии (ПП) является опти
                мальным?</p>
            <input type="text" name = "mlfirst"  >ml</input>
            <input type="text" name = "mrfirst"  >mr</input>
            <input type="text" name = "afirst"  >a</input>
            <input type="text" name = "bfirst"  >b</input>




            <p>2. Какие сроки будут оптимальными, по мнению эксперта, для ввода ПП в эксплуатацию?</p>
            <input type="text" name = "mlsecond"  >ml</input>
            <input type="text" name = "mrsecond"  >mr</input>
            <input type="text" name = "asecond"  >a</input>
            <input type="text" name = "bsecond"  >b</input>


            <p>3. Какая прибыль ожидается в первый год функционирования ПП?</p>
            <input type="text" name = "mlthird"  >ml</input>
            <input type="text" name = "mrthird"  >mr</input>
            <input type="text" name = "athird"  >a</input>
            <input type="text" name = "bthird"  >b</input>




        </div>



        <div class ="firstype">
            <h3>Эксперт 5</h3>


            <p> 1. В каких пределах финансирование научных исследований на промышленном предприятии (ПП) является опти
                мальным?</p>
            <input type="text" name = "mlfirst"  >ml</input>
            <input type="text" name = "mrfirst"  >mr</input>
            <input type="text" name = "afirst"  >a</input>
            <input type="text" name = "bfirst"  >b</input>




            <p>2. Какие сроки будут оптимальными, по мнению эксперта, для ввода ПП в эксплуатацию?</p>
            <input type="text" name = "mlsecond"  >ml</input>
            <input type="text" name = "mrsecond"  >mr</input>
            <input type="text" name = "asecond"  >a</input>
            <input type="text" name = "bsecond"  >b</input>


            <p>3. Какая прибыль ожидается в первый год функционирования ПП?</p>
            <input type="text" name = "mlthird"  >ml</input>
            <input type="text" name = "mrthird"  >mr</input>
            <input type="text" name = "athird"  >a</input>
            <input type="text" name = "bthird"  >b</input>




        </div>
        <input name="submit" type="submit"
        value="Загрузить из файла" /></td>

   </form>












    </body>
</html>