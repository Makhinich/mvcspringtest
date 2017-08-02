<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--библиотека для создания объектов из форм--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<p>Input first and last name</p>

<%--modelAttribute="testEntity" -- можно менять/удалить, все-равно работает--%>
<form:form action="/entityPrinter" method="post" modelAttribute="testEntity">

    <%--имена firstName lastName можно менять, все-равно работает--%>
    <input type="text" name="firstName">
    <input type="number" name="age">
    <input type="submit" value="Create entity">
</form:form>

<%--без дополнительной библиотеки. Тоже работает!--%>
<form action="/entityPrinter" method="post">
    <input type="text" name="firstName">
    <input type="number" name="age">
    <input type="submit" value="Create entity without Spring Form">
</form>

</body>
</html>
