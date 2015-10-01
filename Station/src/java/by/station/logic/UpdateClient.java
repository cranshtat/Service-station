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
public class UpdateClient {
    public static void updateClient(int idKlient, String name, String surname, String birthday, String address, String phone, String email){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {    
                conn = ConnectToDatabase.ConnToDatabase();
                String query = "update klient set name=? , surname=? , birthday=?, address=?, phone=?,email=?  WHERE idKlient=" + idKlient;
                preparedStatement = conn.prepareStatement(query);
                
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, surname);
                preparedStatement.setString(3, birthday);
                preparedStatement.setString(4, address);
                preparedStatement.setString(5, phone);
                preparedStatement.setString(6, email);
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
