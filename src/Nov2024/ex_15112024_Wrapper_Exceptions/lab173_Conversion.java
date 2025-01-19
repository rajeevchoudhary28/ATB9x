package Nov2024.ex_15112024_Wrapper_Exceptions;

public class lab173_Conversion {
    public static void main(String[] args) {

        String num = "10";
        // String -> wrapper(Integer) -> primitive
        Integer a = Integer.valueOf(num);
        int a2 = a; // unboxing

        // String to primitive
        int a3 = Integer.parseInt(num);

        Long l = 10l;
        Short s = 23;
        Boolean bb = true;
    }
}
