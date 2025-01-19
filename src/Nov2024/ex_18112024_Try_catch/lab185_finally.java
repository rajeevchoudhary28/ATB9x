package Nov2024.ex_18112024_Try_catch;

import java.util.Scanner;

public class lab185_finally {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
            System.out.println("closing sc");

        }

    }
}

