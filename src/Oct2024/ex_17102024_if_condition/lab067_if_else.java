package Oct2024.ex_17102024_if_condition;

import java.util.Scanner;

public class lab067_if_else {
    public static void main(String[] args) {
            // int age = 20;
            // Allowed to vote
            // if age > 18 -> allowed to vote
            // if age <18 -> Not allowed to vote
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("Allowed to vote...");
        }
        else{
            System.out.println("Not allowed to vote...");
        }
        sc.close();

    }
}

