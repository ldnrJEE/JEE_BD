<%-- 
    Document   : ModifierLivrePossede
    Created on : 11 mai 2017, 10:55:04
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP ModifierLivrePossédé</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Modifier un livre possédé</div>

        <br><br><br><br>

        <div class = "recap">
            <p>Date de dépôt : 
                <input type="text" name="dateDepot" value="">
            </p>
            <p>Edition originale : 
                <label>Oui
                    <input type="radio" name="radio1" value="oui">
                </label>
                <label>Non
                    <input type="radio" name="radio1" value="non">
                </label>
            </p>
            <p>Date d'achat : 
                <input type="date" name="dateAchat" value="<?php echo $today?>">
            </p>
            <p>Prix d'achat : 
                <input type="text" name="prixAchat" value="">
            </p>
            <p>État de conservation : 
                <select name="etat">
                    <option>Mauvais</option>
                    <option>Moyen</option>
                    <option>Bon</option>
                </select>
            </p>
            <p>Notes : 
                <input type="text" name="notes" value="">
            </p>
        </div>

        <div class='groupBtn'>
            <!--Bouton Annuler-->
            <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresPossedes'">

            <!--Bouton Envoyer-->
            <input class="btn" type="button" value="Envoyer" onclick="document.location.href = 'index.html'">
        </div>
    </body>
</html>
