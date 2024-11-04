public class CollegeRunner {
    public static void main(String[] args) {

        
    
        // Creating the Principal for CanaraCollege
        Principal canaraPrincipal = new Principal("Dr. Rajeev Menon", 59, 128000.00f, "Curriculum development");


        // Creating HODs for CanaraCollege
        Hods hod1 = new Hods("Dr. Suman Rao", 53, 79000.00f, "Computer Science");
        Hods hod2 = new Hods("Dr. Arjun Shetty", 50, 77000.00f, "Electronics");
        Hods[] canaraHods = {hod1, hod2};

    
        // Creating Professors for CanaraCollege
        Professors professor1 = new Professors("Dr. Leela Pandit", 43, 60000.00f, "Machine Learning");
        Professors professor2 = new Professors("Dr. Anil Desai", 47, 62000.00f, "Software Engineering");
        Professors professor3 = new Professors("Dr. Pooja Verma", 41, 57000.00f, "Database Systems");
        Professors professor4 = new Professors("Dr. Kiran Bhat", 39, 54000.00f, "Operating Systems");
        Professors[] canaraProfessors = {professor1, professor2, professor3, professor4};
    
        // Creating Students for CanaraCollege
        Students student1 = new Students("Anirudh Patil", 21, "Computer Science");
        Students student2 = new Students("Sara Kulkarni", 20, "Electronics");
        Students student3 = new Students("Dev Singh", 22, "Mechanical Engineering");
        Students student4 = new Students("Meera Jain", 19, "Civil Engineering");
        Students student5 = new Students("Rohit Nayak", 23, "Information Technology");
        Students[] canaraStudents = {student1, student2, student3, student4, student5};
    
        // Creating CanaraCollege instance
        CanaraCollege canaraCollege = new CanaraCollege(canaraPrincipal, canaraHods, canaraProfessors, canaraStudents, 60, 5);
        
        canaraCollege.printDetails();


        // Creating the Principal for ShreeDeviCollege
        Principal shreeDeviPrincipal = new Principal("Dr. Priyadarshan Shetty", 56, 132000.00f, "Educational leadership");
    
    
        // Creating HODs for ShreeDeviCollege
        Hods hod3 = new Hods("Dr. Swati Shenoy", 51, 82000.00f, "Physics");
        Hods hod4 = new Hods("Dr. Rajan Pillai", 55, 87000.00f, "Mechanical Engineering");
        Hods[] shreeDeviHods = {hod3, hod4};
    

        // Creating Professors for ShreeDeviCollege
        Professors professor5 = new Professors("Dr. Neelima Joshi", 44, 63000.00f, "Thermodynamics");
        Professors professor6 = new Professors("Dr. Siddharth Prabhu", 48, 65000.00f, "Robotics");
        Professors professor7 = new Professors("Dr. Amrita Kumar", 42, 60000.00f, "Fluid Mechanics");
        Professors[] shreeDeviProfessors = {professor5, professor6, professor7};
    
        // Creating Students for ShreeDeviCollege
        Students student6 = new Students("Vishal Pai", 21, "Physics");
        Students student7 = new Students("Sneha Bhandari", 22, "Mechanical Engineering");
        Students student8 = new Students("Kavya Das", 20, "Electrical Engineering");
        Students student9 = new Students("Rohit Mishra", 23, "Civil Engineering");
        Students student10 = new Students("Madhavi Rane", 19, "Computer Science");
        Students[] shreeDeviStudents = {student6, student7, student8, student9, student10};
    
        // Creating ShreeDeviCollege instance
        ShreeDeviCollege shreeDeviCollege = new ShreeDeviCollege(shreeDeviPrincipal, shreeDeviHods, shreeDeviProfessors, shreeDeviStudents, 45, 10, 11);
        
        shreeDeviCollege.printDetails();
    }
}
