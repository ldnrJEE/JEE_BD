/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Album;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stag
 */
public class controllerModificationAlbum extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //********** RECUPERATION DES DONNEES **********
//        Integer id_album = request.getParameter("id_album");
        String titre_album = request.getParameter("titre_album");
        String nom_serie = request.getParameter("nom_serie");
        String nom_editeur = request.getParameter("nom_editeur");
        String nom_illustrateur = request.getParameter("nom_illustrateur");
        String nom_scenariste = request.getParameter("nom_scenariste");
        String langue = request.getParameter("langue");
        String ISBN = request.getParameter("ISBN");
//        Integer nombre_exemplaire = request.getParameter("nombre_exemplaire");

        //********** INSTANCIATION DU BEAN **********
        Album album = new Album();

        //********** ENREGISTREMENT DES DONNEES DANS LE BEAN **********
//        album.setId_album(id_album);
        album.setTitre_album(titre_album);
        album.setNom_serie(nom_serie);
        album.setNom_editeur(nom_editeur);
        album.setNom_illustrateur(nom_illustrateur);
        album.setNom_scenariste(nom_scenariste);
        album.setLangue(langue);
        album.setISBN(ISBN);
//        album.setNombre_exemplaire(nombre_exemplaire);

        request.setAttribute("album", album);
        
//        Donnees_Traite.afficher(album);
        request.getServletContext().getRequestDispatcher("/WEB-INF/LivresExistants.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
