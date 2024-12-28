package Oct2024.ex_28102024;

public class lab123_String_functions {
    public static void main(String[] args){
        String anotherPalindrome = "abcdcba";
        String roar = anotherPalindrome.substring(3, 5);
        System.out.println(roar);

        // substring - many interview questions
        String s1 = "Parmode";
        String s2 = s1.concat(" Dutta");
        System.out.println(s2);

        // separating on the basis of delimiter
        String fruits = "apple,banana,mango";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-IJK";
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4 = "Rajeev";
        System.out.println(s4.charAt(0));
        // System.out.println(s4.charAt(20));  // Out of range error

        String s5 = "  Rajeev";
        System.out.println(s5.trim()); // used to remove the spaces from front and back

        String s6 = "Rajeev";
        System.out.println(s6.indexOf("a"));  // indexOf gives the index
        System.out.println(s6.indexOf("e"));

        String s7 = "Rajeev";
        System.out.println(s7.contains("je"));
        System.out.println(s7.contains("ra"));

        String s8 = "Rajeev choudhary";
        System.out.println(s8.lastIndexOf("a"));

        String s9 = "rajeev choudhary";
        System.out.println(s9.replace("a", "i"));

        String original = "banana";
        String original1 = original.replace("a", "o");
        System.out.println(original1);

        String original2 = "Hello123 World456!";
        String original3 = original2.replaceAll("\\d+", "");
        System.out.println(original3);

        



    }
}
