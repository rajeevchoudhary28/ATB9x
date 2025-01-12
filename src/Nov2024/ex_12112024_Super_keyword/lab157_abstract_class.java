package Nov2024.ex_12112024_Super_keyword;

public class lab157_abstract_class {
}

class parmod extends Loan{
    @Override
    void loan50K() {
        System.out.println("giving the loan");
    }

    @Override
    void loan30K() {

    }
}

abstract class Loan{
    abstract void loan50K();        // incomplete function or method will use by other class who will inherit it
    // only definition no declaration

    abstract void loan30K();
    void loan1L(){
        System.out.println("1L loan is there");  // complete function
    }
}

// concrete class
class Person{}
class Student1{}
class Student2{}
class Student3{}
