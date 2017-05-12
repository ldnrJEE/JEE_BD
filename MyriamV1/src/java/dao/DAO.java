package dao;


import beans.Album;
import connection.MySQLConnection;
import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> {

    public Connection connection = MySQLConnection.getInstance();

    /**
     * Permet de récupérer un objet via son ID
     *
     * @param id
     * @return
     */
    public abstract T find(Integer id);

    /**
     * Permet de créer une entrée dans la base de données par rapport à un objet
     *
     * @param obj
     * @return
     */
    public abstract T create(T obj);

    /**
     * Permet de mettre à jour les données d'une entrée dans la base
     *
     * @param obj
     * @return
     */
    public abstract T update(T obj);

    /**
     * Permet la suppression d'une entrée de la base
     *
     * @param obj
     */
    public abstract void delete(T obj);
    
    public abstract ArrayList<T> findAll();
    
    public abstract ArrayList<T> findByStringAndInt(String nom_serie, Integer nombre);
}
