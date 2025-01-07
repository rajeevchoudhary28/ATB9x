package Nov2024.ex_06112024_OOPs_constructor;

public class Car {

    String model;
    int year;
    String name;

    // Default Constructor -- used to initialize the value
    Car(){
        name = "Unknown";
        year = 1990;
        model = "XYZ";
        System.out.println("DC is tested...");
    }
}
