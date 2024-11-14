package com.xworks.Abstraction;



public class Refrigerator extends Appliance {
	
	 @Override
	    public void turnOn() {
		 
	        System.out.println("Refrigerator is now cooling.");
	    }

	    @Override
	    public void turnOff() {
	    	
	        System.out.println("Refrigerator is now off.");
	    }

	    @Override
	    public void consumePower() {
	    	
	        System.out.println("Refrigerator uses electricity.");
	    }

}