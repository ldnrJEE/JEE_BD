/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.beans;

import java.io.Serializable;

/**
 *
 * @author Remi
 */
public class Album implements Serializable{
    
    private Integer id_album;
    private String  titre_album;
    private String  nom_serie;
    private String  nom_editeur;
    private String  nom_illustrateur;
    private String  nom_scenariste;
    private String  langue;
    private String  ISBN;
    private Integer nombre_exemplaire;
    
    public Album(){}
    
    public Album(Integer id_album, String titre_album, String nom_serie, String  nom_editeur,
            String  nom_illustrateur, String  nom_auteur, String  langue, String  ISBN, Integer nombre_exemplaire ){
        this.id_album = id_album;
        this.titre_album = titre_album;
        this.nom_serie = nom_serie;
        this.nom_editeur = nom_editeur;
        this.nom_illustrateur = nom_illustrateur;
        this.nom_scenariste = nom_auteur;
        this.langue = langue;
        this.ISBN = ISBN;
        this.nombre_exemplaire = nombre_exemplaire;
    }

    public Integer getId_album() {
        return id_album;
    }

    public void setId_album(Integer id_album) {
        this.id_album = id_album;
    }

    public String getTitre_album() {
        return titre_album;
    }

    public void setTitre_album(String titre_album) {
        this.titre_album = titre_album;
    }

    public String getNom_serie() {
        return nom_serie;
    }

    public void setNom_serie(String nom_serie) {
        this.nom_serie = nom_serie;
    }

    public String getNom_editeur() {
        return nom_editeur;
    }

    public void setNom_editeur(String nom_editeur) {
        this.nom_editeur = nom_editeur;
    }

    public String getNom_illustrateur() {
        return nom_illustrateur;
    }

    public void setNom_illustrateur(String nom_illustrateur) {
        this.nom_illustrateur = nom_illustrateur;
    }

    public String getNom_scenariste() {
        return nom_scenariste;
    }

    public void setNom_scenariste(String nom_scenariste) {
        this.nom_scenariste = nom_scenariste;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getNombre_exemplaire() {
        return nombre_exemplaire;
    }

    public void setNombre_exemplaire(Integer nombre_exemplaire) {
        this.nombre_exemplaire = nombre_exemplaire;
    }

}