public class MainInfo{
	

	public static void main(String[] args) {
		

		Employee employee = new Employee( "Maneesh",121,"Software",20000.99);

		LibraryBook bookDetails = new LibraryBook("GOD OF WAR", "Athul",321, 2000); 

		Car carDetails= new Car("Benz","black",2500000, 240);

		MobilePhone mobile= new MobilePhone("Galaxy",56000,"Red",6000);

		Product productDetails= new Product("Iphone 15 Pro",100000,ProductColorEnum.RED,25);

		employee.printDetails();

		bookDetails.printDetails();

		carDetails.printDetails();

		mobile.printDetails();


	}
}