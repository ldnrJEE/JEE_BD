/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.LivresPossedes;
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
public class controllerLivresPossedes extends HttpServlet {

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
        String dateDepot = request.getParameter("dateDepot");
        String editionOriginale = request.getParameter("EditionOriginale");
        String dateAchat = request.getParameter("dateAchat");
        String prixAchat = request.getParameter("prixAchat");
        String etat = request.getParameter("etat");
        String notesComp = request.getParameter("notesComp");
        

        //********** INSTANCIATION DU BEAN **********
        LivresPossedes lPoss = new LivresPossedes();

        //********** ENREGISTREMENT DES DONNEES DANS LE BEAN **********
        lPoss.setDateDepot(dateDepot);
        lPoss.setEditionOriginale(editionOriginale);
        lPoss.setDateAchat(dateAchat);
        lPoss.setPrixAchat(prixAchat);
        lPoss.setEtat(etat);
        lPoss.setNotesComp(notesComp);
        
        request.setAttribute("livresPossedes", lPoss);
        request.getServletContext().getRequestDispatcher("/WEB-INF/LivresPossedes.jsp").forward(request, response);
    }

    
    protected void ajouterLivre(){
        
    }
    
    protected void modifierLivre(){
        
    }
    
    protected void supprimerLivre(){
        
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