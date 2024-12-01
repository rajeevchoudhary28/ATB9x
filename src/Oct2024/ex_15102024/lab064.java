package Oct2024.ex_15102024;

public class lab064 {
    public static void main(String[] args) {

        // pre increment -- increment first than print
        int a_pre = 10;
        System.out.println(++a_pre);    // first increment than print
        System.out.println(a_pre);      // it will take new value

        // post increment  -- print first than increment
        int a_post = 10;
        System.out.println(a_post++);       // first print than increment
        System.out.println(a_post);         // it will print the incremented value


    }
}
