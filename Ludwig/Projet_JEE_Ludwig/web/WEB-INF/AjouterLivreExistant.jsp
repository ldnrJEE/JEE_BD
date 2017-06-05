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

        <form method="POST" action="controllerCreationAlbum">
            <div class = "recap">
                <label class = recapP>Série : </label>
                <input class = "textInput" type="text" name="nom_serie" value="">
                <br><br>
                <label class = recapP>Titre : </label>
                <input class = "textInput"  type="text" name="titre_album" value="">
                <br><br>
                <label class = recapP>Éditeur : </label>
                <input class = "textInput" type="text" name="nom_editeur" value="">
                <br><br>
                <label class = recapP>Illustrateur : </label>
                <input class = "textInput" type="text" name="nom_illustrateur" value="">
                <br><br>
                <label class = recapP>Scénariste : </label>
                <input class = "textInput" type="text" name="nom_scenariste" value="">
                <br><br>
                <label class = recapP>Langue : </label>
                <input class = "textInput" type="text" name="langue" value="">
                <br><br>
                <label class = recapP>ISBN : </label>
                <input class = "textInput" type="text" name="ISBN" value="">
                <br><br>
            </div>

            <!--Bouton bas-->
            <div class='groupBtn'>
                <!--Bouton Annuler-->
                <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresExistants'">

                <!--Bouton Envoyer-->
                <input type="submit" name="BoutonAjoutAlbum" value="Envoyer" class="btn">
            </div>
        </form>
    </body>
</html>
