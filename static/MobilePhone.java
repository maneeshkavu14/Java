public class MobilePhone{
	
	static String manufacturer;
	static String os ;
	static int warranty;
	String model;
    double price;
    String color;
    int batteryCapacity;



    static{

    manufacturer="Samsung";
    os="Android";
    warranty=2;


    }

   public MobilePhone(String model, double price, String color, int batteryCapacity) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.batteryCapacity = batteryCapacity;
    }

   public void printDetails(){
   		System.out.println("manufacturer:"+manufacturer);
     	System.out.println("os:"+os);
     	System.out.println("warranty:"+warranty);
     	System.out.println("model:"+model);
     	System.out.println("price:"+price);
     	System.out.println("color:"+color);
     	System.out.println("batteryCapacity:"+batteryCapacity);

    	System.out.println("*****************************");
     	

   }
}