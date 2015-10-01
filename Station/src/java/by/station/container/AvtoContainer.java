/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.station.container;

import by.station.entity.Avto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Евгений
 */
public class AvtoContainer implements Iterable<Avto>{
    
    private List<Avto> list = null;

    public AvtoContainer() {
        list = new ArrayList<>();
    }
    
    public void add(Avto avto){
        list.add(avto);
    }
    
    public boolean remove(Avto avto){
        return list.remove(avto);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public Avto getAvto(int index){
        return list.get(index);
    }
    
    public void removeAll(){
        list.clear();
    }
    
    @Override
    public Iterator<Avto> iterator() {
        return list.iterator();
    }
    
    public List<Avto> getList() {
        return list;
    }  
    
}
