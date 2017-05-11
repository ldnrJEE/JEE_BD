<%-- 
    Document   : ModifierLivreExistant
    Created on : 11 mai 2017, 10:53:52
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP ModifierLivreExistant</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Modifier un livre existant</div>

        <br><br><br><br>
        
        <div class = "recap">
            <p>Série : 
            <input type="text" name="serie" value="">
            </p>
            <p>Titre : 
            <input type="text" name="titre" value="">
            </p>
            <p>Éditeur : 
            <input type="text" name="editeur" value="">
            </p>
            <p>Auteur : 
            <input type="text" name="auteur" value="">
            </p>
            <p>Langue : 
            <input type="text" name="langue" value="">
            </p>
            <p>ISBN : 
            <input type="text" name="isbn" value="">
            </p>
        </div>
        
        <div class='groupBtn'>
            <!--Bouton Annuler-->
            <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresExistants'">

            <!--Bouton Envoyer-->
            <input class="btn" type="button" value="Envoyer" onclick="document.location.href = 'index.html'">
        </div>
    </body>
</html>
