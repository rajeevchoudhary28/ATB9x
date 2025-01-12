package Nov2024.ex_12112024_Super_keyword;

public class tesla extends Engine{
    @Override
    void startEngine() {
        System.out.println("Starting the electric motor");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the electric motor");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
