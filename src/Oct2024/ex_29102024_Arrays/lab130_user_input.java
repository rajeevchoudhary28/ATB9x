package Oct2024.ex_29102024_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lab130_user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number: " + (i+1));
            number[i] = sc.nextInt();
        }
        System.out.println("----------------------------");

        // store numbers
        System.out.println("The numbers are:");
        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);
        }


    }
}
