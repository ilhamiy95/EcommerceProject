
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Authentification ADMIN </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- MATERIAL DESIGN ICONIC FONT -->

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/template/css/style.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/template/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css" />

    <!-- STYLE CSS -->

</head>

<body>

<div class="wrapper" style="background-image: url('/resources/template/images/meu8.jpg');">
    <div class="inner">
        <div class="image-holder">
            <img src="/resources/template/images/meu4.jpg" alt=""/>
        </div>
        <form:form method="post" action="/admin/new" modelAttribute="ad">

        <h3>Authentification Admin </h3>

        <div class="form-group ">

            <form:input path="nom" required="true" placeholder="Nom"  class="form-control"
                        id="nom" type="text"/>


            <form:input path="prenom" required="true" placeholder="Prénom"  class="form-control"
                        id="prenom" type="text"/>
        </div>
        <div class="form-wrapper">

            <form:input path="username" required="true" placeholder="username"  class="form-control"
                        id="username" type="text"/>
            <i class="zmdi zmdi-account"></i>

        </div>
        <div class="form-wrapper">

            <form:input path="password" required="true" placeholder="password"  class="form-control"
                        id="password" type="text"/>
            <i class="zmdi zmdi-lock"></i>
        </div>
        <div  class="form-wrapper">
            <form:select path="type" required="true" placeholder="Sexe" class="form-control">
                <option value="" disabled selected>Sexe</option>
                <form:options items="${Sexe}"/>
            </form:select>
            <i class="zmdi zmdi-caret-down" style="font-size: 17px"></i>
        </div>
        <div class="form-wrapper">

            <form:input path="tele" required="true" placeholder="Télé"  class="form-control"
                        id="tele" type="text"/>
        </div>
            <button>Conneter
                <i  type="submit" class="zmdi zmdi-arrow-right"></i>
            </button>


        </form:form>
    </div>
</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>