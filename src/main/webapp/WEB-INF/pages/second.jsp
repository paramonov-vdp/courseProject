
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

    
    <h1 align = "center">Второй тип</h1>

    <form name='Form' class= "form-horizontal" action="<c:url value='/postSecond' />" method='POST'>

        <div class ="firstype">
              <h3>Эксперт 1</h3>


              <p> Когда появилась мобильная связь в Украине?</p>
              <input type="checkbox" name = "first" value="0.05" >1990</input>
              <input type="checkbox" name = "first" value="0.1" >1991</input>
              <input type="checkbox" name = "first" value="0.7" >1992</input>
              <input type="checkbox" name = "first" value="0.1" >1993</input>
              <input type="checkbox" name = "first" value="0.05" >1994</input>




              <p>Наиболее распространенными мобильными телефо-
                  нами в Украине являются аппараты фирмы.</p>
              <input type="checkbox" name = "second" value="0.3" >Samsung</input>
              <input type="checkbox" name = "second" value="0.2" >Apple</input>
              <input type="checkbox" name = "second" value="0.1" >HTC</input>
              <input type="checkbox" name = "second" value="0.2" >Nokia</input>
              <input type="checkbox" name = "second" value="0.2" >Xiaomy</input>

              <p> Наибольшее мобильное покрытие в Украине обеспе-
                  чивает оператор.</p>
              <input type="checkbox" name = "third" value="0.3" >MTC</input>
              <input type="checkbox" name = "third" value="0.4" >LIFE</input>
              <input type="checkbox" name = "third" value="0.2" >Belline</input>
              <input type="checkbox" name = "third" value="0.1" >Kievstar</input>



              <p> 4Наиболее приемлемые тарифы для разговоров с або-
                  нентами других сетей имеет оператор</p>
              <input type="checkbox" name = "fourr" value="0.3" >Telecom</input>
              <input type="checkbox" name = "fourr" value="0.2" >MTC</input>
              <input type="checkbox" name = "fourr" value="0.1" >Life</input>
              <input type="checkbox" name = "fourr" value="0.2" >Kievstar</input>
              <input type="checkbox" name = "fourr" value="0.2" >Beeline</input>

              <p> 5. Стоимость мобильного Интернета является мини-
                  мальной у такого оператора</p>
              <input type="checkbox" name = "five" value="0.2" >Telecom</input>
              <input type="checkbox" name = "five" value="0.1" >MTC</input>
              <input type="checkbox" name = "five" value="0.3" >Life</input>
              <input type="checkbox" name = "five" value="0.1" >Kievstar</input>
              <input type="checkbox" name = "five" value="0.3" >Beeline</input>
          </div>


          <div class ="firstype">
              <h3>Эксперт 2</h3>


              <p> Когда появилась мобильная связь в Украине?</p>
              <input type="checkbox" name = "first" value="0.05" >1990</input>
              <input type="checkbox" name = "first" value="0.1" >1991</input>
              <input type="checkbox" name = "first" value="0.7" >1992</input>
              <input type="checkbox" name = "first" value="0.1" >1993</input>
              <input type="checkbox" name = "first" value="0.05" >1994</input>




              <p>Наиболее распространенными мобильными телефо-
                  нами в Украине являются аппараты фирмы.</p>
              <input type="checkbox" name = "second" value="0.3" >Samsung</input>
              <input type="checkbox" name = "second" value="0.2" >Apple</input>
              <input type="checkbox" name = "second" value="0.1" >HTC</input>
              <input type="checkbox" name = "second" value="0.2" >Nokia</input>
              <input type="checkbox" name = "second" value="0.2" >Xiaomy</input>

              <p> Наибольшее мобильное покрытие в Украине обеспе-
                  чивает оператор.</p>
              <input type="checkbox" name = "third" value="0.3" >MTC</input>
              <input type="checkbox" name = "third" value="0.4" >LIFE</input>
              <input type="checkbox" name = "third" value="0.2" >Belline</input>
              <input type="checkbox" name = "third" value="0.1" >Kievstar</input>



              <p> 4Наиболее приемлемые тарифы для разговоров с або-
                  нентами других сетей имеет оператор</p>
              <input type="checkbox" name ="fourr" value="0.3" >Telecom</input>
              <input type="checkbox" name = "fourr" value="0.2" >MTC</input>
              <input type="checkbox" name = "fourr" value="0.1" >Life</input>
              <input type="checkbox" name = "fourr" value="0.2" >Kievstar</input>
              <input type="checkbox" name = "fourr" value="0.2" >Beeline</input>

              <p> 5. Стоимость мобильного Интернета является мини-
                  мальной у такого оператора</p>
              <input type="checkbox" name = "five" value="0.2" >Telecom</input>
              <input type="checkbox" name = "five" value="0.1" >MTC</input>
              <input type="checkbox" name = "five" value="0.3" >Life</input>
              <input type="checkbox" name = "five" value="0.1" >Kievstar</input>
              <input type="checkbox" name = "five" value="0.3" >Beeline</input>
          </div>

          <div class ="firstype">
              <h3>Эксперт 3</h3>


              <p> Когда появилась мобильная связь в Украине?</p>
              <input type="checkbox" name = "first" value="0.05" >1990</input>
              <input type="checkbox" name = "first" value="0.1" >1991</input>
              <input type="checkbox" name = "first" value="0.7" >1992</input>
              <input type="checkbox" name = "first" value="0.1" >1993</input>
              <input type="checkbox" name = "first" value="0.05" >1994</input>




              <p>Наиболее распространенными мобильными телефо-
                  нами в Украине являются аппараты фирмы.</p>
              <input type="checkbox" name = "second" value="0.3" >Samsung</input>
              <input type="checkbox" name = "second" value="0.2" >Apple</input>
              <input type="checkbox" name = "second" value="0.1" >HTC</input>
              <input type="checkbox" name = "second" value="0.2" >Nokia</input>
              <input type="checkbox" name = "second" value="0.2" >Xiaomy</input>

              <p> Наибольшее мобильное покрытие в Украине обеспе-
                  чивает оператор.</p>
              <input type="checkbox" name = "third" value="0.3" >MTC</input>
              <input type="checkbox" name = "third" value="0.4" >LIFE</input>
              <input type="checkbox" name = "third" value="0.2" >Belline</input>
              <input type="checkbox" name = "third" value="0.1" >Kievstar</input>



              <p> 4Наиболее приемлемые тарифы для разговоров с або-
                  нентами других сетей имеет оператор</p>
              <input type="checkbox" name = "fourr" value="0.3" >Telecom</input>
              <input type="checkbox" name = "fourr" value="0.2" >MTC</input>
              <input type="checkbox" name = "fourr" value="0.1" >Life</input>
              <input type="checkbox" name = "fourr" value="0.2" >Kievstar</input>
              <input type="checkbox" name = "fourr" value="0.2" >Beeline</input>

              <p> 5. Стоимость мобильного Интернета является мини-
                  мальной у такого оператора</p>
              <input type="checkbox" name = "five" value="0.2" >Telecom</input>
              <input type="checkbox" name = "five" value="0.1" >MTC</input>
              <input type="checkbox" name = "five" value="0.3" >Life</input>
              <input type="checkbox" name = "five" value="0.1" >Kievstar</input>
              <input type="checkbox" name = "five" value="0.3" >Beeline</input>
          </div>

          <div class ="firstype">
              <h3>Эксперт 4</h3>


              <p> Когда появилась мобильная связь в Украине?</p>
              <input type="checkbox" name = "first" value="0.05" >1990</input>
              <input type="checkbox" name = "first" value="0.1" >1991</input>
              <input type="checkbox" name = "first" value="0.7" >1992</input>
              <input type="checkbox" name = "first" value="0.1" >1993</input>
              <input type="checkbox" name = "first" value="0.05" >1994</input>




              <p>Наиболее распространенными мобильными телефо-
                  нами в Украине являются аппараты фирмы.</p>
              <input type="checkbox" name = "second" value="0.3" >Samsung</input>
              <input type="checkbox" name = "second" value="0.2" >Apple</input>
              <input type="checkbox" name = "second" value="0.1" >HTC</input>
              <input type="checkbox" name = "second" value="0.2" >Nokia</input>
              <input type="checkbox" name = "second" value="0.2" >Xiaomy</input>

              <p> Наибольшее мобильное покрытие в Украине обеспе-
                  чивает оператор.</p>
              <input type="checkbox" name = "third" value="0.3" >MTC</input>
              <input type="checkbox" name = "third" value="0.4" >LIFE</input>
              <input type="checkbox" name = "third" value="0.2" >Belline</input>
              <input type="checkbox" name = "third" value="0.1" >Kievstar</input>



              <p> 4Наиболее приемлемые тарифы для разговоров с або-
                  нентами других сетей имеет оператор</p>
              <input type="checkbox" name = "fourr" value="0.3" >Telecom</input>
              <input type="checkbox" name = "fourr" value="0.2" >MTC</input>
              <input type="checkbox" name = "fourr" value="0.1" >Life</input>
              <input type="checkbox" name = "fourr" value="0.2" >Kievstar</input>
              <input type="checkbox" name = "fourr" value="0.2" >Beeline</input>

              <p> 5. Стоимость мобильного Интернета является мини-
                  мальной у такого оператора</p>
              <input type="checkbox" name = "five" value="0.2" >Telecom</input>
              <input type="checkbox" name = "five" value="0.1" >MTC</input>
              <input type="checkbox" name = "five" value="0.3" >Life</input>
              <input type="checkbox" name = "five" value="0.1" >Kievstar</input>
              <input type="checkbox" name = "five" value="0.3" >Beeline</input>
          </div>




        <input name="submit" type="submit"
        value="Готово!" /></td>

   </form>












    </body>
</html>