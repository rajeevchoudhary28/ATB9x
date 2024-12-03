package Oct2024.ex_17102024_if_condition;

import java.util.Scanner;

public class lab071 {
    public static void main(String[] args) {

        // create a program - take use input
        // check it is even or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number  = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("number is even..");
        }
        else {
            System.out.println("number is odd..");
        }
        sc.close();

    }
}
