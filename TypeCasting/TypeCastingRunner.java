package com.xworks.TypeCasting;

public class TypeCastingRunner {
    public static void main(String[] args) {

        System.out.println(" =============Primitive Up Casting=============");

        // Up Casting 1: int to double 
        int employeeAge = 35;
        double estimatedRetirementAge = employeeAge;
        System.out.println("Upcasted int to double : " + estimatedRetirementAge);

        // Up Casting 2: byte to int
        byte currentMonth = 10;
        int fiscalYear = currentMonth;
        System.out.println("Upcasted byte to int : " + fiscalYear);

        // Up Casting 3: short to float 
        short weeklyWorkHours = 40;
        float annualWorkHours = weeklyWorkHours;
        System.out.println("Upcasted short to float : " + annualWorkHours);

        // Up Casting 4: long to double
        long distanceToMoonKm = 384400L;
        double distanceToMoonMiles = distanceToMoonKm;
        System.out.println("Upcasted long to double : " + distanceToMoonMiles);
        
        
        System.out.println(" =============Primitive Down Casting=============");


        // Down Casting 1: double to int 
        double precisePi = 3.14159265359;
        int approximatePi = (int) precisePi;
        System.out.println("Downcasted double to int : " + approximatePi);

        // Down Casting 2: float to byte 
        float maxBatteryVoltage = 13.8f;
        byte batteryVoltageInRange = (byte) maxBatteryVoltage;
        System.out.println("Downcasted float to byte : " + batteryVoltageInRange);

        // Down Casting 3: int to short 
        int maxStorageGB = 2048;
        short mobileStorageLimit = (short) maxStorageGB;
        System.out.println("Downcasted int to short : " + mobileStorageLimit);

        // Down Casting 4: long to int 
        long largeDataFileSize = 5000000000L;
        int appFileLimit = (int) largeDataFileSize;
        System.out.println("Downcasted long to int : " + appFileLimit);

        System.out.println("\n =============Class Up Casting=============");

        // Up Casting 1: Desktop to Computer  
        Computer myDesktop = new Desktop(); // Up Casting
        myDesktop.compute();

        // Up Casting 2: Laptop to Computer  
        Computer myLaptop = new Laptop(); // Up Casting
        myLaptop.compute();

        System.out.println("\n =============Class Down Casting=============");

        // Down Casting 1: Computer to Desktop  
        Computer desktop = new Desktop(); // Up Casting
        Desktop specificDesktop = (Desktop) desktop; // Down Casting
        specificDesktop.compute();

        // Down Casting 2: Computer to Laptop
        Computer laptop = new Laptop(); // Up Casting
        Laptop specificLaptop = (Laptop) laptop; // Down Casting
        specificLaptop.compute();
    }
}
