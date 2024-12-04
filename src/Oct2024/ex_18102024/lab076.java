package Oct2024.ex_18102024;

import java.util.Scanner;

public class lab076 {
    public static void main(String[] args) {

        // chrome
        //firefox
        //edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name: ");
        String browser = sc.next().toLowerCase();
        //browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome....");
                break;
            case "firefox":
                System.out.println("Starting firefox....");
                break;
            case "edge":
                System.out.println("Starting edge....");
                break;
            default:
                System.out.println("this browser is unknown...");
                break;
        }
    }
}
