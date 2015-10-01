/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.station.util;

import by.station.container.AvtoContainer;
import by.station.entity.Avto;
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
public class AvtoCreator {
    
    
    
    public static AvtoContainer getAllAvto(){
        AvtoContainer avtoContainer = new AvtoContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idAvto, make,"
                                                     + "model,year,VIN,id_klient from avto");
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                avtoContainer.add(new Avto(rs.getInt("idAvto"), rs.getString("make"), 
                        rs.getString("model"), rs.getInt("year"),
                       rs.getString("VIN"),rs.getInt("id_klient")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return avtoContainer;
    }
    
    public static AvtoContainer getAvtoByIdKlient(int idKlient){
        AvtoContainer avtoContainer = new AvtoContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idAvto, make,"
                                                     + "model,year,VIN,id_klient from avto where id_Klient="+idKlient);
                rs = preparedStatement.executeQuery();
                while(rs.next()){
                    avtoContainer.add(new Avto(rs.getInt("idAvto"), rs.getString("make"), 
                        rs.getString("model"), rs.getInt("year"),
                       rs.getString("VIN"),rs.getInt("id_klient")));
                }
  
        } catch (SQLException ex) {
            Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return avtoContainer;
    }
    
    public static AvtoContainer getAvtoById(int id){
        AvtoContainer avtoContainer = new AvtoContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idAvto, make,"
                                                     + "model,year,VIN from avto where idAvto="+id);
                rs = preparedStatement.executeQuery();
                while(rs.next()){
                    avtoContainer.add(new Avto(rs.getInt("idAvto"), rs.getString("make"), 
                        rs.getString("model"), rs.getInt("year"),
                       rs.getString("VIN")));
                }
  
        } catch (SQLException ex) {
            Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return avtoContainer;
    }
    
}
