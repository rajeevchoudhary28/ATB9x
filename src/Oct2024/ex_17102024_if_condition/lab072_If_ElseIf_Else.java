package Oct2024.ex_17102024_if_condition;

import java.util.Scanner;

public class lab072_If_ElseIf_Else {

    public static void main(String[] args) {

        // more than 2 conditions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("a");
        } else if (b > a) {
            System.out.println("b");
        }
        else {
            System.out.println("both are equal");
        }
    }
}
