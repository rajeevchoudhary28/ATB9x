package Nov2024.ex_12112024_Super_keyword;

public class lab160_Interface_P1 {
}

abstract class ABC {
    public ABC() {
        System.out.println("DC");
    }

    abstract void a1();

    void a2(){
        System.out.println("complete method");
    }
}

interface I{

    void m1();
    void m2();

    //void m3(){
        // cant have complete function or method
    //}

    // possible with default keyword

    default void m3(){
        System.out.println("possible with default in interface");
    }

    static void m4(){
        System.out.println("static method in interface");
    }
}