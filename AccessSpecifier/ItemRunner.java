package com.xworks.AccessSpecifier;

import com.xworks.AccessSpecifier.User.ToyItems;

public class ItemRunner extends ToyItems {

	public static void main(String[] args) {
	
    	Items item = new Items();
    	System.out.println("Item Name = " + item.itemName);
    	
    	System.out.println("Manufacturer Year = " + item.manfYear);
    	item.displayInfo();
    	item.checkAvailability();
    	
        ToyItems toyItem = new ToyItems();
        System.out.println("Toy Item Name = " + toyItem.toyName);  
        toyItem.turnedOn();
        
        ItemRunner runner = new ItemRunner();

        runner.toyPrice = 2500.0;
        System.out.println("Price = " + runner.toyPrice);
        runner.playSound();         
        System.out.println("Toy Name (inherited) = " + runner.toyName);
        runner.turnedOn();                                             
    }
}
