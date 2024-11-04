public class Students extends StudentInfo {
    String departmentName;

    public Students(String studentName, int studentAge, String departmentName){

		this.studentName = studentName;
		this.studentAge = studentAge;
		this.departmentName = departmentName;
	}

	public void printDetails(){
		System.out.println("Name is:"+studentName);
		System.out.println("Age is:"+studentAge);
		System.out.println("Department Name is:"+departmentName);
	}
}