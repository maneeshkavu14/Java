package com.xworks.MethodOverriding;

public class GstRunner {
    public static void main(String[] args) {
        KeralaGst kerala = new KeralaGst("Shoe", 2000.0, 60.0);
        System.out.println("Kerala GST Calculation:");
        kerala.displayInfo();
        kerala.calculateGST();
        kerala.showAdditionalTax();
        System.out.println();
        
        MadhyapradeshGst madhyapradesh = new MadhyapradeshGst("Laptop", 40500.0, 50.0);
        System.out.println("Madhyapradesh GST Calculation:");
        madhyapradesh.displayInfo();
        madhyapradesh.calculateGST();
        madhyapradesh.showExtraCharge();
        System.out.println();

        GujratGst gujarat = new GujratGst("Mixi", 2500.0, 70.0);
        System.out.println("Gujarat GST Calculation:");
        gujarat.displayInfo();
        gujarat.calculateGST();
        gujarat.showExtraCharge();
        System.out.println();
    }
}
