package Nov2024.ex_11112024Encapsulation_P2.police;

public class cop {

    private int gun;
    public String icard;

    // public parametrized constructor
    public cop(int gun){
        this.gun = gun;
    }

    // normal method
    protected void canIshoot(){
        System.out.println("Yes, you can....!");
    }
}
