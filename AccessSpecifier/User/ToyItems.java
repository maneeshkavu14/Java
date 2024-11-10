package com.xworks.AccessSpecifier.User;

public class ToyItems {
	
    public String toyName;
    protected double toyPrice;
    int manufactureYear;
    private String serialNumber;

    public ToyItems() {
        this.toyName = "TurboTruck";
        this.manufactureYear = 2021;
        System.out.println("Toy item created with default values.");
    }

    private ToyItems(String serialNumber) {
        this.serialNumber = serialNumber;
        System.out.println("Toy item created with serial number: " + serialNumber);
    }

    public void turnedOn() {
        System.out.println(toyName + " Turned on.");
    }

    protected void playSound() {
        System.out.println("Playing sound for " + toyName);
    }

    void changeMode() {
        System.out.println("Item mode changed.");
    }

    private void accessInternalComponents(String authorizationCode) {
        System.out.println("Accessing internal components.");
    }
}