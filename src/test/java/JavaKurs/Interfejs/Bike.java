package JavaKurs.Interfejs;

public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem");
    }
}
