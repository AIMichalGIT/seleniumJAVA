package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\48883\\Documents\\Automatyzacja kurs\\KursJavaSelenium\\src\\test\\java\\t2estplik.txt");;
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony TEST");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("Closing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
