package Nov2024.ex_06112024_OOPs_constructor;

import java.util.Scanner;

public class lab143_Constructor_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car2 t1 = new car2("tesla", 2010);
        System.out.println(t1.model);
        System.out.println(t1.year);
        t1.display();


        car2 t2 = new car2("tata", 2000);
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();


        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year");
        int year_name_input = sc.nextInt();
        car2 t3 = new car2(model_name_input, year_name_input);

        System.out.println(t3.year);
        System.out.println(t3.model);

    }
}

class car2{
    String model;
    int year;

    //Parametrised constructor
    car2(String model_name, int year_name){
        System.out.println("PC");
        this.model = model_name;
        this.year = year_name;
    }
    void display(){
        System.out.println("Car Details -> " + this.model + " - " + this.year);
    }
}
