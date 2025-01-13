package Nov2024.ex_14112024_ststic_wrapper_exception;

public class lab166 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        Automation t2 = new Automation();
        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}

class Automation {
    static String driver = "Chrome";


}

