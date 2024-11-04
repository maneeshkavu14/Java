public class CanaraCollege extends College {
    int totalFaculties;
    int no_ofDepartments;

    public CanaraCollege(Principal principal, Hods[] hods, Professors[] professors, Students[] students,int totalFaculties, int no_ofDepartments){
		super(principal, hods, professors, students);
		this.totalFaculties = totalFaculties;
		this.no_ofDepartments = no_ofDepartments;
	}

    public void printDetails(){

    	System.out.println("\nCANARA COLLEGE DETAILS");


		System.out.println("\n**************Principal details:****************");
		principal.printDetails();

		System.out.println("\n**************hod details:******************");
		for(int i = 0; i<hods.length; i++){
        	System.out.println("\n");
			hods[i].printDetails();
		}

        System.out.println("\n*************Professors details:***********");
		for(int i = 0; i<professors.length; i++){
			System.out.println("\n");
			professors[i].printDetails();
		}
    		
    	System.out.println("\n**************Student details:*************");

    	for(int i = 0; i<students.length; i++){
    		System.out.println("\n");
			students[i].printDetails();
		}

		System.out.println("\nNumber of Department is:"+no_ofDepartments);
		System.out.println("\nNumber of Faculty:\n"+totalFaculties);

	}
}