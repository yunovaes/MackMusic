<%-- 
    Document   : index
    Created on : 09/03/2017, 10:56:15
    Author     : 41526740
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
                    <h1>Cadastro</h1><br>
                    <label for="name">usuário</label>
                    <input type="text" id="name" name="name"/><br>
                    <label for="senha">senha</label>
                    <input id="senha" name="senha" type="password"><br>
                    <label for="confSenha">confirme a senha</label>
                    <input id="confSenha" name="confSenha" type="password"><br>
                    <label for="email">email</label>
                    <input type="email" id="email" name="email"/><br>
                    <input type="hidden" name="ctrl" value="Cadastro"/>
                    <!--<input type="submit" value="Cadastrar"/>-->
                    <div class="botao"><button type="submit" name="submit" value="Cadastrar"><i class="material-icons">send</i></button></div>                    
                </fieldset>
            </form>
            <form class="login" action="FrontController" method="POST">
                <fieldset>
                    <!--<legend>Login</legend>-->
                    <h1>Login</h1><br>
                    <label for="emailLogin">Email: </label>
                    <input id="emailLogin" name="emailLogin" type="email"><br>
                    <label for="senhaLogin">Senha: </label>
                    <input id="senhaLogin" name="senhaLogin" type="password"><br>
                    <!--<input type="submit" value="Login"/>-->
                    <input type="hidden" name="ctrl" value="Login"/>
                    <div class="botao"><button type="submit" name="submit" value="Login"><i class="material-icons">send</i></button></div>  
                </fieldset>
            </form>
        </div>        
    </body>
</html>