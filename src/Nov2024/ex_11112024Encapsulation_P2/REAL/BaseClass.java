package Nov2024.ex_11112024Encapsulation_P2.REAL;

public class BaseClass {

    private String browser;


    // constructor
    public BaseClass() {
        System.out.println("DC - Base Class");
    }

    // Parametrised constructor
    public BaseClass(String b) {
        System.out.println("CC - Base Class");
    }

    // getter and setter to access the private variable
    public String getBrowser() {
        return browser;
    }
    // set browser to make it more secure, giving auth
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }
        else {
            System.out.println("not allowed");
        }
    }
    // open browser function
    void  open_browser(){
        System.out.println("opening browser");
    }
    // (polymorphism) method overloading same name different argument
    void open_browser(String browser_name){
        System.out.println("Open browser ->" + browser_name);
    }
    // close browser function
    void close_browser(){
        System.out.println("closing browser");
    }


}
