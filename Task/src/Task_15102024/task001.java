package Task_15102024;

public class task001 {

    // find maximum of two numbers using ternary operator

    public static void main(String[] args) {

        // syntax String c = a > b ? "a is greater than b" : "b is greater than a";
        // syntax int c = a > b ? a : b;

        int a = 30;
        int b = 20;
        int x = 50;
        int c = a > b  ? a : b;

        // System.out.println(c);

        String p = a > b ? "a" : "b";
        System.out.println(p);

        String e = (x > c) ? "x is greater" : "c is greater";
        System.out.println(e);


    }
}
