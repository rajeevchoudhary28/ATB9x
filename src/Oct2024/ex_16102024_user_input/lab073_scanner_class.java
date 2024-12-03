package Oct2024.ex_16102024_user_input;

import java.util.Scanner;

public class lab073_scanner_class {
    public static void main(String[] args) {
        // scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "Allowed to goa" : "Not allowed in goa");



    }
}
