/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.LivresExistants;
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
public class controllerLivresExistants extends HttpServlet {

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
        String serie = request.getParameter("serie");
        String titre = request.getParameter("titre");
        String editeur = request.getParameter("editeur");
        String auteur = request.getParameter("auteur");
        String langue = request.getParameter("langue");
        String isbn = request.getParameter("isbn");
        String nombreExemplaire = request.getParameter("nombreExemplaire");

        //********** INSTANCIATION DU BEAN **********
        LivresExistants lExist = new LivresExistants();

        //********** ENREGISTREMENT DES DONNEES DANS LE BEAN **********
        lExist.setSerie(serie);
        lExist.setTitre(titre);
        lExist.setEditeur(editeur);
        lExist.setAuteur(auteur);
        lExist.setLangue(langue);
        lExist.setIsbn(isbn);
        lExist.setNombreExemplaire(nombreExemplaire);

        request.setAttribute("livresExistants", lExist);
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
