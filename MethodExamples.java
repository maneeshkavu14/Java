public class MethodExamples {
    public static void main(String[] args) {
        addTwoNumbers();
        addThreeNumbers();
        addArray();
        average();
        sumOfNaturalNumbers();
        addFixedNumbers();
        addDifferentNumbers();
        addNegativeNumbers();
        addDecimalAndInteger();
        squareRoot();
    }
   
    public static void addTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int sum = firstNumber + secondNumber;
        System.out.println("Addition of two numbers: " + sum);
    }

   
    public static void addThreeNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 3;
        int totalSum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Addition of three numbers: " + totalSum);
    }

   
    public static void addArray() {
        int[] numberArray = {1, 2, 3, 4, 5};
        int arraySum = 0;
        for (int number : numberArray) {
            arraySum += number;
        }
        System.out.println("Addition of array: " + arraySum);
    }

    
    public static void average() {
        int firstNumber = 10;
        int secondNumber = 5;
        double averageValue = (firstNumber + secondNumber) / 2.0;
        System.out.println("Average of two numbers: " + averageValue);
    }

    
    public static void sumOfNaturalNumbers() {
        int naturalCount = 5;
        int naturalSum = 0;
        for (int i = 1; i <= naturalCount; i++) {
            naturalSum += i;
        }
        System.out.println("Sum of first " + naturalCount + " natural numbers: " + naturalSum);
    }

    
    public static void addFixedNumbers() {
        int numberOne = 12;
        int numberTwo = 8;
        int fixedSum = numberOne + numberTwo;
        System.out.println("Addition of fixed numbers: " + fixedSum);
    }

    
    public static void addDifferentNumbers() {
        int numberA = 7;
        int numberB = 14;
        int differentSum = numberA + numberB;
        System.out.println("Addition of different numbers: " + differentSum);
    }

    
    public static void addNegativeNumbers() {
        int negativeNumberOne = -4;
        int negativeNumberTwo = -6;
        int negativeSum = negativeNumberOne + negativeNumberTwo;
        System.out.println("Addition of negative numbers: " + negativeSum);
    }

    
    public static void addDecimalAndInteger() {
        double decimalValue = 5.5;
        int integerValue = 3;
        double result = decimalValue + integerValue;
        System.out.println("Addition of decimal and integer: " + result);
    }

   
    public static void squareRoot() {
       int number = 16;
       double sqrt = Math.sqrt(number);
       System.out.println("Square root of " + number + ": " + sqrt);
    }
}
