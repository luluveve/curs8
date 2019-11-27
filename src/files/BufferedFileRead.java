package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileRead {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/files/FileRead.java"));
            String line;
            while((line= file.readLine()) != null) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
