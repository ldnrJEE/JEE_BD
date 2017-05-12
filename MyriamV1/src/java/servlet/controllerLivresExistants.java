/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Album;
import beans.Exemplaire;
import dao.AlbumDAO;
import dao.DAO;
import dao.DAOFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test_dao.TestDao;
import traitement.Donnees_Traite;

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

        Album album = new Album(1, "Tintin au tibet", "Tintin", "Editeur", "Illustrateur", "Scénariste", "fr", "123456789", 2);
        request.setAttribute("album", album);

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

        String TABLE = "Album";
        ArrayList<Album> list = new ArrayList<Album>();
        Album album1 = null;
        
        try {
            String req = "SELECT * FROM " + TABLE;
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = connection.prepareStatement(req);
            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                
                album1 = new Album(result.getInt("id_album"), result.getString("titre_album"), 
                        result.getString("nom_serie"), result.getString("nom_editeur"), 
                        result.getString("nom_illustrateur"),result.getString("nom_scenariste"),
                        result.getString("langue"), result.getString("ISBN"), 
                        result.getInt("nombre_exemplaire"));
                
                list.add(album1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Album al: list){
            System.out.println(al);
        }
        // Fermeture de la connexion
        try {
            connection.close();
            System.out.println("Connexion fermée.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problème lors de fermeture de la connexion.");
        }

        
        
        request.setAttribute("livresExistants", list);
        
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
