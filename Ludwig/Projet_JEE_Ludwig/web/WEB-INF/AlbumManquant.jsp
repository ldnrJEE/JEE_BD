<%-- 
    Document   : AlbumManquant
    Created on : 11 mai 2017, 16:01:27
    Author     : stag
--%>

<!--JSP AlbumManquant
Demande à l'utilisateur de saisir la série pour laquelle il souhaite
rechercher les albums qui lui manquent-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" href="Resource/Favicon.ico" />
        <title>JSP AlbumManquant</title>
    </head>

    <body>
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <br><br><br><br><br><br>

        <div class = "recap">Dans quelle série voulez-vous vérifier les albums qu'il vous manque?</div>

        <br><br>

        <form method="POST" action="controllerListeAlbumsManquants">
            <div class = "recap">
                <input class = "textInput" type="text" name="Recherche_BD_Manquant" value="" placeholder="Saisissez la série">
            </div>

            <br><br><br><br><br><br><br><br>
            
            <div class="groupBtn">
                <input class="btn" type="button" value="Retour" onclick="document.location.href = 'index.html'">
                <input type="submit" name="Button_Validation_Manquant" value="Envoyer" class="btn">
            </div>
        </form>

    </body>
</html>
