package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
