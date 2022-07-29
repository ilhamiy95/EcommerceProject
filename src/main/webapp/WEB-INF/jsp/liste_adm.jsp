<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<body>

<h2>ADMIN</h2>

<table>

    <tr>
        <th>nom</th>
        <th>prenom</th>
        <th>username</th>
        <th>password</th>
        <th>sexe</th>
        <th>tele</th>

    </tr>
    <c:forEach items="${ad}" var="admin">
        <tr>

            <td>${admin.nom}</td>
            <td>${admin.prenom}</td>
            <td>${admin.username}</td>
            <td>${admin.password}</td>
            <td>${admin.type}</td>
            <td>${admin.tele}</td>

        </tr>
    </c:forEach>
</table>
</body>



</body>
</html>