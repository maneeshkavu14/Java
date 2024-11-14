package com.xworks.Abstraction;

public class ApplianceRunner {
	
	public static void main(String[] args) {
		
		Appliance washingMachine = new WashingMachine();
		Appliance refrigerator = new Refrigerator();
		Appliance microwave = new Microwave();
		
		 // Invoke methods for WashingMachine
        System.out.println("Washing Machine:");
        washingMachine.adjustSettings();
        washingMachine.turnOn();
        washingMachine.consumePower();
        washingMachine.turnOff();

        System.out.println();

        // Invoke methods for Refrigerator
        System.out.println("Refrigerator:");
        refrigerator.adjustSettings();
        refrigerator.turnOn();
        refrigerator.consumePower();
        refrigerator.turnOff();

        System.out.println();

        // Invoke methods for Microwave
        System.out.println("Microwave:");
        microwave.adjustSettings();
        microwave.turnOn();
        microwave.consumePower();
        microwave.turnOff();
    
	}

	
}