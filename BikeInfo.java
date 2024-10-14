public class BikeInfo{
	public static void main(String[] args) {
		
// No parameterized
		Bike bike1=new Bike();
		Bike bike2=new Bike();
		Bike bike3=new Bike();


// Parameterized
		Bike bike11= new Bike( "RE", 120, "Thunder", 2021, "Petrol");
		Bike bike12= new Bike( "Honda", 678, "Unicorn", 2019, "Petrol");
		Bike bike13= new Bike( "Suzuki", 564, "Gixxer", 2017, "Petrol");
		Bike bike14= new Bike( "Kawasaki", 720, "Ninja 800", 2018, "EV");
		Bike bike15= new Bike( "KTM", 178, "Duke 250", 2023, "Petrol");
		Bike bike16= new Bike( "Bajaj", 020, "pulsur 200", 2020, "Petrol");
		Bike bike17= new Bike( "TVS", 1340, "RR310", 2019, "Petrol");



		bike11.bikeDetails();
		System.out.println("****************************");

		bike12.bikeDetails();
		System.out.println("****************************");

		bike13.bikeDetails();
		System.out.println("****************************");

		bike14.bikeDetails();
		System.out.println("****************************");

		bike15.bikeDetails();
		System.out.println("****************************");

		bike16.bikeDetails();
		System.out.println("****************************");
		
		bike17.bikeDetails();

	}
}