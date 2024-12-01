package Task_15102024;

public class task004 {
    public static void main(String[] args) {

        // largest of three using ternary operator

        int a = 100;
        int b = 20;
        int c = 95;

        int d = a > b ? a : (b > c) ? b : c;

        System.out.println(d);

    }
}
