<%--
  Created by IntelliJ IDEA.
  User: SteveGreen
  Date: 30/08/15
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="now" class="java.util.Date"/>


<!-- start breadcrumb -->
<!-- TODO: Need to clean this page!-->
<div id="breadcrumb-wrapper">
    <div class="container">
        <div class="pull-left"><fmt:formatDate value="${now}" pattern="dd-MM-yyyy HH:mm" /></div>
            <div class="pull-right">
                <fb:login-button scope="public_profile, email, user_friends" onlogin="checkLoginState();">
                </fb:login-button>
                <p id="status"></p>
            </div>
        </div>
    </div>
