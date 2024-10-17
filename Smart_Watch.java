public class SmartWatch{

	String brandName;
	String modelName;
	int batteryCapacity;
	int price;


public SmartWatch(){

	System.out.println("Non Parameterised");

}


public SmartWatch( String brandName,String modelName,int batteryCapacity, int price){

	this.brandName=brandName;
	this.modelName=modelName;
	this.batteryCapacity=batteryCapacity;
	this.price=price;



}


public void displayDetails(){

	System.out.println("****************************");
	System.out.println("Brand Name: "+brandName);
	System.out.println("Brand model Name: "+modelName);
	System.out.println("battery Capacity: "+batteryCapacity);
	System.out.println("Watch Price: "+price);

}

}