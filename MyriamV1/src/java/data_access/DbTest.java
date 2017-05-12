package data_access;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test_dao.TestDao;

/**
 *
 * @author Myriam
 */
public class DbTest extends HttpServlet {

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
        Connection connection = null;

        // Chargement du driver JDBC
        // Le fichier mysql-connector-java-5.1.42-bin.jar doit être placé dans WEB-INF/lib !!!!
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Pilote JDBC chargé");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du chargement du pilote");
        }

        // Récupération d'une connexion. Adapter les informations en fonction de votre base
        try {
            // A adapter pour le port, le nom de la base, le login et le password d'accès à la base
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collectionbd?autoReconnect=true&useSSL=false", "root", "1234512345");
            System.out.println("Connexion opérationnelle");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problème à établir la connexion.");
        }

        // Récupération des informations.
        try {
            DatabaseMetaData dbmd = connection.getMetaData();
            System.out.println("Nom de la base de données :"
                    + dbmd.getDatabaseProductName());
            System.out.println("Version de la base de données :"
                    + dbmd.getDatabaseProductVersion());
            System.out.println("Nom du pilote de la base de données :"
                    + dbmd.getDriverName());
            System.out.println("Version du pilote de la base de données :"
                    + dbmd.getDriverVersion());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problème lors de récupération des informations.");
        }
        
        // Appel a ma classe de test des fonctions dao
        TestDao test = new TestDao();
        test.testdao();

        // Fermeture de la connexion
        try {
            connection.close();
            System.out.println("Connexion fermée.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problème lors de fermeture de la connexion.");
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DbTest</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DbTest at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
