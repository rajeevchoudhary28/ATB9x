package Task_17102024;
//2. Take a user input 2 numbers from the argument and calculate the maximum in between them with ternary operator.
import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt and input for first number
        System.out.println("Enter first number to compare: ");
        int number1 = scanner.nextInt();

        // Prompt and input for second number
        System.out.println("Enter second number to compare: ");
        int number2 = scanner.nextInt();

        // Using ternary operator to find the greater number
        System.out.printf("The greater number is: %d", (number1 > number2 ? number1 : number2));

        // Close the scanner
        scanner.close();
    }
}
