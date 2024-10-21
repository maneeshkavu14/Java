public class StringExample {
	
	public static void main(String[] args) {
		
		String favoriteBook = "To Kill a Mockingbird";				
		String authorName = "Harper Lee";
		String genre = "Fiction";
		String publicationYear = "1960";
		String language = "English";
		String publisher = "J.B. Lippincott & Co.";
		String mainCharacter = "Scout Finch";
		String setting = "Maycomb, Alabama";
		String theme = "Racial Injustice";
		String awards = "Pulitzer Prize";

		String employeeFavoriteBook = new String("To Kill a Mockingbird");
		String employeeAuthorName = new String("Harper Lee");
		String employeeGenre = new String("Fiction");
		String employeeLocation = new String("New York");
		String employeePosition = new String("Editor");
		String employeeCompany = new String("Publishing House");
		String employeeManagerName = new String("Jessica");
		String employeeProject = new String("Literary Analysis");

		System.out.println("*********** Comparing String Values using equals() **********");
		System.out.println(favoriteBook.equals(employeeFavoriteBook));

		System.out.println("*********** Comparing String Values using == **********");
		System.out.println(favoriteBook == employeeFavoriteBook);
		
		System.out.println("*********** Reversing a string **********");
		System.out.println("Reversing string is:\n " + favoriteBook);
		char[] characterArray = favoriteBook.toCharArray();
		String reversedString = "";
		for (int i = characterArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + characterArray[i];
		}
		System.out.println("String after Reverse: \n" + reversedString);
	}
}
