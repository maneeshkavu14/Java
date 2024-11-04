public class ShreeDeviCollege extends College {
    
    int totalFaculties;
    int no_ofDepartments;
    int no_ofEvents;

    public ShreeDeviCollege(Principal principal, Hods[] hods, Professors[] professors, Students[] students,int totalFaculties, int no_ofDepartments,int no_ofEvents){
		super(principal, hods, professors, students);
		this.totalFaculties = totalFaculties;
		this.no_ofDepartments = no_ofDepartments;
		this.no_ofEvents=no_ofEvents;
	}

    public void printDetails(){

    	System.out.println("SHREE DEVI COLLEGE DETAILS");

		System.out.println("\n**************Principal details:****************");
		principal.printDetails();

		System.out.println("\n**************hod details:******************\n");
		for(int i = 0; i<hods.length; i++){
        	System.out.println("\n");
			hods[i].printDetails();
		}

        System.out.println("\n*************Professors details:***********\n");
		for(int i = 0; i<professors.length; i++){
			System.out.println("\n");
			professors[i].printDetails();
		}
    		
    	System.out.println("\n**************Student details:*************\n");

    	for(int i = 0; i<students.length; i++){
    		System.out.println("\n");
			students[i].printDetails();
		}

		System.out.println("\nNumber of Department is:"+no_ofDepartments);
		System.out.println("\nNumber of Faculty:"+totalFaculties);
		System.out.println("\nNumber of Events:\n"+no_ofEvents);

	}
}
