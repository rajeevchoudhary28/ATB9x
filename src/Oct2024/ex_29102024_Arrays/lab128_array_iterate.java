package Oct2024.ex_29102024_Arrays;

import java.util.Arrays;

public class lab128_array_iterate {
    public static void main(String[] args) {
        int[] marks = {51,77,99,77,50};
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------------");

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks, 99); // binary search is used in sorted array otherwise it will give random value
        System.out.println(item_index);

    }
}
