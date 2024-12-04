package Oct2024.ex_18102024;

public class lab079 {
    public static void main(String[] args) {

        // JDK 13 - can use arrow " -> "
        // no need to use break it will automatically take break in build
        int item = 002;

        switch (item){
         case 001 -> System.out.println("001");
         case 002 -> System.out.println("002");
         case 003 -> System.out.println("003");
         default -> System.out.println("None");
        }
    }
}
