package Nov2024.ex_15112024_Wrapper_Exceptions;

public class lab177 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        s1.trim();
        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // jvm - compile -> jvm knows at the Runtime -> Terminated the program.
    }
}
