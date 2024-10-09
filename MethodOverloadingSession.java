public class MethodOverloadingSession{
	public static void main(String []args){

	// 1. Change the datatype of parameter(same method name with diff parameter)
	// 2. Change the no.of parameter(same method name with multiple parameter)
	// 3. Change the order of the datatype(same method name with changing the datatype parameter)

//findProductsBy

		findProductsBy("Powder");
		findProductsBy(23);

		findProductsBy(32, " soap ", 22.5f);

		findProductsBy("Sruber ", 15);


// sendEmail methods

		sendEmail("anish@gmail.com");
		sendEmail(true);

		sendEmail("sumanth@gmail.com", "Issue with the product", 3);

		sendEmail("athul@gmail.com", 3,"Bad Quality product");


// Paying a bill

		payBill(599.99);
		
		payBill(500000, "LPG");

		payBill("Electricity", 500);

	}


//findProductsBy

	public static void  findProductsBy(String p_name){
		System.out.println(p_name);
	}
	public static void  findProductsBy(int p_id){
		System.out.println(p_id);
	}

	public static void findProductsBy(int p_id , String p_name, float p_price){
		System.out.println(p_id + p_name + p_price);

	}

	public static void findProductsBy(String p_name, int p_id ){
		System.out.println(p_name + p_id);
	}

// sendEmail methods

	public static void sendEmail(String recipientemailid){
		System.out.println("Email sent to " + recipientemailid);
	}

	public static void sendEmail( boolean highPriority){
		System.out.println("High Priority: " + highPriority);
	}


	public static void sendEmail(String recipientemailid, String subject, int retries){
		System.out.println("Email sent to " + recipientemailid + " with subject: " + subject + ", Retries: " + retries);
	}

	public static void sendEmail(String recipient, int retries, String subject){
		System.out.println("Email sent to " + recipient +  ", Retries: " + retries + ", with subject: " + subject);
	}


// Paying a bill

	public static void payBill(double amount){
		System.out.println("Paying bill of amount: " + amount);
	}

	public static void payBill(long amount, String billType){
		System.out.println("Amount is " + amount + " bill type is: " + billType);
	}

	public static void payBill(String billType, int amount){
		System.out.println("Paying " + billType + " bill of amount: " + amount);
	}

}