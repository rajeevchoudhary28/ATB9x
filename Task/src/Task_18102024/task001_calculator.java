package Task_18102024;

//1. Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//    Inputs :   num 1, num 2, +
//    Output :  num1+num2 → print information.

import java.util.Scanner;

public class task001_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = sc.nextDouble();
        System.out.println("Enter the operation number which you want to perform: \n 1. addition \n 2. subtraction \n 3. multiplication \n 4. division \n 5. modulus ");
        int operation = sc.nextInt();

        switch (operation){
            case 1 -> System.out.println(number1 + number2);
            case 2 -> System.out.println(number1 - number2);
            case 3 -> System.out.println(number1 * number2);
            case 4 -> System.out.println(number1 / number2);
            case 5 -> System.out.println(number1 % number2);
            default -> System.out.println("wrong operation selected...");

        }
        sc.close();

    }
}
