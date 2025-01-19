package Nov2024.ex_15112024_Wrapper_Exceptions;

public class lab172_wrapper {
    public static void main(String[] args) {

        // primitive to wrapper

        int a = 10;
        Integer b = a; // Boxing a -> integer
        System.out.println(Integer.MIN_VALUE);      // Attributes
        System.out.println(Integer.MAX_VALUE);      // Behaviour
        b.intValue();

        Integer a2 = 40;
        int a3 = a2;        // unboxing Integer to int
        System.out.println(a3);

    }
}
