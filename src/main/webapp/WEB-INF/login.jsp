<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="theme-color" content="#094FA4" />
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap/bootstrap.min.css'/>">
    	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap/bootstrap-theme.min.css'/>">
	    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/font-awesome/font-awesome.min.css'/>">
	    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/frontend/main.css'/>">
    	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/frontend/login.css'/>">
</head>
<body>
<div>
        <form action="application/json" id ="loginValues" method="post">
            <fieldset class="clearfix">
                <p>
                    <span class="fa fa-user"></span>
                    <input type="text" Placeholder="Usuario" id="username">
                </p>
                <p>
                    <span class="fa fa-lock"></span>
                    <input type="password" Placeholder="Contraseña" id="password">
                </p>
                <div>
                    <span style="width:50%; text-align:right; float: right;">
                        <input type="submit" id="btnIngresar" value="Entrar">
                    </span>
                </div>
            </fieldset>
        </form>
    </div>
    <script type="text/javascript" src="<c:url value='/resources/js/bootstrap/jquery-1.9.1.min.js'/>"></script>
    <script src="<c:url value='/resources/js/bootstrap/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/login.js?v=${timestamp}'/>"></script>
    <script type="text/javascript">
        $(function() {
           gPath = '${gPath}<c:if test="${empty gPath}">${pageContext.servletContext.contextPath}</c:if>';
        });
     </script>
</body>
</html>