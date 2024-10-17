public class SmartWatchDetails{
	
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


		


		for (int i=0; i<watchesDetails.length; i++)
		{

		if (watchesDetails[i]!=null){

			watchesDetails[i].displayDetails();
		}
		}



	}

	public static boolean savedData( SmartWatch watches){

		for (int i=0;i<watchesDetails.length ; i++) {

		if(watchesDetails[i]==null){
			watchesDetails[i]=watches;
			return true;
		}
		
	}

	System.out.println("Sorry data Could not be inserted!!!");
	return false;

	}

}
