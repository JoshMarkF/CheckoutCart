/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekOne;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Joshua
 */
@SessionScoped
@Named
public class Cart implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Inject private Item item;
    
    private List<Item> items = new LinkedList<Item>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public void empty(){
        items.clear();
    }
    
    public void addItem() {
        addItem(item.createCopy());
    }
    
    public void addItem(Item i){
        items.add(i);
    }
    
}
