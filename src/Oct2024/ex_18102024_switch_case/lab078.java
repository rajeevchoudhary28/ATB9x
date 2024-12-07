package Oct2024.ex_18102024_switch_case;

public class lab078 {
    public static void main(String[] args) {
        // JDK 13 - multiple case statements
        int item = 002;

        switch (item){
            case 001,002,005:
                System.out.println("Electronics item...");
                break;
            case 004, 007:
                System.out.println("Mechanical item...");
                break;
            default:
                System.out.println("Not match...");
                break;
        }


    }
}
