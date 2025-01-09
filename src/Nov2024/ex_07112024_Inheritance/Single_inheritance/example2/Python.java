package Nov2024.ex_07112024_Inheritance.Single_inheritance.example2;

public class Python extends Programming{

    // extends - is A (relationship)
    // python is a programming

    void print(){
        System.out.println(author);
        System.out.println(version);
    }
    Python(){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();       // the moment you create an object the default constructor is called of both parent and child
                                        // concept - constructor chaining
        //System.out.println(p1.author);
    }
}
