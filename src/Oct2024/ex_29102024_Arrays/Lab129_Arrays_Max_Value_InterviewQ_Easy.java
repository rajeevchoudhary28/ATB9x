package Oct2024.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab129_Arrays_Max_Value_InterviewQ_Easy {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 99, 88, 77, 66, 10};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
