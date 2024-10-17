public class SmartWatchDetails {
	
	// array named as watchesDetails
	static SmartWatch[] watchesDetails = new SmartWatch[8];

	public static void main(String[] args) {
		
		SmartWatch watch1 = new SmartWatch("Huawei", "Suse Fit", 200, 20000);
		SmartWatch watch2 = new SmartWatch("Samsung", "Light Fit", 400, 18000);
		SmartWatch watch3 = new SmartWatch("Boat", "Boat Fit", 450, 32000);
		SmartWatch watch4 = new SmartWatch("Firebolt", "Ninja Fit", 700, 22000);
		SmartWatch watch5 = new SmartWatch("Apple", "Watch Series 6", 550, 45000);
		SmartWatch watch6 = new SmartWatch("Garmin", "Forerunner", 300, 35000);
		SmartWatch watch7 = new SmartWatch("OnePlus", "OnePlus Band", 250, 15000);
		SmartWatch watch8 = new SmartWatch("Fitbit", "Versa 3", 500, 30000);

		savedData(watch1);
		savedData(watch2);
		savedData(watch3);
		savedData(watch4);
		savedData(watch5);
		savedData(watch6);
		savedData(watch7);
		savedData(watch8);

		///filter by name

		watchBrandName("Firebolt");


		/// update the price

		updateByPrice("Samsung",25000);


		/// delete by name 

		boolean result=deleteByName("Samsung");

		if(result = true){
			System.out.println("After deletion remaining");

			for (int i = 0; i < watchesDetails.length; i++) {
			if (watchesDetails[i] != null) {
				watchesDetails[i].displayDetails();
			}
			// else{
			// 		System.out.println("Null Found :");
			// }
		}

		}
	}

	/// filter by brand name

	public static SmartWatch watchBrandName(String WatchName) {
		for (int i = 0; i < watchesDetails.length; i++) {
			// if(watchesDetails[i]!=null){
				if (watchesDetails[i].brandName.equals(WatchName)) {
					System.out.println("****************************");
					System.out.println("Watch Found :");
					// System.out.println("****************************");
					watchesDetails[i].displayDetails();
					return watchesDetails[i];
				}
			// }
		}
		System.out.println("****************************");
		System.out.println("watch not found");
		System.out.println("****************************");
		return null;
	}

/// update the existing value

	public static boolean updateByPrice(String WatchName, int NewPrice) {
		for (int i = 0; i < watchesDetails.length; i++) {
			// if(watchesDetails[i]!=null){
				if (watchesDetails[i].brandName.equals(WatchName)) {
					System.out.println("****************************");
					System.out.println("Before Update :");

					watchesDetails[i].displayDetails();
					
					watchesDetails[i].price = NewPrice;
					System.out.println("****************************");
					System.out.println("After Update :");
					watchesDetails[i].displayDetails();
					
				return true;
				}
			// }
		}
		System.out.println("Update fails");
		return false;
	}


	/// delete the existing value

	public static boolean deleteByName (String WatchName){

		for(int i=0;i<watchesDetails.length; i++){

			if (watchesDetails[i]!=null) {
				if(watchesDetails[i].brandName.equals(WatchName)){
				System.out.println("****************************");
				System.out.println("Deleting in progress . . . .");
				watchesDetails[i].displayDetails();
				System.out.println("****************************");
				System.out.println("Deleted successfully");
				watchesDetails[i]=null;
				System.out.println("****************************");		
				return true;
				}
				
			}
			
		}
				System.out.println("****************************");
				System.out.println("Went Wrong");
				return false;
		

	}

	public static boolean savedData(SmartWatch watches) {

		for (int i = 0; i < watchesDetails.length; i++) {
			if (watchesDetails[i] == null) {
				watchesDetails[i] = watches;
				return true;
			}
		}

		System.out.println("Sorry, data could not be inserted!!!");
		return false;
	}
}
