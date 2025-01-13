package Nov2024.ex_14112024_ststic_wrapper_exception;

public class lab164_Static_SIB_IIB {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
        A a2; // Rule 1- Only Ref creation doesn't call the SIB
    }
}

class A {
    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

}

