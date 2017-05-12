/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_dao;

import beans.Album;
import beans.Exemplaire;
import dao.DAO;
import dao.DAOFactory;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe servant à tester toutes les fonctions des classes dao
 * Elle contient une unique fonction testdao() qui teste tour à tour toutes 
 * les fonctions des classes AlbumDAO et ExemplaireDAO.
 * 
 * @author Myriam
 */
public class TestDao {

    /**
     * @param void
     * Fonction de test des fonctions des classes dao
     * Elle ne prend aucun paramètre et ne renvoie rien.
     * Elle fait des affichages dans le console du serveur Tomcat
     * 
     */
    public void testdao() {
        // Les instances de DAO
        DAO<Album> albumdao = DAOFactory.getAlbumDAO();
        DAO<Exemplaire> exemplairedao = DAOFactory.getExemplaireDAO();
        
        // Test des requêtes de selection (fonction find())
        System.out.println("Requêtes de sélection");
        System.out.println("Les albums\n--------------------------------");
        for (int i = 1; i <= 2; i++) {
           System.out.println(albumdao.find(i));
        }

        System.out.println("\nLes exemplaires\n--------------------------------");
        for (int i = 3; i <= 4; i++) {
            System.out.println(exemplairedao.find(i));
        }
        
        // Calcul de la date et l'heure courantes
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        java.sql.Time time = new java.sql.Time(Calendar.getInstance().getTime().getTime());
        
        // Test des requêtes de création (fonction create())
        // On crée un album
        System.out.println("test");
        Album album = albumdao.create(
                new Album(
                        null,
                        "un titre",
                        "un nom serie",
                        "un nom editeur",
                        "un nom illus",
                        "un nom scenar",
                        "un langue",
                        "un ISBN",
                        1));
        System.out.println("Album créé : " + album);

        // On crée un exemplaire
        Exemplaire exemplaire = exemplairedao.create(
                new Exemplaire(null, 
                        2000, 
                        true,
                        "20/01/2000",
                        2.2f,
                        0,
                        "une note",
                        1
                ));
        System.out.println("Exemplaire créé : " + exemplaire);
        
        // Test des requêtes de modification (fonction update())
        System.out.println("\nRequête en modification\n--------------------------------");
        
        // On modifie un album
        album.setLangue("fr");
        album.setNom_editeur("toto");
        album = albumdao.update(album);
        System.out.println("Album modifié : " + album);
        
        // On modifie un exemplaire
        exemplaire.setEdition_originale(false);
        exemplaire.setPrix_achat(50.50f);
        exemplaire = exemplairedao.update(exemplaire);
        System.out.println("Exemplaire modifié : " + exemplaire);

        // Test des requêtes de suppression (fonction delete())
        System.out.println("\nRequête en suppression\n--------------------------------");
         //On supprime un album
        albumdao.delete(album);
        System.out.println("Album supprimé ? " + ((albumdao.find(album.getId_album()) == null) ? "oui" : "non"));

        // On supprime un exemplaire
        exemplairedao.delete(exemplaire);
        System.out.println("Exemplaire supprimé ? " + ((exemplairedao.find(exemplaire.getId_exemplaire()) == null) ? "oui" : "non"));
   
        // Test des requêtes de selection de la totalité d'une table (fonction findAll())
    
        ArrayList<Album> albums = albumdao.findAll();
    
        for(Album album1: albums){
            System.out.println(album1);
        }
        
        ArrayList<Exemplaire> exemplaires = exemplairedao.findAll();
    
        for(Exemplaire album2: exemplaires){
            System.out.println(album2);
        }
        

// Test des requêtes de selection de la totalité d'une table (fonction findAll())
        
    ArrayList<Album> albums2 = albumdao.findByStringAndInt("un nom serie", 2);
    
    for(Album album3: albums2){
            System.out.println(album3);
        }
    
    
    //Fermeture des connections
    
    try {
                albumdao.connection.close();
                exemplairedao.connection.close();
                System.out.println("Connexion albumdao et exemplairedao fermées.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Problème lors de fermeture de la connexion.");
            }
    
    }
    
   
}
