<%-- 
    Document   : index
    Created on : 16/02/2017, 10:48:33
    Author     : 31519921
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel='stylesheet' media='screen' href='css/theme.css'/>
        <link rel='stylesheet' media='screen and (max-width: 1000px)' href='css/small.css' />        
        <link rel='stylesheet' media='screen and (min-width: 701px) and (max-width: 900px)' href='css/medium.css' />        
        <link rel='stylesheet' media='screen and (min-width: 900px)' href='css/high.css' /> 
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
    </head>
    <body>
        <header>
            <!--<h1>LOGO</h1>--> 
            <ul class="navbar">
                <li><a href="index.jsp">Sign in</a></li>
                <li><a class="active" href="home.jsp">Home</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li style="float:right"><a  href="about.jsp">About</a></li>
            </ul>
        </header>

        <div class="tudo_home" >
            <div class="home" >                        
                <div class="bem_vindo" > 
                    <form action="FrontController" method="POST">
                        <label for="termo">Termo: </label>
                        <input type="text" name="termo"/>
                        <input type="hidden" name="ctrl" value="SearchMusic"/>
                        <input type="submit" name="submit" value="Pesquisar">
                    </form>
                    <c:forEach var="i" items="${mu}">
                        <h1>Nome da Musica</h1>
                        <h2>${i.name}</h2>
                        <h1>Nome do Autor</h1>
                        <h2>${i.author}</h2>
                        <h1>País</h1>
                        <h2>${i.country}</h2>
                    </c:forEach>
                </div>

            </div>
        </div>
    </body>
</html>
