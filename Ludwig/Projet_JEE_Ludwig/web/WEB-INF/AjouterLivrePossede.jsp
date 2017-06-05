<%-- 
    Document   : AjouterLivrePossede
    Created on : 11 mai 2017, 10:54:51
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP AjouterLivrePossédé</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Ajouter un livre possédé</div>

        <br><br><br><br>

        <form method="POST" action="controllerCreationExemplaire">
            <div class = "recap">
                <label class = recapP>Date de dépôt : </label>
                <input class = "textInput" type="text" name="dateDepot" value="">
                <br><br>

                <label class = recapP>Prix d'achat : </label>
                <input class = "textInput" type="text" name="prixAchat" value="">
                <br><br>

                <label class = recapP>État de conservation : </label> 
                <select class = "textInput" name="etat">
                    <option>Mauvais</option>
                    <option>Moyen</option>
                    <option>Bon</option>
                </select>
                <br><br>

                <label class = recapP>Notes : </label>
                <input class = "textInput" type="text" name="notes" value="">
                <br><br>

                <label class = recapP>ID : </label>
                <input class = "textInput" type="text" name="id" value="">
                <br><br>

                <label class = recapP>Date d'achat : </label>
                <input class = "textInput" type="date" name="dateAchat" value="<?php echo $today?>">
                <br><br>

                <label class = recapP>Edition originale : </label>
                <label>Oui
                    <input type="radio" name="radio1" value="oui">
                </label>
                <label>Non
                    <input type="radio" name="radio1" value="non">
                </label>
                <br><br>    
            </div>

            <div class='groupBtn'>
                <!--Bouton Annuler-->
                <input class="btn" type="button" value="Annuler" onclick="document.location.href = 'controllerLivresPossedes'">

                <!--Bouton Envoyer-->
                <input type="submit" name="BoutonAjoutExemplaire" value="Envoyer" class="btn">
            </div>
        </form>
</html>
