package JavaKurs;

public class Metody {
//    public void policzWynik() {
//        System.out.println("Zaraz policzę wynik");
//        int result = 0;
//        for (int i=0; i<100; i++) {
//            result = result+i;
//        }
//        System.out.println("Rezultat to: " + result);
//    }
public void policzWynikParam(int number) {
    System.out.println("Numer ma wartość: " + number);
    System.out.println("Zaraz policzę wynik");
    int result = 0;
    for (int i=0; i < number; i++) {
        result = result + i;
    }
    System.out.println("Rezultat to: " + result);
}
}
