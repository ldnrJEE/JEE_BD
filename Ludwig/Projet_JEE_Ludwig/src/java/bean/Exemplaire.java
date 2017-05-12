/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Remi
 */
public class Exemplaire implements Serializable{
    private Integer id_exemplaire;
    private Integer date_depot;
    private Boolean edition_originale;
    private String date_achat;
    private Float prix_achat;
    private Integer etat_conservation;
    private String note_texte;
    private Integer id_album;
    
    public Exemplaire(){}
    
    public Exemplaire(Integer id_exemplaire, Integer date_depot, Boolean edition_originale,
            String date_achat, Float prix_achat, 
            Integer etat_conservation, String note_texte, Integer id_album){
        this.id_exemplaire = id_exemplaire;
        this.date_depot = date_depot;
        this.edition_originale = edition_originale;
        this.date_achat = date_achat;
        this.prix_achat = prix_achat;
        this.etat_conservation = etat_conservation;
        this.note_texte = note_texte;
        this.id_album = id_album;
    }

    public Integer getId_exemplaire() {
        return id_exemplaire;
    }

    public void setId_exemplaire(Integer id_exemplaire) {
        this.id_exemplaire = id_exemplaire;
    }

    public Integer getDate_depot() {
        return date_depot;
    }

    public void setDate_depot(Integer date_depot) {
        this.date_depot = date_depot;
    }

    public Boolean getEdition_originale() {
        return edition_originale;
    }

    public void setEdition_originale(Boolean edition_originale) {
        this.edition_originale = edition_originale;
    }

    public String getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(String date_achat) {
        this.date_achat = date_achat;
    }

    public Float getPrix_achat() {
        return prix_achat;
    }

    public void setPrix_achat(Float prix_achat) {
        this.prix_achat = prix_achat;
    }

    public Integer getEtat_conservation() {
        return etat_conservation;
    }

    public void setEtat_conservation(Integer etat_conservation) {
        this.etat_conservation = etat_conservation;
    }

    public String getNote_texte() {
        return note_texte;
    }

    public void setNote_texte(String note_texte) {
        this.note_texte = note_texte;
    }

    public Integer getId_album() {
        return id_album;
    }

    public void setId_album(Integer id_album) {
        this.id_album = id_album;
    }



}