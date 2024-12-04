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
        String Grade = "";
        if (90 <= score & score <= 100){
            Grade  = "A";
        } else if (80 <= score & score <= 89) {
            Grade = "B";
        } else if (70 <= score & score <= 79) {
            Grade = "C";
        } else if (60 <= score & score <= 69) {
            Grade = "D";
        } else if (0 <= score & score <= 59) {
            Grade = "F";
        }else {
            Grade = "score out of limit..";
        }
        System.out.println("Your Grade is " + Grade);

    }
}
