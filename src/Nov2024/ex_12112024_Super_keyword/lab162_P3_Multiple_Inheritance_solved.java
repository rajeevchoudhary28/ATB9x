package Nov2024.ex_12112024_Super_keyword;

public class lab162_P3_Multiple_Inheritance_solved {


}

class Child1 implements Father1, Mother1 {

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void same() {
        System.out.println("1 Only Same");
    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}


interface Father1 {
    void f1();

    void f2();

    void same();


}

interface Mother1 {


    void f3();

    void f4();

    void same();

}
