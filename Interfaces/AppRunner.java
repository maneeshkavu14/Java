package com.xworks.Interfaces;

public class AppRunner {

	public static void main(String[] args) {
		
		
		ConfirmTkt useConfirmTktPlatform = new ConfirmTkt();
		
		useConfirmTktPlatform.busSeatCheck();
		useConfirmTktPlatform.bookBusSeat();
	
		
		Ixigo useIxigoPlatform= new Ixigo();
		
		
		useIxigoPlatform.trainBooking();
		useIxigoPlatform.cancelTrainBooking();
		

	}

}
