/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekOne;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Joshua
 */
@RequestScoped
@Named
public class Item {
    
    @Inject private Cart cart;
    
    private String name;
    private Integer quantity;

    @PostConstruct
    private void init(){
        
    }
    
    @PreDestroy
    private void destroy(){
        
    }
    
    public String addToCart(){
        cart.addItem(this.createCopy());

		name = "";
		quantity = null;

		return (null);
    }
    
    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item createCopy(){
        Item i=new Item();
        i.name=name;
        i.quantity=quantity;
        return (i);
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", quantity=" + quantity + '}';
    }
    
    
    
}
