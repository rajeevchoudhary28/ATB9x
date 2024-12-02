//1. Take a user input - Name, age, salary and print them in end
package Task_17102024;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        // name
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner1.next();
        // Age
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your age : ");
        String age = scanner2.next();
        // salary
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        String salary = scanner3.next();


        System.out.printf("Your name is - %s, age is - %s, and salary is - %s", name, age, salary);

        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
