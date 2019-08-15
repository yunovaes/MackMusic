<%-- 
    Document   : index
    Created on : 16/02/2017, 10:48:33
    Author     : 31519921
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
    </head>
    <body>
        <header>
            <!--<h1>LOGO</h1>--> 
            <ul class="navbar">
                <li><a href="index.jsp">Sign in</a></li>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li style="float:right"><a class="active" href="about.jsp">About</a></li>
            </ul>
        </header>

        <div class="about" >                        
            <fieldset>
                <img src="imagens/joao.jpg" style="width: 200px; height: 200px;" />
                <h2>Nome:</h2>   
                <p>João Gabriel Borelli Padilha</p>
                <h2>Descrição:</h2>   
                <p>XXXX</p>
                <h2>Data de nascimento:</h2>   
                <p>31/01/1997</p>
            </fieldset>                         
            <fieldset>
                <img src="imagens/felipe.jpg" style="width: 200px; height: 200px;" />
                <h2>Nome:</h2>   
                <p>Felipe Monteiro da Costa</p>
                <h2>Descrição:</h2>   
                <p>XXXX</p>
                <h2>Data de nascimento:</h2>   
                <p>28/11/1995</p>
            </fieldset>                            
            <fieldset>
                <img src="imagens/yuri.jpg" style="width: 200px; height: 200px;" />
                <h2>Nome:</h2>   
                <p>Yuri Novaes</p>
                <h2>Descrição:</h2>   
                <p>Pica das Galáxias</p>
                <h2>Data de nascimento:</h2>   
                <p>15/01/1997</p>
            </fieldset>                              
            <fieldset>
                <img src="imagens/marcely.jpg" style="width: 200px; height: 200px;" />
                <h2>Nome:</h2>   
                <p>Marcely Biguzzi Santello</p>
                <h2>Descrição:</h2>   
                <p>XXXX</p>
                <h2>Data de nascimento:</h2>   
                <p>22/01/1997</p>
            </fieldset>               
        </div>

    </body>
</html>
