package Task_18102024;

//Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//    Input. -
//    choice - 1 - km → m, km → 1km
//    choice - 2 - f → c, f → c

import java.util.Scanner;

public class task003_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform: \n 1. Kilometers to miles \n 2. Celsius to Fahrenheit");
        int operation = sc.nextInt();
        System.out.println("Enter the value: ");
        int user_value = sc.nextInt();

        switch (operation){
            case 1:
                double miles = user_value * 0.621371;
                System.out.println(miles + " miles");
                break;
            case 2:
                double fahrenheit = (user_value * 1.8) + 32;
                System.out.println(fahrenheit + " fahrenheit");
                break;
                default:
                System.out.println("Please choose from 1 or 2...");
                break;
        }
        sc.close();
    }

}
