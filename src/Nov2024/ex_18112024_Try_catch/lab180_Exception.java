package Nov2024.ex_18112024_Try_catch;

public class lab180_Exception {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c); // java.lang.ArithmeticException
    }
}