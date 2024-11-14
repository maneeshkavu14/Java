package com.xworks.Abstraction;


public class WashingMachine extends Appliance {
	

	@Override
	public void turnOn(){
		
		System.out.println("Washing Machine Turn On");
	}

	@Override
	public void turnOff() {
		
		System.out.println("Washing Machine Turn Off");		
	}

	@Override
	public void consumePower() {
		
		System.out.println("Washing Machine Consume Electricity");		
	}
	
}