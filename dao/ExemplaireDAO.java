/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.dao;

import data_access.beans.Album;
import data_access.beans.Exemplaire;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stag
 */
public class ExemplaireDAO extends DAO<Exemplaire>{
   private final String TABLE = "exemplaire";

    @Override
    public Exemplaire find(Integer id_exemplaire) {
        Exemplaire exemplaire = null;
        try {
            String req = "SELECT * FROM " + TABLE + " WHERE id_exemplaire = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setLong(1, id_exemplaire);
            ResultSet result = pstmt.executeQuery();
            if (result.first()) {
                exemplaire = new Exemplaire(
                        id_exemplaire,
                        result.getInt("date_depot"),
                        result.getBoolean("edition_originale"),
                        result.getDate("date_achat"),
                        result.getFloat("prix_achat"),
                        result.getInt("etat_conservation"),
                        result.getString("note_texte"),
                        result.getInt("id_album")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exemplaire;
    }

    @Override
    public Exemplaire create(Exemplaire obj) {
        try {
            String req = "INSERT INTO " + TABLE + " (id_exemplaire, date_depot, "
                    + "edition_originale, date_achat, prix_achat, etat_conservation, "
                    + "note_texte, id_album) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(
                    req, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, obj.getId_exemplaire());
            pstmt.setInt(2, obj.getDate_depot());
            pstmt.setBoolean(3, obj.getEdition_originale());
            pstmt.setDate(4, obj.getDate_achat());
            pstmt.setFloat(5, obj.getPrix_achat());
            pstmt.setInt(6, obj.getEtat_conservation());
            pstmt.setString(7, obj.getNote_texte());
            pstmt.setInt(8, obj.getId_album());
            
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
    public Exemplaire update(Exemplaire obj) {
        try {
            String req = "UPDATE " + TABLE + " SET date_depot = ?, edition_originale = ?, "
                    + "date_achat = ?, prix_achat = ?, etat_conservation = ?, "
                    + "note_texte = ?, id_album = ?" 
                    + " WHERE id_exemplaire = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setInt(1, obj.getDate_depot());
            pstmt.setBoolean(2, obj.getEdition_originale());
            pstmt.setDate(3, obj.getDate_achat());
            pstmt.setFloat(4, obj.getPrix_achat());
            pstmt.setInt(5, obj.getEtat_conservation());
            pstmt.setString(6, obj.getNote_texte());
            pstmt.setInt(7, obj.getId_album());
            pstmt.executeUpdate();
            // On récupère l'enregistrement modifié
            obj = this.find(obj.getId_album());
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    @Override
    public void delete(Exemplaire obj) {
        try {
            String req = "DELETE FROM " + TABLE + " WHERE id_exemplaire = ?";
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setInt(1, obj.getId_exemplaire());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public ArrayList<Exemplaire> findAll() {
        ArrayList<Exemplaire> list = new ArrayList<Exemplaire>();
        Exemplaire exemplaire = null;
        
        try {
            String req = "SELECT * FROM " + TABLE;
//            System.out.println("requête : " + req); // Debug
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                
                exemplaire = new Exemplaire(result.getInt("id_exemplaire"), result.getInt("date_depot"), 
                        result.getBoolean("edition_originale"), result.getDate("date_achat"), 
                        result.getFloat("prix_achat"),result.getInt("etat_conservation"),
                        result.getString("note_texte"), result.getInt("id_album"));
                
                list.add(exemplaire);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    } 
}
