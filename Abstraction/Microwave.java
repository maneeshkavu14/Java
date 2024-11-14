package com.xworks.Abstraction;

public class Microwave extends Appliance{
	
	  @Override
	    public void turnOn() {
		  
	        System.out.println("Microwave is now heating.");
	    }

	    @Override
	    public void turnOff() {
	    	
	        System.out.println("Microwave is now off.");
	    }

	    @Override
	    public void consumePower() {
	    	
	        System.out.println("Microwave uses electricity.");
	    }

}