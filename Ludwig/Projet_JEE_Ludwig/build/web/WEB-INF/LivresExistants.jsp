<%-- 
    Document   : LivresExistants
    Created on : 10 mai 2017, 14:16:23
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>JSP LivresExistants</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Livres existants</div>

        <br><br><br><br>

        <!--Table sortant la BDD-->
        <!--Besoin de la toute la BDD existant-->
        <table>
            <!--Titre-->
            <thead>
                <tr>
                    <th>Case</th>
                    <th>ID</th>
                    <th>Série</th>
                    <th>Titre</th>
                    <th>Editeur</th>
                    <th>Auteur</th>
                    <th>Langue</th>
                    <th>ISBN</th>
                </tr>
            </thead>
            <!--Corps-->
            <tbody>
                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>123456789</td>
                    <td>Tintin</td>
                    <td>Tintin sur la lune</td>
                    <td>Casterman</td>
                    <td>Hergé</td>
                    <td>Fr</td>
                    <td>1234567890123</td>

                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>123456789</td>
                    <td>Tintin</td>
                    <td>Tintin sur la lune</td>
                    <td>Casterman</td>
                    <td>Hergé</td>
                    <td>Fr</td>
                    <td>1234567890123</td>
                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>123456789</td>
                    <td>Tintin</td>
                    <td>Tintin sur la lune</td>
                    <td>Casterman</td>
                    <td>Hergé</td>
                    <td>Fr</td>
                    <td>1234567890123</td>
                </tr>

                <tr>
                    <td><input type="radio" name="id" value=""></td>
                    <td>123456789</td>
                    <td>Tintin</td>
                    <td>Tintin sur la lune</td>
                    <td>Casterman</td>
                    <td>Hergé</td>
                    <td>Fr</td>
                    <td>1234567890123</td>
                </tr>
            </tbody>
            <!--Footer-->
            <tfoot>
                <tr>
                    <th>Case</th>
                    <th>ID</th>
                    <th>Série</th>
                    <th>Titre</th>
                    <th>Editeur</th>
                    <th>Auteur</th>
                    <th>Langue</th>
                    <th>ISBN</th>
                </tr>
            </tfoot>
        </table>


        <br><br><br><br>

        <div class='groupBtn'>
            <!--Bouton Ajouter-->
            <input class="btn" type="button" value="Ajouter" onclick="document.location.href = 'controllerAjouterLivreExistant'">

            <!--Bouton Modifier-->
            <input class="btn" type="button" value="Modifier" onclick="document.location.href = 'controllerModifierLivreExistant'">

            <!--Bouton Supprimer-->
            <input class="btn" type="button" value="Supprimer" onclick="">
        </div>
    </body>
</html>
