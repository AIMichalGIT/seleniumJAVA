package JavaKurs.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFILE.txt");
        Scanner myReader = new Scanner(file);
        while(myReader.hasNext()) {
            String line = myReader.nextLine();
            System.out.println(line);
        }
        myReader.close();
    }
}
