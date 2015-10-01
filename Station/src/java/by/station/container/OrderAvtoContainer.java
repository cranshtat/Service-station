package by.station.container;

import by.station.entity.OrderAvto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Евгений
 */
public class OrderAvtoContainer implements Iterable<OrderAvto>{
    
    private List<OrderAvto> list = null;

    public OrderAvtoContainer() {
        list = new ArrayList<>();
    }
    
    public void add(OrderAvto orderAvto){
        list.add(orderAvto);
    }
    
    public boolean remove(OrderAvto orderAvto){
        return list.remove(orderAvto);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public OrderAvto getOrderAvto(int index){
        return list.get(index);
    }
    
    public void removeAll(){
        list.clear();
    }
    
    @Override
    public Iterator<OrderAvto> iterator() {
        return list.iterator();
    }
    
    public List<OrderAvto> getList() {
        return list;
    }  
    
}
