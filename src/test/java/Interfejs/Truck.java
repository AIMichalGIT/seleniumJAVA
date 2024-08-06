package Interfejs;

public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jadee z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka!");
    }
}
