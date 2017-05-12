<%-- 
    Document   : ListeAlbumsPossedes
    Created on : 12 mai 2017, 08:45:38
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Resource/Favicon.ico" />
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP ListeAlbumsPossedes</title>
    </head>

    <body>
        <!--Bouton d'accueil-->
        <input class="btn" type="button" value="Accueil" onclick="document.location.href = 'index.html'">

        <!--Titre-->
        <div class="titre">Liste des albums possédés dans cette série</div>

        <br><br><br><br>

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
            <input class="btn" type="button" value="Retour" onclick="document.location.href = 'controllerAlbumPossede'">
        </div>

        <%-- 
    private Integer id_exemplaire;
    private Integer date_depot;
    private Boolean edition_originale;
    private Date date_achat;
    private Float prix_achat;
    private Integer etat_conservation;
    private String note_texte;
    private Integer id_album;--%>

        <p> ${exemplaire.id_exemplaire}</p>
        <p> ${exemplaire.date_depot}</p>
        <p> ${exemplaire.date_achat}</p>
        <p> ${exemplaire.prix_achat}</p>
        <p> ${exemplaire.etat_conservation}</p>
        <p> ${exemplaire.note_texte}</p>
        <p> ${exemplaire.id_album}</p>
    </body>
</html>
