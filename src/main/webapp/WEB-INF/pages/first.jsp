
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

    <form name='Form' class= "form-horizontal" action="<c:url value='/post' />" method='POST'>
      <div class ="firstype">
    <h3>Эксперт 1</h3>
    
  
 <p> Правда ли, что чемпионат мира по футболу в 1968 году со-
          стоялся в Англии?</p>
          <input type="checkbox" name = "one" value="1" >Да</input>
        <input type="checkbox" name = "one" value="0" >Нет</input>
        
        
        
        <p>Продолжает ли карьеру игрока в киевском «Динамо» Мак-
сим Шацких?</p>
         <input type="checkbox"  name = "two" value="1">Да</input>
        <input type="checkbox" name = "two" value="0" >Нет</input>
        
        <p> 3.Правда ли, что чемпионаты Европы по футболу прово-
дятся с 1960 года?</p>
        <input type="checkbox"  name = "three" value="1" >Да</input>
        <input type="checkbox"  name = "three" value="0">Нет</input>
        
        <p> 4.Правда ли, что Люксембург не имеет футбольной ко-
манды?</p>
        <input type="checkbox"  name = "four" value="1">Да</input>
        <input type="checkbox"  name = "four" value="0" >Нет</input>
        
        <p> 5. Правда ли, что в 2000 году чемпионом мира по футболу
стала сборная Бразилии?</p>
        <input type="checkbox"  name = "five" value="1" >Да</input>
        <input type="checkbox"  name = "five" value="0" >Нет</input>
    </div>


        <div class ="firstype">
            <h3>Эксперт 2</h3>


            <p> Правда ли, что чемпионат мира по футболу в 1968 году со-
                стоялся в Англии?</p>
            <input type="checkbox" name = "one" value="1" >Да</input>
            <input type="checkbox" name = "one" value="0" >Нет</input>



            <p>Продолжает ли карьеру игрока в киевском «Динамо» Мак-
                сим Шацких?</p>
            <input type="checkbox"  name = "two" value="1">Да</input>
            <input type="checkbox" name = "two" value="0" >Нет</input>

            <p> 3.Правда ли, что чемпионаты Европы по футболу прово-
                дятся с 1960 года?</p>
            <input type="checkbox"  name = "three" value="1" >Да</input>
            <input type="checkbox"  name = "three" value="0">Нет</input>

            <p> 4.Правда ли, что Люксембург не имеет футбольной ко-
                манды?</p>
            <input type="checkbox"  name = "four" value="1">Да</input>
            <input type="checkbox"  name = "four" value="0" >Нет</input>

            <p> 5. Правда ли, что в 2000 году чемпионом мира по футболу
                стала сборная Бразилии?</p>
            <input type="checkbox"  name = "five" value="1" >Да</input>
            <input type="checkbox"  name = "five" value="0" >Нет</input>
        </div>


        <div class ="firstype">
            <h3>Эксперт 3</h3>


            <p> Правда ли, что чемпионат мира по футболу в 1968 году со-
                стоялся в Англии?</p>
            <input type="checkbox" name = "one" value="1" >Да</input>
            <input type="checkbox" name = "one" value="0" >Нет</input>



            <p>Продолжает ли карьеру игрока в киевском «Динамо» Мак-
                сим Шацких?</p>
            <input type="checkbox"  name = "two" value="1">Да</input>
            <input type="checkbox" name = "two" value="0" >Нет</input>

            <p> 3.Правда ли, что чемпионаты Европы по футболу прово-
                дятся с 1960 года?</p>
            <input type="checkbox"  name = "three" value="1" >Да</input>
            <input type="checkbox"  name = "three" value="0">Нет</input>

            <p> 4.Правда ли, что Люксембург не имеет футбольной ко-
                манды?</p>
            <input type="checkbox"  name = "four" value="1">Да</input>
            <input type="checkbox"  name = "four" value="0" >Нет</input>

            <p> 5. Правда ли, что в 2000 году чемпионом мира по футболу
                стала сборная Бразилии?</p>
            <input type="checkbox"  name = "five" value="1" >Да</input>
            <input type="checkbox"  name = "five" value="0" >Нет</input>
        </div>

        <div class ="firstype">
            <h3>Эксперт 4</h3>


            <p> Правда ли, что чемпионат мира по футболу в 1968 году со-
                стоялся в Англии?</p>
            <input type="checkbox" name = "one" value="1" >Да</input>
            <input type="checkbox" name = "one" value="0" >Нет</input>



            <p>Продолжает ли карьеру игрока в киевском «Динамо» Мак-
                сим Шацких?</p>
            <input type="checkbox"  name = "two" value="1">Да</input>
            <input type="checkbox" name = "two" value="0" >Нет</input>

            <p> 3.Правда ли, что чемпионаты Европы по футболу прово-
                дятся с 1960 года?</p>
            <input type="checkbox"  name = "three" value="1" >Да</input>
            <input type="checkbox"  name = "three" value="0">Нет</input>

            <p> 4.Правда ли, что Люксембург не имеет футбольной ко-
                манды?</p>
            <input type="checkbox"  name = "four" value="1">Да</input>
            <input type="checkbox"  name = "four" value="0" >Нет</input>

            <p> 5. Правда ли, что в 2000 году чемпионом мира по футболу
                стала сборная Бразилии?</p>
            <input type="checkbox"  name = "five" value="1" >Да</input>
            <input type="checkbox"  name = "five" value="0" >Нет</input>
        </div>


        <input name="submit" type="submit"
        value="Готово!" /></td>

   </form>












    </body>
</html>