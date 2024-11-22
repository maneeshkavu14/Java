package com.xworks.Interfaces;

public class ConfirmTkt implements TrainTicket, BusTicket {

	@Override
	public void trainBooking() {
		System.out.println("Train ticket Booked by confirmTckt");
	}

	@Override
	public void cancelTrainBooking() {
		
		System.out.println("Train ticket Cancelled by confirmTckt");
		
	}

	@Override
	public void busSeatCheck() {
		System.out.println("Bus seat available now on confirmTckt");
		
	}

	@Override
	public void bookBusSeat() {
		System.out.println("Bus ticket Booked by confirmTckt");
		
	}

}
