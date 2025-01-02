package Nov2024.ex_05112024;

public class Lab139_OOPs {
    public static void main(String[] args) {
        StudenATB S1 = new StudenATB();
        S1.name = "Rajeev"; // Attribute
        S1.eat(10); // Behaviour
        System.out.println(S1);  // shows you the address of memory

        // ```
        //1. StudentsATB - Class Loading
        //2. s1 - Object Ref.
        //3. new StudentsATB() -> Object creation
        //```

        StudenATB S2 = new StudenATB();
        S2.name = "Sanjeev";  // Attribute
        S1.eat(20); // Behaviour

        Person p1;

    }
}
