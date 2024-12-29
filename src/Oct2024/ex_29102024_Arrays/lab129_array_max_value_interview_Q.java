package Oct2024.ex_29102024_Arrays;

public class lab129_array_max_value_interview_Q {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 99, 88, 77, 66, 10};
        int max_value = give_max(array);
        System.out.printf("the max value is: %d", max_value);
        System.out.println();
        int min_value = give_min(array);
        System.out.printf("the min value is: %d", min_value);

    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    static int give_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }

        return max;
    }


}
