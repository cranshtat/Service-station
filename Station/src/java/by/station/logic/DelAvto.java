/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.station.logic;

import by.station.util.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Евгений
 */
public class DelAvto {
    
     public static void delAv(int idAvto){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {    
                conn = ConnectToDatabase.ConnToDatabase();
                
                String query1 = "delete from order_avto where order_avto.id_avto_order=?";
                preparedStatement = conn.prepareStatement(query1);
                preparedStatement.setInt(1, idAvto);
                preparedStatement.executeUpdate();
                
                String query = "DELETE from avto where avto.idAvto=?";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, idAvto);
                preparedStatement.executeUpdate();
                
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
}
