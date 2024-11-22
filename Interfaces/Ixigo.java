package com.xworks.Interfaces;

public class Ixigo implements BusTicket, TrainTicket {

	@Override
	public void trainBooking() {
		System.out.println("Train ticket Booked by Ixigo");
	}

	@Override
	public void cancelTrainBooking() {
		
		System.out.println("Train ticket Cancelled in Ixigo");
		
	}

	@Override
	public void busSeatCheck() {
		System.out.println("Bus seat available now in Ixigo");
		
	}

	@Override
	public void bookBusSeat() {
		System.out.println("Bus ticket Booked by Ixigo");
		
	}

	
	
	

}
