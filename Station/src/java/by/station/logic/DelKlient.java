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
public class DelKlient {
    
    public static void delKl(int idKlient){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {        
            conn = ConnectToDatabase.ConnToDatabase();
            
            String query1 = "delete order_avto,avto from order_avto inner join avto"
                    + " where avto.id_klient= ?";
            preparedStatement = conn.prepareStatement(query1);
            preparedStatement.setInt(1, idKlient);
                preparedStatement.executeUpdate();
            
            String query = "delete from klient" +
            " where klient.idKlient= ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, idKlient);
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
