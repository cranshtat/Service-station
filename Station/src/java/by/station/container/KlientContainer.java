package by.station.container;

import by.station.entity.Klient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Евгений
 */
public class KlientContainer implements Iterable<Klient>{

    private List<Klient> list = null;

    public KlientContainer() {
        list = new ArrayList<>();
    }
    
    public void add(Klient klient){
        list.add(klient);
    }
    
    public boolean remove(Klient klient){
        return list.remove(klient);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public Klient getKlient(int index){
        return list.get(index);
    }
    
    public void removeAll(){
        list.clear();
    }
    
    @Override
    public Iterator<Klient> iterator() {
        return list.iterator();
    }
    
    public List<Klient> getList() {
        return list;
    }  
    
}
