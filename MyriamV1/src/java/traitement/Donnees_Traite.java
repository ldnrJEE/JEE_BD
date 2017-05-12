/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;

import beans.Album;

/**
 *
 * @author stag
 */
public class Donnees_Traite {
    
public static void afficher(Album a){
//    Album(Integer id_album, String titre_album, String nom_serie, String  nom_editeur,
//            String  nom_illustrateur, String  nom_auteur, String  langue, String  ISBN, Integer nombre_exemplaire )
     System.out.println(a.getISBN()+"\n "+a.getLangue()+" \n"+a.getNom_editeur()+" \n"+a.getNom_illustrateur()+" \n"+a.getNom_scenariste()+" \n"+a.getNom_serie()+" \n"+a.getTitre_album()+" \n"+a.getId_album().toString()+" \n"+a.getNombre_exemplaire().toString());
}


}
