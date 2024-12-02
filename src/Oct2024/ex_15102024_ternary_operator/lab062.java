package Oct2024.ex_15102024_ternary_operator;

public class lab062 {
    public static void main(String[] args) {


        // ternary operator comparing more than two values
        // result = condition1 ? expression1 : condition2 ? expression2 : condition3 ? expression3 : expression4;
        int score = 69;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println(grade);
    }
}
