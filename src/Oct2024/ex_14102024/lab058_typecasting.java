package Oct2024.ex_14102024;

public class lab058_typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210L;

        // short s = phone_no;
        short s = (short) phone_no;  // explicit - user - loss of data

        System.out.println(s);
    }
}
