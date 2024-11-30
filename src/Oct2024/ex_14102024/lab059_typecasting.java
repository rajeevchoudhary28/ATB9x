package Oct2024.ex_14102024;

public class lab059_typecasting {
    public static void main(String[] args) {
        // gst - 18.45

        int course = 100;
        float gst = 18.45f;
        int total_price  = course + (int)gst;   // narrowing
        System.out.println(total_price);
    }
}
