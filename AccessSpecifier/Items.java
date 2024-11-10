package com.xworks.AccessSpecifier;

public class Items {
	public String itemName;
	protected double itemPrice;
	int manfYear;
	private String model;
	
	
	public Items() {
		this.itemName = "Laptop";
		this.manfYear = 2024;
		System.out.println("Default Constructor Executed");
	}
	
	private Items(String model) {
		this.model = model;
        System.out.println("Private Constructor Executed");
	}
	
	public void displayInfo() {
        System.out.println("Product information displayed");
    }
	
	protected void applyDiscount() {
        System.out.println("Discount applied to product.");
    }
	
	void checkAvailability() {
        System.out.println("Product availability checked");
    }
	
	private void checkWarrantyStatus() {
        System.out.println("Warranty status checked");
    }
}