package Nov2024.ex_07112024_Inheritance.Multilevel;

public class lab147_multilevel {
    public static void main(String[] args) {

        child c = new child();
        c.f();
        c.extra();
        c.home();
        c.gf();

        father f1 = new father();
        f1.f();
        f1.extra();
        f1.gf();

        grandfather g = new grandfather();
        g.gf();
        g.home();
    }
}
