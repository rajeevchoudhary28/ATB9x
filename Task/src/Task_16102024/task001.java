package Task_16102024;

public class task001 {
    public static void main(String[] args) {

        //finding largest of three numbers a,b,c using ternary operator
        // condition ? value_if_true : value_if_false

        int a = 10;
        int b = 20;
        int c = 30;

        // rough logic
        // a >=b && a >=c -> a : b >= c -> b : c

        int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("the largest is - " + result);
    }
}

