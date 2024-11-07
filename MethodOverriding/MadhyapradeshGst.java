package com.xworks.MethodOverriding;

public class MadhyapradeshGst extends GstMain {
	double extraCharge;
	
	public MadhyapradeshGst(String product, double amount, double extraCharge) {
		super("Madhyapradesh", product, amount);
		this.extraCharge = extraCharge;
	}
	
	@Override
    public double calculateGST() {
        double gstRate = 18.0; 
        double gst = amount * gstRate / 100; 
        double totalGST = gst + extraCharge; 
        System.out.println("GST in Madhyapradesh with Extra Charge: " + totalGST);
        return totalGST;
    }
	
	public void showExtraCharge() {
        System.out.println("Extra Charge for Madhyapradesh: $" + extraCharge);
    }

}
