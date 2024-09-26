public class VariableExample {
    public static void main(String[] args) {
        // Byte variables
        byte batteryLevel = 75;
        byte maxPlayers = 8;
        byte minPasswordLength = 8;
        byte numberOfLanguages = 5;
        byte maxLoginAttempts = 3;
        byte minTemperatureInFahrenheit = -20;
        byte maxConnectionRetries = 5;
        byte numberOfWheelsInCar = 4;

        // Short variables
        short currentYear = 2024;    
        short totalPagesInNoteBook = 250;  
        short maxScoreOfStudent = 300;  
        short TotalSwitchesInHall = 130;       
        short numberOfEmployeesInStartupCompany = 200;    
        short totalGamesPlayedInOneDay = 1500;
        short serverPort = 8080;          
        short totalStudentsInClass = 3000;    

        // Output the values
        System.out.println("Battery Level: " + batteryLevel);
        System.out.println("Max Players: " + maxPlayers);
        System.out.println("Max Password Length: " + minPasswordLength);
        System.out.println("Number of Languages: " + numberOfLanguages);
         // Reassinging
        numberOfLanguages = 9;
        System.out.println("Number of Languages Reassigned: " + numberOfLanguages);

        System.out.println("Max Attempts: " + maxLoginAttempts);
        System.out.println("Min Temperature in Farenheit: " + minTemperatureInFahrenheit);
        System.out.println("Max  Re-tries allowed: " + maxConnectionRetries);
        System.out.println("No.of Wheels in a Car: " + numberOfWheelsInCar);
        
        System.out.println("Current Year: " + currentYear);
        System.out.println("Total Pages: " + totalPagesInNoteBook);
        System.out.println("Max Score Of Students: " + maxScoreOfStudent);
        System.out.println("Total Switches in a Hall: " + TotalSwitchesInHall);
        System.out.println("Number of Employees: " + numberOfEmployeesInStartupCompany);
        System.out.println("Total Games Played: " + totalGamesPlayedInOneDay);
        System.out.println("Server Port: " + serverPort);
        System.out.println("Total Students In a Class: " + totalStudentsInClass);

        // #Reassigning

        totalStudentsInClass = 1000; 
        System.out.println("Total Students In a Class Reassigned: " + totalStudentsInClass);



       
        

    }
}
