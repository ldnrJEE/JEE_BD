/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Exemplaire;
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
public class controllerModificationExemplaire extends HttpServlet {

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
        Integer id_exemplaire = Integer.parseInt(request.getParameter("id_exemplaire"));
        Integer date_depot = Integer.parseInt(request.getParameter("date_depot"));
        Boolean edition_originale = Boolean.parseBoolean(request.getParameter("edition_originale"));       
        String date_achat = request.getParameter("date_achat");
        Float prix_achat = Float.parseFloat(request.getParameter("prix_achat"));
        Integer etat_conservation = Integer.parseInt(request.getParameter("etat_conservation"));
        String note_texte = request.getParameter("note_texte");
//        Integer id_album = Integer.parseInt(request.getParameter("id_album"));
//        Integer nombre_exemplaire = request.getParameter("nombre_exemplaire");
//BESOIN DE RECUPERER LID ALBUM POUR POUVOIR AFFICHER LE TITRE DE LEXEMPLAIRE

        //********** INSTANCIATION DU BEAN **********
        Exemplaire ex = new Exemplaire();

        //********** ENREGISTREMENT DES DONNEES DANS LE BEAN **********
        ex.setId_exemplaire(id_exemplaire);
        ex.setDate_depot(date_depot);
        ex.setEdition_originale(edition_originale);
        ex.setDate_achat(date_achat);
        ex.setPrix_achat(prix_achat);
        ex.setEtat_conservation(etat_conservation);
        ex.setNote_texte(note_texte);
//        ex.setId_album(id_album);
//        album.setNombre_exemplaire(nombre_exemplaire);

        request.setAttribute("exemplaire", ex);
        
//        Donnees_Traite.afficher(album);
        request.getServletContext().getRequestDispatcher("/WEB-INF/LivresPossedes.jsp").forward(request, response);
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
