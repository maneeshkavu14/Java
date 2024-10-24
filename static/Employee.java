public class Employee{
	
	static String companyName ;
    static String industry;
    static int totalEmployees;

	String name;
    int id;
    String department;
    double salary;


    static{

  	companyName = "TechCorp";
    industry = "Software";
    totalEmployees = 500;
    }

    public Employee(String name,int id,String department,double salary){

    	this.name=name;
    	this.id=id;
    	this.department=department;
    	this.salary=salary;
    }

    public void printDetails(){

    	System.out.println("companyName: "+companyName);
    	System.out.println("industry: "+industry);
    	System.out.println("totalEmployees: "+totalEmployees);
    	System.out.println("name: "+name);
    	System.out.println("id: "+id);
    	System.out.println("department: "+department);
    	System.out.println("salary: "+salary);


    	System.out.println("*****************************");




    }
}