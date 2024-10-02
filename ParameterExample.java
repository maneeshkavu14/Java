public class ParameterExample {



    public static void main(String[] args) {

        // Invoking email method three times

        email("anish@gmail.com", "Welcome to our service!");
        email("sumanth@gmail.com", "Your order has been shipped");
        email("maneesh@gmail.com", "Account verification required");


        // Invoking phoneCall method three times

        phoneCall(893456789l, "Alice", "+1");
        phoneCall(6543210l, "Bob", "+971");
        phoneCall(5556667777l, "Charlie", "+91");

        // Invoking login method three times
        login("user1@example.com", "password123");
        login("user2@example.com", "mypassword456");
        login("user3@example.com", "securepass789");
    }

    // Method to send an email
    public static void email(String emailId, String subject) {
        System.out.println("Email sent to " + emailId + " with subject: '" + subject + "'");
    }



    // Method to make a phone call
    public static void phoneCall(long mobileNum, String name, String countryCode) {
        System.out.println("Phone call made to " + name + " (" + countryCode + mobileNum + ")");
    }



    // Method to log in
    public static void login(String email, String password) {
        System.out.println("Logged in with email: " + email + " and password: " + password);
    }

}