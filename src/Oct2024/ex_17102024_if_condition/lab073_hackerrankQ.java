package Oct2024.ex_17102024_if_condition;

import java.util.Scanner;

public class lab073_hackerrankQ {
    public static void main(String[] args) {

        // Grade calculator
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();

        if (90 <= score & score <= 100){
            System.out.println("Grade A");
        } else if (80 <= score & score <= 89) {
            System.out.println("Grade B");
        } else if (70 <= score & score <= 79) {
            System.out.println("Grade C");
        } else if (60 <= score & score <= 69) {
            System.out.println("Grade D");
        } else if (0 <= score & score <= 59) {
            System.out.println("Grade F");
        }else {
            System.out.println("score out of limit..");
        }

    }
}
