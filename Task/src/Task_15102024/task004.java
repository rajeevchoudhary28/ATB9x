package Task_15102024;

public class task004 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + a++ + a++);
        System.out.println(a);      // 13
        // line | exp | a
        // 6    |      | 10
        // 8    |11 + 11 + 12| 13
    }
}
