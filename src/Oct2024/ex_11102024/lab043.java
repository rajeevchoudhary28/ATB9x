package Oct2024.ex_11102024;

public class lab043 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String name1 = "Rajeev";
        String name2 = "Choudhary";

        System.out.println(name1 + name2 + a + b);
        // it will act as concatenation when first is string

        System.out.println(a + b + name1 + name2);
        // first it act as addition than concatenation

        System.out.println(name1 + name2 + (a + b));
        // use () to resolve - BODMAS
    }
}
