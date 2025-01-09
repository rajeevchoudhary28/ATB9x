package Nov2024.ex_07112024_Inheritance.Single_inheritance.example1;

public class lab145 {
    public static void main(String[] args) {
        // single inheritance
        // son will get attributes from father
        // 1 son 1 father

        son s1 = new son();         // creating s1 as new son
        System.out.println(s1.gold_f);      // accessing gold with son object
        s1.bhk3();      // accessing own behaviour
        s1.bhk2();      // accessing parent behaviour


        father f1 = new father();
        // f1.bhk3();       father has not extended
    }
}
