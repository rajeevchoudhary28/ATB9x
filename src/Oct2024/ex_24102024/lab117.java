package Oct2024.ex_24102024;

import java.util.Scanner;

public class lab117 {
    public static void main(String[] args) {
        // create a function of sub, sum, mul & div
        //with parameters a, b, (take the parameters from the users)
        // 3 -> user input
        // 4 -> user input
        // sum(3,4)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        int result_add = sum_of_numbers(a, b);
        System.out.println("result is ->" + result_add);

        int result_sub = sub_of_numbers(a, b);
        System.out.println("result is -> " + result_sub);

        int result_mul = mul_of_numbers(a, b);
        System.out.println("result is -> " + result_mul);

        int result_div = div_of_numbers(a, b);
        System.out.println("result is -> " + result_div);

        int result_mod = mod_of_numbers(a, b);
        System.out.println("result is -> " + result_mod);


        sc.close();
    }

    private static int mod_of_numbers(int a, int b) {
        return  a % b;
    }

    private static int div_of_numbers(int a, int b) {
        return a / b;
    }

    private static int mul_of_numbers(int a, int b) {
        return a * b;
    }

    private static int sub_of_numbers(int a, int b) {
        return a - b;
    }

    static int sum_of_numbers(int a, int b) {
        return a + b;
    }
}
