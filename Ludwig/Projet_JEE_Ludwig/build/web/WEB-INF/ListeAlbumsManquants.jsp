<%-- 
    Document   : ListeALbumsManquants
    Created on : 11 mai 2017, 16:27:15
    Author     : stag
--%>

<!--JSP ListeAlbumsManquants
Affiche une liste de tous les albums d'une série spécifiée qu'il manque au collectionneur-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Resource/Favicon.ico" />
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP ListeAlbumsManquants</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Listes des albums manquants dans cette série</div>

        <br><br><br><br>

        <!--Table, besoin lien BDD-->
        <!--Besoin de toute la série titre et isbn d'Album-->
        <table>
            <thead>
                <tr>
                    <th>Série</th>
                    <th>Titre</th>
                    <th>ISBN</th>
                </tr>
            </thead>
            <!--Corps-->
            <tbody>
                <tr>
                    <td>Les aventures de Tintin</td>
                    <td>Tintin au tibet</td>
                    <td>123456789</td>
                </tr>

                <tr>
                    <td>Les aventures de Tintin</td>
                    <td>Tintin au tibet</td>
                    <td>123456789</td>
                </tr>

                <tr>
                    <td>Les aventures de Tintin</td>
                    <td>Tintin au tibet</td>
                    <td>123456789</td>
                </tr>

                <tr>
                    <td>Les aventures de Tintin</td>
                    <td>Tintin au tibet</td>
                    <td>123456789</td>
                </tr>
            </tbody>
            <!--Footer-->
            <tfoot>
                <tr>
                    <th>Série</th>
                    <th>Titre</th>
                    <th>ISBN</th>
                </tr>
            </tfoot>
        </table>

        <br><br><br><br>

        <div class='groupBtn'>        
            <input class="btn" type="button" value="Retour" onclick="document.location.href = 'controllerAlbumManquant'">
        </div>

        <p> ${album.id_album} </p>
        <p> ${album.titre_album} </p>
        <p> ${album.nom_serie} </p>
        <p> ${album.nom_editeur} </p>
        <p> ${album.nom_illustrateur} </p>
        <p> ${album.nom_scenariste} </p>
        <p> ${album.langue} </p>
        <p> ${album.nombre_exemplaire} </p>


    </body>
</html>
