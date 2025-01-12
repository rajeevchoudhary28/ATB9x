package Nov2024.ex_12112024_Super_keyword;

public class lab159 {

    public static void main(String[] args) {
        WagonR r = new WagonR();
        r.drive();

        tesla t = new tesla();
        t.drive();
    }
}

class WagonR extends Engine {

    void drive() {
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the engine");
    }
}

abstract class Engine {
    abstract void startEngine();

    abstract void stopEngine();
}
