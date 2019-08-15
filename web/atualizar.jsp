<%-- 
    Document   : atualizar
    Created on : 23/03/2017, 07:59:51
    Author     : 41526740
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>

        <header>
            <!--<h1>LOGO</h1>--> 
            <ul class="navbar">
                <li><a class="active" href="index.jsp">Sign in</a></li>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li style="float:right"><a href="about.jsp">About</a></li>
            </ul>
        </header>
        <div class="tudo" >
            <form class="cadastro" action="FrontController" method="POST">
                <fieldset>
                    <!--<legend>Cadastro</legend>-->
                    <h1>Atualizar</h1><br>
                    <label for="name">Nome</label>
                    <input type="text" id="name" name="name" value="${name}"/><br>
                    <label for="email">Email: </label>
                    <input id="email" name="email" type="email" value="${email}"><br>
                    <label for="endereco">Endereço: </label>
                    <input id="endereco" name="endereco" type="text" value="${endereco}"><br>
                    <label for="telefone">Telefone</label>
                    <input type="number" id="telefone" name="telefone" value="${telefone}"/><br>
                    <input type="hidden" name="ctrl" value="Update"/>
                    <!--<input type="submit" value="Cadastrar"/>-->
                    <div class="botao"><button type="submit" name="submit" value="Update"><i class="material-icons">send</i></button></div>                    
                </fieldset>
            </form>
        </div>
    </body>
</html>
