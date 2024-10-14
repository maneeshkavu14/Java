public class Bike{
	
	String brandName;
    int modelNo;
    String bikeName;
    int manufYear;
    String fuelType; 

    public Bike(){
		
		System.out.println("****************************");

    	System.out.println("No parameterized Constructor");

    	System.out.println("****************************");
    }


    public Bike( String brandName,int modelNo,String bikeName,int manufYear,String fuelType){

    	this.brandName=brandName;
    	this.modelNo=modelNo;
    	this.bikeName=bikeName;
    	this.manufYear=manufYear;
    	this.fuelType=fuelType;

    }


    public static void startEngine(){

    }
    public static void stopEngine(){

    }
    public static void refuel(){

    }
    public void bikeDetails(){


    	System.out.println("Brand name "+ brandName);
    	System.out.println("model No "+ modelNo);
    	System.out.println("Bike name "+ bikeName);
    	System.out.println("manufaturing year "+ manufYear);
    	System.out.println("Fuel type "+ fuelType);


    }


}


