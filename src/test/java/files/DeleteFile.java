package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("testFILE.txt");
        if(file.delete()) {
            System.out.println("Usuniety plik");
        } else {
            System.out.println("Nie udalo sie usunac pliku");
        }
    }
}
