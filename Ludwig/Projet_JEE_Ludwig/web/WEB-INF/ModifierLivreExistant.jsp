<%-- 
    Document   : ModifierLivreExistant
    Created on : 11 mai 2017, 10:53:52
    Author     : stag
--%>

<!--JSP ModifierLivreExistant
Envois un formulaire à l'utilisateur pour qu'il puisse modifier les attributs
d'un album existant-->

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

        <!--***** FORMULAIRE *****-->
        <form method="POST" action="ControllerModificationAlbum">
            <div class = "recap">
                <p>Série : 
                    <input type="text" name="nom_serie" value="">
                </p>
                <p>Titre : 
                    <input type="text" name="titre_album" value="">
                </p>
                <p>Éditeur : 
                    <input type="text" name="nom_editeur" value="">
                </p>
                <p>Illustrateur : 
                    <input type="text" name="nom_illustrateur" value="">
                </p>
                <p>Scénariste : 
                    <input type="text" name="nom_scenariste" value="">
                </p>
                <p>Langue : 
                    <input type="text" name="langue" value="">
                </p>
                <p>ISBN : 
                    <input type="text" name="ISBN" value="">
                </p>
            </div>

            <div class='groupBtn'>
                <!--Bouton Annuler-->
                <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresExistants'">

                <!--Bouton Envoyer-->
                <input type="submit" name="BoutonModifAlbum" value="Envoyer" class="btn">
            </div>
        </form>
    </body>
</html>
