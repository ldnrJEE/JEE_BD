/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author stag
 */
public class LivresPossedes {
    private String dateDepot;
    private String EditionOriginale;
    private String dateAchat;
    private String prixAchat;
    private String etat;
    private String notesComp;

    public String getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(String dateDepot) {
        this.dateDepot = dateDepot;
    }

    public String getEditionOriginale() {
        return EditionOriginale;
    }

    public void setEditionOriginale(String EditionOriginale) {
        this.EditionOriginale = EditionOriginale;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(String prixAchat) {
        this.prixAchat = prixAchat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNotesComp() {
        return notesComp;
    }

    public void setNotesComp(String notesComp) {
        this.notesComp = notesComp;
    }
}
