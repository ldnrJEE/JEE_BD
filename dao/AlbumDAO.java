package data_access.dao;

import data_access.beans.Album;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlbumDAO extends DAO<Album> {

    private final String TABLE = "question";

    @Override
    public Album find(Integer id_album) {
        Album album = null;
        try {
            String req = "SELECT * FROM " + TABLE + " WHERE id_album = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setLong(1, id_album);
            ResultSet result = pstmt.executeQuery();
            if (result.first()) {
                album = new Album(
                        id_album,
                        result.getString("titre_album"),
                        result.getString("nom_serie"),
                        result.getString("nom_editeur"),
                        result.getString("nom_illustrateur"),
                        result.getString("nom_scenariste"),
                        result.getString("langue"),
                        result.getString("ISBN"),
                        result.getInt("nombre_exemplaire")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return album;
    }

    @Override
    public Album create(Album obj) {
        try {
            String req = "INSERT INTO " + TABLE + " (id_album, titre_album, nom_serie, nom_editeur, nom_illustrateur, nom_scenariste, langue, ISBN, nombre_exemplaire) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(
                    req, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, obj.getId_album());
            pstmt.setString(2, obj.getTitre_album());
            pstmt.setString(3, obj.getNom_serie());
            pstmt.setString(4, obj.getNom_editeur());
            pstmt.setString(5, obj.getNom_illustrateur());
            pstmt.setString(6, obj.getNom_scenariste());
            pstmt.setString(7, obj.getLangue());
            pstmt.setString(8, obj.getISBN());
            pstmt.setInt(9, obj.getNombre_exemplaire());
            
            // On soumet la requête et on récupère l'id créé
            int id = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            int last_inserted_id;
            if (rs.first()) { // Si on a des id créés
                last_inserted_id = rs.getInt(1);
                // On récupère l'enregistrement créé
                obj = this.find(last_inserted_id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    @Override
    public Album update(Album obj) {
        try {
            String req = "UPDATE " + TABLE + " SET titre_album = ?, nom_serie = ?, nom_editeur = ?, nom_illustrateur = ?, nom_scenariste = ?, langue = ?, ISBN = ?, nombre_exemplaire = ?" 
                    + " WHERE id_album = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setString(1, obj.getTitre_album());
            pstmt.setString(2, obj.getNom_serie());
            pstmt.setString(3, obj.getNom_editeur());
            pstmt.setString(4, obj.getNom_illustrateur());
            pstmt.setString(5, obj.getNom_scenariste());
            pstmt.setString(6, obj.getLangue());
            pstmt.setString(7, obj.getISBN());
            pstmt.setInt(8, obj.getNombre_exemplaire());
            pstmt.executeUpdate();
            // On récupère l'enregistrement modifié
            obj = this.find(obj.getId_album());
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    @Override
    public void delete(Album obj) {
        try {
            String req = "DELETE FROM " + TABLE + " WHERE id_album = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setInt(1, obj.getId_album());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public ArrayList<Album> findAll() {
        ArrayList<Album> list = new ArrayList<Album>();
        Album album = null;
        
        try {
            String req = "SELECT * FROM " + TABLE;
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                
                album = new Album(result.getInt("id_album"), result.getString("titre_album"), 
                        result.getString("nom_serie"), result.getString("nom_editeur"), 
                        result.getString("nom_illustrateur"),result.getString("nom_scenariste"),
                        result.getString("langue"), result.getString("ISBN"), 
                        result.getInt("nombre_exemplaire"));
                
                list.add(album);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
