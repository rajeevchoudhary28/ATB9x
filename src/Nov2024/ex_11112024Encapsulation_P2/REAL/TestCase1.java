package Nov2024.ex_11112024Encapsulation_P2.REAL;

public class TestCase1 extends BaseClass{

    public  TestCase1() {
        super();        // parent constructor - Super - Means Parent
        // .this means current object
        System.out.println("DC - TC1");
    }

    public void startTestCase(){
        open_browser("chrome");
        close_browser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("own logic");

        super.setBrowser(browser, isAuth); // calling the parent set browser
        // super is BaseClass
    }
}
