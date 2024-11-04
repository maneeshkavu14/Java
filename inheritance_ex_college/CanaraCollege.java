public class CanaraCollege extends College {
    int totalFaculties;
    int no_ofDepartments;

    public CanaraCollege(Principal principal, Hods[] hods, Professors[] professors, Students[] students,int totalFaculties, int no_ofDepartments){
		super(principal, hods, professors, students);
		this.totalFaculties = totalFaculties;
		this.no_ofDepartments = no_ofDepartments;
	}

    public void printDetails(){

    	System.out.println("\n****************************");

    	System.out.println("\nCANARA COLLEGE DETAILS");


		System.out.println("\n**************Principal details:****************\n");
		principal.printDetails();

		System.out.println("\n**************hod details:******************\n");
		for(int i = 0; i<hods.length; i++){
			hods[i].printDetails();
			System.out.println("\n");
		}

        System.out.println("\n*************Professors details:***********\n");
		for(int i = 0; i<professors.length; i++){
			professors[i].printDetails();
			System.out.println("\n");
		}
    		
    	System.out.println("\n**************Student details:*************\n");

    	for(int i = 0; i<students.length; i++){
			students[i].printDetails();
			System.out.println("\n");
			
		}

		System.out.println("\nNumber of Department is:"+no_ofDepartments);
		System.out.println("\nNumber of Faculty:"+totalFaculties );

	}
}