package Oct2024.ex_30102024;

import java.util.Scanner;

public class lab137_right_triangle {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row length ");
        int row_length = sc.nextInt();

        for (int i = 0; i <= row_length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
        for (int i = 0; i < (row_length + 1); i++) {
            System.out.print("*  ");

        }
        System.out.println();
        for (int i = row_length; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}
