public class BusBooking{
	
	String busName;
	int routeNo;
	int seatCount;
	int price;
	String timings;



	public BusBooking(){

		System.out.println("No param Constructor");

	}

	public BusBooking(String busName){
		this();
		this.busName=busName;
	}

	public BusBooking(String busName,int routeNo,int seatCount){

		this(busName);
		this.routeNo=routeNo;
		this.seatCount=seatCount;

	}

	public BusBooking(String busName,int routeNo,int seatCount, int price,String timings){

		this(busName,routeNo,seatCount);
		this.price=price;
		this.timings=timings;


	}

	public void printDetails(){

		System.out.println("busName "+busName);
		System.out.println("routeNo "+routeNo);
		System.out.println("seatCount "+seatCount);
		System.out.println("price "+price);
		System.out.println("timings "+timings);
	}
}

