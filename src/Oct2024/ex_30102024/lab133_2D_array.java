package Oct2024.ex_30102024;

import java.util.Arrays;

public class lab133_2D_array {
    public static void main(String[] args) {
        // 2D array
        int[][] array_2D = new int[3][3];

        array_2D[0][0] = 90;
        array_2D[0][1] = 91;
        array_2D[0][2] = 92;

        array_2D[1][0] = 1;
        array_2D[1][1] = 2;
        array_2D[1][2] = 3;

        array_2D[2][0] = 4;
        array_2D[2][1] = 5;
        array_2D[2][2] = 6;

        for (int[] d2:array_2D){
            System.out.println(Arrays.toString(d2));
        }
    }
}
