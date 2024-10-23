public class EnumExamples{

	//traffic

	TrafficLights signalNow;
	Month month ;
	BrowserType browser;
	TaskPriority task;
	GearTransmissionType gearType;
	Currency currency;
	ProgrammingLanguage p_language;
	DeviceStatus status;
	Planet planet;
	FilePermission file;
	

	public EnumExamples(TrafficLights signalNow, Month month,BrowserType browser, TaskPriority task, 
		GearTransmissionType gearType, Currency currency, ProgrammingLanguage p_language, DeviceStatus status, Planet planet, FilePermission file){

		this.signalNow=signalNow;
		this.month=month;
		this.browser=browser;
		this.task=task;
		this.gearType=gearType;
		this.currency=currency;
		this.p_language=p_language;
		this.status=status;
		this.planet =planet;
		this.file=file;
		
	}

	public void printdetails(){
		System.out.println(signalNow);
		System.out.println(month);
		System.out.println(browser);
		System.out.println(task);
		System.out.println(gearType);
		System.out.println(currency);
		System.out.println(p_language);
		System.out.println(status);
		System.out.println(planet);
		System.out.println(file);
	}

}