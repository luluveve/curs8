package songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class OrderArtist {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("titles.txt"));
            String line;
            HashSet<Song> songs = new HashSet<>();

            while ((line = file.readLine()) != null) {
                String [] parts = line.split("/");
                Song song = new Song(parts[0], parts[1]);
                songs.add(song);
            }
            System.out.println(songs.size());
            System.out.println(songs);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

