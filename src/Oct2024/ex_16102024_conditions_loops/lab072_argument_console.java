package Oct2024.ex_16102024_conditions_loops;

public class lab072_argument_console {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s, %s, %s", args[0], args[1], args[2]);
        System.out.println();
        int age = Integer.parseInt(args[0]);
        System.out.println(age > 25 ? "can go to goa" : "not allowed in goa");
    }
}
