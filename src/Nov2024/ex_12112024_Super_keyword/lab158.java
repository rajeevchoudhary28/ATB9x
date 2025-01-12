package Nov2024.ex_12112024_Super_keyword;

public class lab158 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50K();
        c.loan30K();
    }
}

class Child extends Father {


    @Override
    void loan50K() {
        System.out.println("child is giving 50K loan!!");
    }
}

abstract class Father {
    abstract void loan50K();

    void loan30K() {
        System.out.println("Done by father !!");
    }
}
