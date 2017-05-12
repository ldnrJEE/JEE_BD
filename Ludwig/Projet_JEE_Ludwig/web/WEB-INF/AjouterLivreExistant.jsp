<%-- 
    Document   : AjouterLivreExistant
    Created on : 11 mai 2017, 10:47:55
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP AjouterLivreExistant</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Ajouter un livre existant</div>

        <br><br><br><br>
        
        <div class = "recap">
            <label class = recapP>Série : </label>
            <input class = "textInput" type="text" name="serie" value="">
            <br><br>
            <label class = recapP>Titre : </label>
            <input class = "textInput"  type="text" name="titre" value="">
            <br><br>
            <label class = recapP>Éditeur : </label>
            <input class = "textInput" type="text" name="editeur" value="">
            <br><br>
            <label class = recapP>Auteur : </label>
            <input class = "textInput" type="text" name="auteur" value="">
            <br><br>
            <label class = recapP>Langue : </label>
            <input class = "textInput" type="text" name="langue" value="">
            <br><br>
            <label class = recapP>ISBN : </label>
            <input class = "textInput" type="text" name="isbn" value="">
            <br><br>
        </div>
        
        <!--Bouton bas-->
        <div class='groupBtn'>
            <!--Bouton Annuler-->
            <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresExistants'">

            <!--Bouton Envoyer-->
            <input class="btn" type="button" value="Envoyer" onclick="document.location.href = 'index.html'">
        </div>
    </body>
</html>
