public class DeviceRunner {
    public static void main(String[] args) {
        Dryer dryer = new Dryer();

        dryer.manufacturer = "Samsung";
        dryer.product = "Smart Dryer";
        dryer.wattage = 1800;
        dryer.drumCapacity = 9;
        dryer.modelType = "Condenser";
        dryer.isOperational = true;

        // Method Inherits
        System.out.println("Method Inherits");
        dryer.energyConsumption();

        System.out.println("");
        System.out.println("Manufacturer: " + dryer.manufacturer);
        System.out.println("Product: " + dryer.product);
        System.out.println("Wattage: " + dryer.wattage);
        System.out.println("Drum Capacity: " + dryer.drumCapacity + " kg");
        System.out.println("Model Type: " + dryer.modelType);
        System.out.println("Is Operational: " + dryer.isOperational);
    }
}