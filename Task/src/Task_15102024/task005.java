package Task_15102024;

public class task005 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // line | exp | a
        // 6    |      | 10
        // 8    |9 + 9 + 10| 28
        //9     | 9          |
    }
}
