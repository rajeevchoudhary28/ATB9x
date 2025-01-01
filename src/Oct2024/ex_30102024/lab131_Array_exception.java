package Oct2024.ex_30102024;

public class lab131_Array_exception {
    public static void main(String[] args) {

        //int[] a1 = new int[-1];  // ---negative index not allowed
        //System.out.println(a1);  // NegativeArraySizeException

        int[] a2 = new int[5];
        System.out.println(a2[10]);  // ArrayIndexOutOfBoundsException  ---- out og range index not allowed
    }
}
