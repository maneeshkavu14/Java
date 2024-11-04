public class Professors extends StaffInfo {
	String subjectName;

	public Professors(String name, int age, float salary, String subjectName){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.subjectName = subjectName;
	}

	public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
		System.out.println("Subject Name is:"+subjectName);
	}
}