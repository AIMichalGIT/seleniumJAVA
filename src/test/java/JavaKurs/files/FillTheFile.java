package JavaKurs.files;

import java.io.FileWriter;
import java.io.IOException;

public class FillTheFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("testFILE.txt");
        writer.write("some text");
        writer.close();
    }
}
