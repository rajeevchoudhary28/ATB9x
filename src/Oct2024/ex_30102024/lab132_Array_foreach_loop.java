package Oct2024.ex_30102024;

public class lab132_Array_foreach_loop {
    public static void main(String[] args) {
        // enhanced for loop (for each loop)

        int[] a = new int[3];
        a[0] = 20;
        a[1] = 30;
        a[2] = 40;

        for (int i = 0; i < a.length; i++ ){
            System.out.println(a[i]);
        }
        //  enhanced for loop (for each loop)
        for (int i : a){
            System.out.println(i);
        }
        // enhanced for loop (for each loop)
        String[] names = {"ram", "sham", "pam", "jam"};
        for (String name : names){
            System.out.println(name);
        }

    }
}
