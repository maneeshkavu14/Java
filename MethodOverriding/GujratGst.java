package com.xworks.MethodOverriding;

public class GujratGst extends GstMain {
	double GujratExtraCharge;
	
	public GujratGst(String product, double amount, double GujratExtraCharge) {
        super("Gujarat ", product, amount);
        this.GujratExtraCharge = GujratExtraCharge;
    }
	
	@Override
    public double calculateGST() {
        double gstRate = 19.5;
        double gst = amount * gstRate / 100;
        gst = gst + GujratExtraCharge;
        System.out.println("GST in Gujarat: " + gst);
        return gst;
    }

    public void showExtraCharge() {
        System.out.println("Gujarat Extra Charge: " + GujratExtraCharge);
    }
}
