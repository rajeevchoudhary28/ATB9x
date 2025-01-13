package Nov2024.ex_14112024_ststic_wrapper_exception;

public class lab163_Static {
    public static void main(String[] args) {

        Student s1 = new Student(22); // non static variables can only access by creating object
        Student s2 = new Student(33);


        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
        System.out.println(s2.school_name);
        System.out.println(s1.school_name);
    }
}

class Student {
    int age; // Non static variable // Instance variable
    static String school_name = "ABC";
    public Student(int age) {
        this.age = age;
    }



    {
        System.out.println("IIB");
        System.out.println("Here you can write a code when object is created it will execute");
        System.out.println("Read my SQL DB");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded once, when class is loaded");
    }
}
