package Nov2024.ex_12112024_Super_keyword;

public class lab155_Super {
    public static void main(String[] args) {
        car c = new car();
    }
}
class car extends vehicle{
    private int max_speed = 281;

    @Override
    void display() {
        System.out.println("Child");
    }
    car(){
        super(10);  // will call parametrised constructor
        System.out.println("DC car");
        System.out.println(this.max_speed);  // child max speed
        System.out.println(super.max_speed);  // parent max speed
    }
}

class vehicle{
    public int max_speed = 180;

    void display(){
        System.out.println("Parent");
    }
    // default constructor
    vehicle(){
        System.out.println("DC vehicle");
    }
    // parametrised constructor
    vehicle(int a){
        System.out.println("PC vehicle");
    }
    void message(){
        System.out.println("Hello vehicle");
    }// method overloading
    void message(int a){
        System.out.println("Hello vehicle");
    }
}
