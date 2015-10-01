package by.station.util;

import by.station.container.KlientContainer;
import by.station.entity.Klient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Евгений
 */
public class KlientCreator {
    
    public static KlientContainer getAllKLients(){
        KlientContainer klientContainer = new KlientContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idKlient, name,"
                                                     + "surname,birthday,address,phone,email from klient");
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                klientContainer.add(new Klient(rs.getInt("idKlient"), rs.getString("name"), 
                        rs.getString("surname"), rs.getString("birthday"),
                       rs.getString("address"),rs.getString("phone"), rs.getString("email")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return klientContainer;
    }
    
    public static KlientContainer getKlientById(int id){
        KlientContainer klientContainer = new KlientContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idKlient, name,"
                                                     + "surname,birthday,address,phone,email from klient where idKlient="+id);
                rs = preparedStatement.executeQuery();
                while(rs.next()){
                    klientContainer.add(new Klient(rs.getInt("idKlient"), rs.getString("name"), 
                        rs.getString("surname"), rs.getString("birthday"),
                       rs.getString("address"),rs.getString("phone"), rs.getString("email")));
                }
  
        } catch (SQLException ex) {
            Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return klientContainer;
    }
    
    public static KlientContainer getKlientByName(String name, String surname){
        KlientContainer klientContainer = new KlientContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idKlient, name,"
                                                     + "surname,birthday,address,phone,email from klient "
                    + "where klient.name='" + name + "' and klient.surname='"+surname+"'");
                rs = preparedStatement.executeQuery();
                while(rs.next()){
                    klientContainer.add(new Klient(rs.getInt("idKlient"), rs.getString("name"), 
                        rs.getString("surname"), rs.getString("birthday"),
                       rs.getString("address"),rs.getString("phone"), rs.getString("email")));
                }
  
        } catch (SQLException ex) {
            Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KlientCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return klientContainer;
    }
    
}
