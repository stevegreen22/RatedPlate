<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--spring and pring form tag--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Rated Plate - Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="keywords" content="Real Estate Template" />
    <meta name="description" content="Proper - Real Estate Responsive HTML5 Template">
    <meta name="author" content="yobio.indiewebstyle.com">
    <!-- Bootstrap -->
    <link href="../../assets/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="../../assets/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="../../assets/css/style.css" rel="stylesheet" media="screen">
    <link href="../../assets/js/colorbox/colorbox.css" rel="stylesheet" media="screen">
    <!-- FONTAWESOME STYLE -->
    <link rel="stylesheet" href="../../assets/font/FortAwesome/css/font-awesome.css"/>
    <!--[if IE 7]>
    <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css">
    <![endif]-->

    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <link rel="shortcut icon" href="../../assets/images/logo.png">
</head>
<body>
<h1>Setup Test Objects</h1>

<h1>Users</h1>
<c:forEach items="${Users}" var="user">

   <c:out value="${user.name}"/>
   <c:out value="${user.someOtherAttribute}"/>
</br>
</c:forEach>
<h1>Plates</h1>
<c:forEach items="${Plates}" var="plate">

    <c:out value="${plate.description}"/>
    </br>
</c:forEach>
<h1>Establs</h1>
<c:forEach items="${Estabs}" var="estab">

    <c:out value="${estab.location}"/>
    <c:out value="${estab.lat}"/>
    </br>
</c:forEach>

<%--{--%>
    <%--Users=--%>
    <%--[--%>
    <%--User{name='SomeName', someOtherAttribute='someOther'},--%>
    <%--User{name='SomeName', someOtherAttribute='someOther'},--%>
    <%--User{name='SomeName', someOtherAttribute='someOther'},--%>
    <%--User{name='SomeName', someOtherAttribute='someOther'}--%>
    <%--],--%>
    <%--Plates=--%>
    <%--[--%>
    <%--com.ratedplate.model.Plate@2c5b01ec,--%>
    <%--com.ratedplate.model.Plate@90c85cb,--%>
    <%--com.ratedplate.model.Plate@154bbe8e,--%>
    <%--com.ratedplate.model.Plate@4aff80b0--%>
    <%--],--%>
    <%--Estabs=--%>
    <%--[--%>
    <%--Establishment{id=2, name='ANewEstab', location='Norwich', lat=90, lon=90},--%>
    <%--Establishment{id=8, name='ANewEstab', location='Norwich', lat=90, lon=90},--%>
    <%--Establishment{id=10, name='ANewEstab', location='Norwich', lat=90, lon=90},--%>
    <%--Establishment{id=17, name='ANewEstab', location='Norwich', lat=90, lon=90}--%>
    <%--]--%>
<%--}--%>



</body>
</html>
