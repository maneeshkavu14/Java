package com.xworks.MethodOverriding;

public class GstMain {
	
	String stateName;
	String product;
	double amount;
	
	public GstMain(String stateName, String product, double amount) {
		this.stateName = stateName;
		this.product = product;
		this.amount = amount;
	}
	
	public double calculateGST() {
        double gstRate = 18.0; 
        double gst = amount * gstRate / 100;
        System.out.println("GST " + gst);
        return gst;
    }
	
	public void displayInfo() {
        System.out.println("State: " + stateName);
        System.out.println("Product: " + product);
        System.out.println("Amount: " + amount);

}
}
