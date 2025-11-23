package Nov2024.ex_19112024_Generics;

public class lab196_generics {
    public static void main(String[] args) {

        temp_sum(34, 35);
        temp_sum("Rajeev", "Choudhary");
        temp_sum(true, false);
        // parmod -> any data type

    }

    public static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
