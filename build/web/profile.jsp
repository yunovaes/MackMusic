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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <style>

        </style>
    </head>
    <body>
        <header>
            <!--<h1>LOGO</h1>--> 
            <ul class="navbar">
                <li><a href="index.jsp">Sign in</a></li>
                <li><a href="home.jsp">Home</a></li>
                <li><a class="active" href="profile.jsp">Profile</a></li>
                <li style="float:right"><a href="about.jsp">About</a></li>
            </ul>            
        </header>

        <div class="profile">         
            <c:choose>
                <c:when test="${name != null}">
                    <fieldset>
                        <h1 class="nameProfile"> ${name} </h1>
                        <div class="perfil2">
                            <h2 class="nameProfile"> E-mail: ${email} </h2>
                            <h2 class="nameProfile"> Endereço: ${endereco} </h2>
                            <h2 class="nameProfile"> Telefone: ${telefone} </h2>
                            <br>
                        <p class="nameProfile">Se tiver algum campo em branco preencha os dados no "Atualizar Dados"</p>
                        </div>
                        <fieldset>
                            <h2 class="nameProfile"><a href="atualizar.jsp">Atualizar os dados </a></h2>
                            <h2 class="nameProfile"><a href="FrontController?ctrl=Logout">Logout</a></h2>
                        </fieldset>
                    </fieldset>
        </div>
                </c:when>
                <c:when test="${name == null}">
                    <h1>Faça o Login ou se Cadastre para acessar essa página</h1> <br/>
                    <h2><a href="index.jsp">Sign in | Sign out</a></h2>
                </c:when>
            </c:choose>
    </body>
</html>
