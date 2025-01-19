package Nov2024.ex_15112024_Wrapper_Exceptions;

public class lab179 {
    public static void main(String[] args) {

        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println("Exception happened");
        }
        System.out.println(b);
    }
}
