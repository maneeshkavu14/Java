package com.xworks.MethodOverriding;

public class KeralaGst extends GstMain {
    private double keralaAdditionalTax;

    public KeralaGst(String product, double amount, double keralaAdditionalTax) {
        super("Kerala", product, amount);
        this.keralaAdditionalTax = keralaAdditionalTax;
    }

    @Override
    public double calculateGST() {
        double gstRate = 20.0;
        double gst = amount * gstRate / 100;
        gst = gst + keralaAdditionalTax;
        System.out.println("GST in Kerala: " + gst);
        return gst;
    }

    public void showAdditionalTax() {
        System.out.println("Kerala Additional Tax: " + keralaAdditionalTax);
    }
}

