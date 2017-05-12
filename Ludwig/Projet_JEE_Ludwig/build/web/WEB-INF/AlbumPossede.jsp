<%-- 
    Document   : AlbumPossede
    Created on : 11 mai 2017, 16:33:44
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" href="Resource/Favicon.ico" />
        <title>JSP AlbumPossede</title>
    </head>

    <body>
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <br><br><br><br><br><br>

        <div class = "recap">Dans quelle série voulez-vous vérifier les albums que vous possédez?</div>

        <br><br>

        <form method="POST" action="Affichage_Serie">
            <div class = "recap">
                <input class = "textInput" type="text" name="Recherche_BD" value="" placeholder="Saisissez la série">
            </div>

            <br><br><br><br><br><br><br><br>

            <div class="groupBtn">
                <input type="reset" name="Button_Annuler_Possésion" value="Annuler" class="btn">
                <!--<input type="submit" name="Button_Validation_Possésion" value="Envoyer" class="btn" >-->
                <input class="btn" type="button" value="Envoyer" onclick="document.location.href = 'controllerListeAlbumsPossedes'">
            </div>
        </form>

    </body>
</html>
