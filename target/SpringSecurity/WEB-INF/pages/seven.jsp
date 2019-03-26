
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

    
    <h1 align = "center">Седьмой тип</h1>

    <form name='Form' class= "form-horizontal" action="<c:url value='/postseven' />" method='POST'>

        <div class ="firstype">
            <h3>Эксперт 1</h3>


            <p> 1. Совокупность способов достижения цели называется</p>
            <input type="checkbox" name = "first" value="0.6" >Методология</input>
            <input type="checkbox" name = "first" value="0.3" >Технология</input>
            <input type="checkbox" name = "first" value="0.1" >Методика</input>





            <p>2. Назовите синоним к слову «альтруизм»</p>
            <input type="checkbox" name = "second" value="0.1" >Доброта</input>
            <input type="checkbox" name = "second" value="0.1" >Гуманность</input>
            <input type="checkbox" name = "second" value="0.1" >Человечность</input>
            <input type="checkbox" name = "second" value="0.5" >Безкорыстность</input>
            <input type="checkbox" name = "second" value="0.2" >Щедрость</input>

            <p> 3. Научно-практическая методология исследования
                сложных систем называется</p>
            <input type="checkbox" name = "third" value="0.2" >Системный подход</input>
            <input type="checkbox" name = "third" value="0.8" >Системный анализ</input>
            <input type="checkbox" name = "third" value="0.0" >Системная технология</input>
            <input type="checkbox" name = "third" value="0.0" >Системный бизнес</input>



            <p> 4. Профессионализм руководителя определяется...</p>
            <input type="checkbox" name = "fourr" value="0.4" >Знанием дела</input>
            <input type="checkbox" name = "fourr" value="0.3" >умением быстро реагировать на нестандарт-
            ные ситуации</input>
            <input type="checkbox" name = "fourr" value="0.1" >умением работать с персоналом</input>
            <input type="checkbox" name = "fourr" value="0.1" >порядочностью</input>
            <input type="checkbox" name = "fourr" value="0.1" >способностью к креативу</input>

        </div>


        <div class ="firstype">
            <h3>Эксперт 2</h3>


            <p> 1. Совокупность способов достижения цели называется</p>
            <input type="checkbox" name = "first" value="0.6" >Методология</input>
            <input type="checkbox" name = "first" value="0.3" >Технология</input>
            <input type="checkbox" name = "first" value="0.1" >Методика</input>





            <p>2. Назовите синоним к слову «альтруизм»</p>
            <input type="checkbox" name = "second" value="0.1" >Доброта</input>
            <input type="checkbox" name = "second" value="0.1" >Гуманность</input>
            <input type="checkbox" name = "second" value="0.1" >Человечность</input>
            <input type="checkbox" name = "second" value="0.5" >Безкорыстность</input>
            <input type="checkbox" name = "second" value="0.2" >Щедрость</input>

            <p> 3. Научно-практическая методология исследования
                сложных систем называется</p>
            <input type="checkbox" name = "third" value="0.2" >Системный подход</input>
            <input type="checkbox" name = "third" value="0.8" >Системный анализ</input>
            <input type="checkbox" name = "third" value="0.0" >Системная технология</input>
            <input type="checkbox" name = "third" value="0.0" >Системный бизнес</input>



            <p> 4. Профессионализм руководителя определяется...</p>
            <input type="checkbox" name = "fourr" value="0.4" >Знанием дела</input>
            <input type="checkbox" name = "fourr" value="0.3" >умением быстро реагировать на нестандарт-
            ные ситуации</input>
            <input type="checkbox" name = "fourr" value="0.1" >умением работать с персоналом</input>
            <input type="checkbox" name = "fourr" value="0.1" >порядочностью</input>
            <input type="checkbox" name = "fourr" value="0.1" >способностью к креативу</input>

        </div>


        <div class ="firstype">
            <h3>Эксперт 3</h3>


            <p> 1. Совокупность способов достижения цели называется</p>
            <input type="checkbox" name = "first" value="0.6" >Методология</input>
            <input type="checkbox" name = "first" value="0.3" >Технология</input>
            <input type="checkbox" name = "first" value="0.1" >Методика</input>





            <p>2. Назовите синоним к слову «альтруизм»</p>
            <input type="checkbox" name = "second" value="0.1" >Доброта</input>
            <input type="checkbox" name = "second" value="0.1" >Гуманность</input>
            <input type="checkbox" name = "second" value="0.1" >Человечность</input>
            <input type="checkbox" name = "second" value="0.5" >Безкорыстность</input>
            <input type="checkbox" name = "second" value="0.2" >Щедрость</input>

            <p> 3. Научно-практическая методология исследования
                сложных систем называется</p>
            <input type="checkbox" name = "third" value="0.2" >Системный подход</input>
            <input type="checkbox" name = "third" value="0.8" >Системный анализ</input>
            <input type="checkbox" name = "third" value="0.0" >Системная технология</input>
            <input type="checkbox" name = "third" value="0.0" >Системный бизнес</input>



            <p> 4. Профессионализм руководителя определяется...</p>
            <input type="checkbox" name = "fourr" value="0.4" >Знанием дела</input>
            <input type="checkbox" name = "fourr" value="0.3" >умением быстро реагировать на нестандарт-
            ные ситуации</input>
            <input type="checkbox" name = "fourr" value="0.1" >умением работать с персоналом</input>
            <input type="checkbox" name = "fourr" value="0.1" >порядочностью</input>
            <input type="checkbox" name = "fourr" value="0.1" >способностью к креативу</input>

        </div>


        <div class ="firstype">
            <h3>Эксперт 4</h3>


            <p> 1. Совокупность способов достижения цели называется</p>
            <input type="checkbox" name = "first" value="0.6" >Методология</input>
            <input type="checkbox" name = "first" value="0.3" >Технология</input>
            <input type="checkbox" name = "first" value="0.1" >Методика</input>





            <p>2. Назовите синоним к слову «альтруизм»</p>
            <input type="checkbox" name = "second" value="0.1" >Доброта</input>
            <input type="checkbox" name = "second" value="0.1" >Гуманность</input>
            <input type="checkbox" name = "second" value="0.1" >Человечность</input>
            <input type="checkbox" name = "second" value="0.5" >Безкорыстность</input>
            <input type="checkbox" name = "second" value="0.2" >Щедрость</input>

            <p> 3. Научно-практическая методология исследования
                сложных систем называется</p>
            <input type="checkbox" name = "third" value="0.2" >Системный подход</input>
            <input type="checkbox" name = "third" value="0.8" >Системный анализ</input>
            <input type="checkbox" name = "third" value="0.0" >Системная технология</input>
            <input type="checkbox" name = "third" value="0.0" >Системный бизнес</input>



            <p> 4. Профессионализм руководителя определяется...</p>
            <input type="checkbox" name = "fourr" value="0.4" >Знанием дела</input>
            <input type="checkbox" name = "fourr" value="0.3" >умением быстро реагировать на нестандарт-
            ные ситуации</input>
            <input type="checkbox" name = "fourr" value="0.1" >умением работать с персоналом</input>
            <input type="checkbox" name = "fourr" value="0.1" >порядочностью</input>
            <input type="checkbox" name = "fourr" value="0.1" >способностью к креативу</input>

        </div>



        <input name="submit" type="submit"
        value="Готово!" /></td>

        </form>
    </body>
</html>