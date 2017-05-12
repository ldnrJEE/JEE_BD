package dao;

import beans.Album;
import beans.Exemplaire;


public class DAOFactory {


    public static DAO<Album> getAlbumDAO() {
        return new AlbumDAO();
    }
     
    public static DAO<Exemplaire> getExemplaireDAO() {
        return new ExemplaireDAO();
    }

}
