package by.station.logic;

import by.station.util.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Евгений
 */
public class AddAvto {
    
     public static void addAv(String make,String model, int year, String VIN,int id){
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {    
                conn = ConnectToDatabase.ConnToDatabase();
                String query = "insert into avto(make,model,year,VIN, id_klient) values(?,?,?,?,?)";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, make);
                preparedStatement.setString(2, model);
                preparedStatement.setInt(3, year);
                preparedStatement.setString(4, VIN);
                preparedStatement.setInt(5, id);
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
