public class Car{
	
	 static String manufacturer;
	 static String fuelType;
	 static int totalCarsProduced;
	 String model;
     String color;
     double price;
     int speed;

     static {

     	manufacturer="Mercedez";
     	fuelType="Electric";
     	totalCarsProduced=20000;


     }

     public Car(String model, String color, double price,int speed ){

     	this.model=model;
     	this.color=color;
     	this.price=price;
     	this.speed=speed;

     }

     public void printDetails(){

     	System.out.println("manufacturer:"+manufacturer);
     	System.out.println("fuelType:"+fuelType);
     	System.out.println("totalCarsProduced:"+totalCarsProduced);
     	System.out.println("model:"+model);
     	System.out.println("color:"+color);
     	System.out.println("price:"+price);
     	System.out.println("speed:"+speed);
     	
    	System.out.println("*****************************");


     }




}