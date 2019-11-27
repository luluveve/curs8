package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream("FileRead.Java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
