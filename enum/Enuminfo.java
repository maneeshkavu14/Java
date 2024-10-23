public class Enuminfo{
	
	public static void main(String[] args) {
		

		 EnumExamples exampleData = new EnumExamples(TrafficLights.RED, Month.SEPTEMBER,BrowserType.EDGE,
		 	TaskPriority.HIGH,GearTransmissionType.MANUAL,Currency.INR,ProgrammingLanguage.C,DeviceStatus.ONLINE,Planet.MARS,FilePermission.EXECUTE);
		 exampleData.printdetails();
	}
}