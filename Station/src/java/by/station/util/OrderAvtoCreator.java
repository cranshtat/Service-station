package by.station.util;

import by.station.container.OrderAvtoContainer;
import by.station.entity.OrderAvto;
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
public class OrderAvtoCreator {
    
     public static OrderAvtoContainer getOrderByAvtoId(int id){
        OrderAvtoContainer orderAvtoContainer = new OrderAvtoContainer();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = ConnectToDatabase.ConnToDatabase();
            preparedStatement = conn.prepareStatement("Select idorder, id_avto_order, date_order,sum,status from order_avto join avto on order_avto.id_avto_order = avto.idAvto where avto.idAvto="+id);
                rs = preparedStatement.executeQuery();
                while(rs.next()){
                    orderAvtoContainer.add(new OrderAvto(rs.getInt("id_avto_order"), rs.getString("date_order"), 
                        rs.getInt("sum"), rs.getString("status"),rs.getInt("idorder")));
                }
  
        } catch (SQLException ex) {
            Logger.getLogger(OrderAvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(OrderAvtoCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return orderAvtoContainer;
    }
    
}
