public class StringMethodExample {
	public static void main(String[] args) {
		//Concat
		System.out.println("Concatenate String");
		String firstName = "Arun";
		String lastName = " Kumar";
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);

		//toUpper
		System.out.println("");
		System.out.println("String to Upper Case");
		String movieName = "inception";
		String nameUpper = movieName.toUpperCase();
		System.out.println(nameUpper);

		//toLower
		System.out.println("");
		System.out.println("String to Lower Case");
		String carName = "FERRARI";
		String carNameLower = carName.toLowerCase();
		System.out.println(carNameLower);

		//trim
		System.out.println("");
		System.out.println("String Trim");
		String bankName = "    HSBC    ";
		String nameTrim = bankName.trim();
		System.out.println(nameTrim);

		//isEmpty
		System.out.println("");
		System.out.println("String is Empty or not");
		String value = "test";
		Boolean valueEmpty = value.isEmpty();
		System.out.println(valueEmpty);

		//split
		System.out.println("");
		System.out.println("Split String");
		String ownerName = "Elon Musk";
		String[] nameSplit = ownerName.split(" ");
		System.out.println(nameSplit[0]);
		System.out.println(nameSplit[1]);

		//Palindrome
		System.out.println("");
		System.out.println("Palindrome");
		String originalName = "racecar";
		String reversedName = "";
		char[] originalNameArray = originalName.toCharArray();
		for(int i = originalNameArray.length - 1; i >= 0; i--) {
			reversedName = reversedName + originalNameArray[i];
		}
		if(originalName.equals(reversedName)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Is not a Palindrome");
		}


		//Second Smallest
		System.out.println("");
		System.out.println("Second Smallest Number");
		int[] arr = {10, 5, 3, 25, 78, 1, 99, 2};
		int smallValue = secondSmallestNum(arr);
		System.out.println(smallValue);
	}

	public static int secondSmallestNum(int arr[]) {
		int smallestValue = arr[0];
		int secondSmallestValue = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < smallestValue) {
				secondSmallestValue = smallestValue;
				smallestValue = arr[i];
			}
			else if(arr[i] < secondSmallestValue) {
				secondSmallestValue = arr[i];
			}
		}
		return secondSmallestValue;
	}
}
