package data_access.dao;

import data_access.beans.Album;
import data_access.beans.Exemplaire;


public class DAOFactory {


    public static DAO<Album> getAlbumDAO() {
        return new AlbumDAO();
    }
     
    public static DAO<Exemplaire> getExemplaireDAO() {
        return new ExemplaireDAO();
    }

}
