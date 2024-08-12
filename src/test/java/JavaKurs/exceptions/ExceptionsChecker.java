package JavaKurs.exceptions;

import java.util.Scanner;

public class ExceptionsChecker {

    //pobierz wiek od usera, jesli mniejszy od 0 to wyrzuc wyjatek InvalidAgeException
    //jezeli pelnoletni to wypisz info ze pelnoletni

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
                int age = scanner.nextInt();
        if(age<0) {
            throw new InvalidAgeException("Nieprawidlowy wiek");
        }
        if(age>18){
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}
