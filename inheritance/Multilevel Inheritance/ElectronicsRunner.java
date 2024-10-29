public class ElectronicsRunner {
    public static void main(String[] args) {
        TouchPad device = new TouchPad();

        device.manufacturer = "Samsung";
        device.shade = "Silver";
        device.warrantyYears = 2;
        device.operatingSystem = "Android";
        device.cameraMP = 48;
        device.supports5G = true;
        device.displaySize = 12;       
        device.includesStylus = true;   
        device.batteryLife = 6000;

        System.out.println("Manufacturer: " + device.manufacturer);
        System.out.println("Shade: " + device.shade);
        System.out.println("Warranty Period: " + device.warrantyYears + " year(s)");
        System.out.println("Operating System: " + device.operatingSystem);
        System.out.println("Camera Resolution: " + device.cameraMP + " MP");
        System.out.println("Supports 5G: " + device.supports5G);
        System.out.println("Display Size: " + device.displaySize + " inches");
        System.out.println("Includes Stylus: " + device.includesStylus);
        System.out.println("Battery Life: " + device.batteryLife + " mAh");
    }
}