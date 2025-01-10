package Nov2024.ex_08112024_Polymorphism.method_overriding;

public class lab151 {
    public static void main(String[] args) {
        father f = new father();
        f.home();

        // dynamic dispatch
        father f1 = new parmod();       // used in web drive
        // WebDriver driver = new ChromeDriver();
        f1.home();
    }
}

class father{
    void home(){
        System.out.println("2BHK");
    }
}

class parmod extends father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}

