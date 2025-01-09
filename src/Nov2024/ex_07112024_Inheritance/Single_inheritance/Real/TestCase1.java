package Nov2024.ex_07112024_Inheritance.Single_inheritance.Real;

public class TestCase1 extends Common_BaseTest {
    public TestCase1(){
        System.out.println("DC - Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }

}

