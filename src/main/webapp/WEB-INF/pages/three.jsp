<%--
  Created by IntelliJ IDEA.
  User: Slava
  Date: 01.08.2017
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<%--эта форма будет отправлять параметр с введенным именем в контроллер,
 в котором раньше тестировали ручной ввод параметра в урл -- контроллер /helloWithParam --%>

<%--method="get" не обязательно. По умолчанию итак гет--%>
<form action="/helloWithParam" method="get">
    <input type="text" name="param">

    <%--сабмит не обязательно, можно отправлять энтером--%>
    <input type="submit" value="Submit method Get">

</form>

<form action="/helloWithParam" method="post">
    <input type="text" name="param">
    <input type="submit" value="Submit method Post">
</form>

</body>
</html>
