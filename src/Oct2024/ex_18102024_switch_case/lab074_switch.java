package Oct2024.ex_18102024_switch_case;

import java.util.Scanner;

public class lab074_switch {
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
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Entry...");
                break;
        }
        System.out.println("End of the loop...");
        sc.close();
    }
}
