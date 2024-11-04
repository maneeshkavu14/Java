public class Principal extends StaffInfo {
	String specialization;

    public Principal(String name, int age, float salary,String specialization){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.specialization = specialization;
	}

    public void printDetails(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("specialization :"+specialization);
	}
}