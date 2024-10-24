public class Product{


	static String brand;
	static String category;
	static int warrantyYears;

	String productName;
    double price;
    ProductColorEnum color;
    int stockQuantity; 

    static{

    	brand = "Apple";
    	category="Electronics";
    	warrantyYears=1;

    }
	

	public Product(String productName, double price, ProductColorEnum color, int stockQuantity){

		this.productName = productName;
        this.price = price;
        this.color = color;
        this.stockQuantity = stockQuantity;


	}

	public void printDetails(){
		System.out.println("brand:"+brand);
     	System.out.println("category:"+category);
     	System.out.println("warrantyYears:"+warrantyYears);
     	System.out.println("productName:"+productName);
     	System.out.println("price:"+price);
     	System.out.println("color:"+color);
     	System.out.println("stockQuantity:"+stockQuantity);

    	System.out.println("*****************************");


	}

}