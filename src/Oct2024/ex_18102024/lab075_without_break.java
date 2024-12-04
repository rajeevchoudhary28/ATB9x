package Oct2024.ex_18102024;

import java.util.Scanner;

public class lab075_without_break {
    public static void main(String[] args) {

        //Switch condition
        //User - Enter int number 1 to 7
        //which day it is
        //1- mon, 2- tue, 3- wed, 4- thu, 5- fri, 6- sat, 7- sun
        // else invalid entry

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 : ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid Entry...");
        }
        System.out.println("End of the loop...");
        sc.close();
    }
}
