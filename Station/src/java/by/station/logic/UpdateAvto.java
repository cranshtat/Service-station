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
public class UpdateAvto {
    public static void updateAvto(int idAvto, String make, String model, int year, String VIN, int idKlient){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {    
                conn = ConnectToDatabase.ConnToDatabase();
                String query = "update avto set make=? , model=? , year=?, VIN=?, id_klient=? WHERE avto.idAvto=" + idAvto;
                preparedStatement = conn.prepareStatement(query);
                
                preparedStatement.setString(1, make);
                preparedStatement.setString(2, model);
                preparedStatement.setInt(3, year);
                preparedStatement.setString(4, VIN);
                preparedStatement.setInt(5, idKlient);
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
