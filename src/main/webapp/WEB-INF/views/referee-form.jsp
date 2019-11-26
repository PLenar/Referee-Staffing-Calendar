<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj sędziego</title>
</head>
<body>
<h3>Dodaj Sędziego</h3>
<form:form method="post" modelAttribute="referee">
    <p><label>Imię: <form:input path="firstName"/></label></p>
    <p><label>Nazwisko: <form:input path="lastName"/></label></p>
    <p><label>Data urodzenia: <form:input type="date" path="dateOfBirth"/></label></p>
    <p><label>Pesel: <form:input path="pesel"/></label></p>
    <p><label>Email: <form:input path="email"/></label></p>
    <p><label>Hasło: <form:input path="password"/></label></p>
    <p>Dane Adresowe: </p>
    <p><label>Miasto: <form:input path="city"/></label></p>
    <p><label>Kod pocztowy: <form:input path="postalCode"/></label></p>
    <p><label>Ulica: <form:input path="street"/></label></p>
    <p><label>Numer mieszkania: <form:input path="localNumber"/></label></p>
</form:form>
</body>
</html>
