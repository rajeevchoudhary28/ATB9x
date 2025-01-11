package Nov2024.ex_11112024Encapsulation_P2;

import Nov2024.ex_11112024Encapsulation_P2.REAL.TestCase1;

public class lab154_Ecap_AM {

    // public, private, protected, default
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1();    // dynamic dispatch
        tc1.setBrowser("chrome", true);
        tc1.startTestCase();
    }
}
