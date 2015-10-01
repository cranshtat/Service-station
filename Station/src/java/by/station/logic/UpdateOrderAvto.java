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
public class UpdateOrderAvto {
     public static void updateOrderAvto(int idOrder,int idOrderAvto,String date,int sum, String status){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {    
                conn = ConnectToDatabase.ConnToDatabase();
                String query = "update order_avto set id_avto_order=? , date_order=? , sum=?, status=? WHERE idorder=" + idOrder;
                preparedStatement = conn.prepareStatement(query);
                
                preparedStatement.setInt(1, idOrderAvto);
                preparedStatement.setString(2, date);
                preparedStatement.setInt(3, sum);
                preparedStatement.setString(4, status);
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
