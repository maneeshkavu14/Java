package com.xworks.Abstraction;



public abstract class Appliance {
	//Abstract Methods
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void consumePower();
	
	//Concrete Methods
	public void  adjustSettings() {
		System.out.println("Apliances Automatically adjust Settings");
	}

}