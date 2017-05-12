/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;

import beans.Exemplaire;

/**
 *
 * @author stag
 */
public class Traitement_Exemplaire {
    
    public static void affEx(Exemplaire e){
        
        System.out.println(e.getDate_achat()+" \n"+e.getDate_depot()+" \n"+e.getEdition_originale()+" \n"+e.getEtat_conservation()+" \n"+e.getId_album()+" \n"+e.getId_exemplaire()+" \n"+e.getPrix_achat()+" \n"+e.getNote_texte());
        
    }
    
}
