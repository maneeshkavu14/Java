public class Hods extends StaffInfo {
    String departmentName;

	public Hods(String name, int age, float salary, String departmentName){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.departmentName = departmentName;
	}

	public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
		System.out.println("Name Of Department is:"+departmentName);
	}
}