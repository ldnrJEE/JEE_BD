<%-- 
    Document   : LivresPossédés
    Created on : 10 mai 2017, 14:23:28
    Author     : stag
--%>

<!--JSP LivresPossedes
Affiche une liste de tous les livres possédés par le collectionneur et présent dans sa BDD personnelle
Permet à l'utilisateur d'accéder aux fonctions Ajouter, Modifier et Supprimer-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP LivresPossédés</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Livres possédés</div>

        <br><br><br><br>

        <!--Table envoyant la BDD-->
        <!--Besoin de toute la BDD possédé + titre et nb exemplaire de la BDD existant-->
        <table>
            <!--Titre-->
            <thead>
                <tr>
                    <th>Case</th>
                    <th>Titre</th>
                    <th>ID</th>
                    <th>Date de dépôt</th>
                    <th>Édition originale</th>
                    <th>Date d'achat</th>
                    <th>Prix d'achat</th>
                    <th>État</th>
                    <th>Notes</th>
                    <th>Nombre d'exemplaire</th>
                </tr>
            </thead>
            <!--Corps-->
            <tbody>
                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>Titre</td>
                    <td>${exemplaire.id_exemplaire}</td>
                    <td>${exemplaire.date_depot}</td>
                    <td>${exemplaire.edition_originale}</td>
                    <td>${exemplaire.date_achat}</td>
                    <td>${exemplaire.prix_achat}</td>
                    <td>${exemplaire.etat_conservation}</td>
                    <td>${exemplaire.note_texte}</td>
                    <td>3</td>
                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>Titre</td>
                    <td>${exemplaire.id_exemplaire}</td>
                    <td>${exemplaire.date_depot}</td>
                    <td>${exemplaire.edition_originale}</td>
                    <td>${exemplaire.date_achat}</td>
                    <td>${exemplaire.prix_achat}</td>
                    <td>${exemplaire.etat_conservation}</td>
                    <td>${exemplaire.note_texte}</td>
                    <td>3</td>
                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>Titre</td>
                    <td>${exemplaire.id_exemplaire}</td>
                    <td>${exemplaire.date_depot}</td>
                    <td>${exemplaire.edition_originale}</td>
                    <td>${exemplaire.date_achat}</td>
                    <td>${exemplaire.prix_achat}</td>
                    <td>${exemplaire.etat_conservation}</td>
                    <td>${exemplaire.note_texte}</td>
                    <td>3</td>
                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>Titre</td>
                    <td>${exemplaire.id_exemplaire}</td>
                    <td>${exemplaire.date_depot}</td>
                    <td>${exemplaire.edition_originale}</td>
                    <td>${exemplaire.date_achat}</td>
                    <td>${exemplaire.prix_achat}</td>
                    <td>${exemplaire.etat_conservation}</td>
                    <td>${exemplaire.note_texte}</td>
                    <td>3</td>
                </tr>
            </tbody>
            <!--Footer-->
            <tfoot>
                <tr>
                    <th>Case</th>
                    <th>Titre</th>
                    <th>ID</th>
                    <th>Date de dépôt</th>
                    <th>Édition originale</th>
                    <th>Date d'achat</th>
                    <th>Prix d'achat</th>
                    <th>État</th>
                    <th>Notes</th>
                    <th>Nombre d'exemplaire</th>
                </tr>
            </tfoot>
        </table>

        <br><br><br><br>
        
        <div class='groupBtn'>
            <!--Bouton Ajouter-->
            <input class="btn" type="button" value="Ajouter" onclick="document.location.href = 'controllerAjouterLivrePossede'">

            <!--Bouton Modifier-->
            <input class="btn" type="button" value="Modifier" onclick="document.location.href = 'controllerModifierLivrePossede'">

            <!--Bouton Supprimer, juste cosmétique pour le moment-->
            <input class="btn" type="button" value="Supprimer" onclick="alert('Êtes vous sûr de vouloir supprimer cet exemplaire?')">
        </div>
    </body>
</html>
