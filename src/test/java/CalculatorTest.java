import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int dodawanie = calculator.add(firstNumber, secondNumber);
        int odejmowanie = calculator.sub(firstNumber, secondNumber);
        int mnozenie = calculator.mult(firstNumber, secondNumber);
        int dzielenie = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Dodawanie: " + dodawanie);
        System.out.println("Odejmowanie: " + odejmowanie);
        System.out.println("Mnozenie: " + mnozenie);
        System.out.println("Dzielenie: " + dzielenie);
        System.out.println("Modulo: " + mod);

    }
}
