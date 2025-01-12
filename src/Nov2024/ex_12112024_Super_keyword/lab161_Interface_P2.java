package Nov2024.ex_12112024_Super_keyword;

public class lab161_Interface_P2 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();

        //I i = new I();
        // multiple inheritance using interface
    }
}


class P implements I1 {

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I1 {
    void f1();

    void f2();

    void f3();
}

