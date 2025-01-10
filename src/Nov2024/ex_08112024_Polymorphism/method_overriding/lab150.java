package Nov2024.ex_08112024_Polymorphism.method_overriding;

public class lab150 {
    public static void main(String[] args) {
        hound h1 = new hound();
        h1.bark();      // method overriding in runtime

    }
}
class dog{
    void bark(){
        System.out.println("Dogs bark");
    }
    int age = 10;
}
class hound extends dog{
    // hound is type of dog
    @Override
    void bark(){
        System.out.println("Hound is barking");
    }
}
