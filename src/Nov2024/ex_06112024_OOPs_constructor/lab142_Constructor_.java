package Nov2024.ex_06112024_OOPs_constructor;

public class lab142_Constructor_ {
    public static void main(String[] args) {
        Car tesla =  new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);

    }

}
