public class MethodOverloadingSession{
	public static void main(String []args){

		//findProductsBy

	// Change the datatype of parameter(same method name with diff parameter)
		findProductsBy("Powder");
		findProductsBy(23);

	// Change the no.of parameter(same method name with multiple parameter)	
		findProductsBy(32, " soap ", 22.5f);

	// Change the order of the datatype(same method name with changing the datatype parameter)
		findProductsBy("Sruber ", 15);

		}

	// Change the datatype of parameter(same method name with diff parameter)

	public static void  findProductsBy(String p_name){
		System.out.println(p_name);
	}

	public static void  findProductsBy(int p_id){
		System.out.println(p_id);
	}

	// Change the no.of parameter(same method name with multiple parameter)

	public static void findProductsBy(int p_id , String p_name, float p_price){
		System.out.println(p_id + p_name + p_price);

	}

	// Change the order of the datatype(same method name with changing the datatype parameter)

	public static void findProductsBy(String p_name, int p_id ){
		System.out.println(p_name + p_id);

	}

}