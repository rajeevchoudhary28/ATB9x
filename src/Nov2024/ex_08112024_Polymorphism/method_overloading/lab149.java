package Nov2024.ex_08112024_Polymorphism.method_overloading;

public class lab149 {
    public static void main(String[] args) {
        Math_Operation mathOperation = new Math_Operation();
        int result = mathOperation.add(7, 2);
        System.out.println(result);
    }
}

class Math_Operation {
    // Method overloading
    // Method will be Overloaded
    // Same name but different argument or parameter

    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
       return a+b;
   }
   void add(int a, int b, int c){
       System.out.println("hello");
   }
   double add(double a, double b){
        return a + b;
   }
   double add(double a, double b, double c){
        return a + b + c;
   }
}

