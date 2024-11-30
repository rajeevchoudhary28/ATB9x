package Oct2024.ex_14102024;

public class lab057_typecasting {
    public static void main(String[] args) {
        // Typecasting
        // widening - Implicit, explicit - lossless
        // narrowing - Implicit, explicit (with data type), loss

        // widening - converting small to - large
        byte b = 10;
        int i = b;  // valid -> implicit casting - JVM does it

        int a1 = (int)b;  // valid -> explicit casting - JVM

        // narrowing - converting - large data type - small
        int val = 200;
        // byte b2 =val; // invalid implicit
        byte b3 = (byte)val; //invalid - explicit - user

    }
}
