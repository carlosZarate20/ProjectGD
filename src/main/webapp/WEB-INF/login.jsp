<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="theme-color" content="#094FA4" />
        <title>Login</title>
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
    <script type="text/javascript" src="<c:url value='/resources/js/login.js?v=${timestamp}'/>"></script>
    <script type="text/javascript">
        $(function() {
           gPath = '${gPath}<c:if test="${empty gPath}">${pageContext.servletContext.contextPath}</c:if>';
        });
     </script>
</body>
</html>