package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {
    public int getNumberOfMales(String path) {
        int count = 0;
        try {
            BufferedReader reader = Files.newBufferedReader(Path.of(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(",Male,")) {
                    count += 1;
                }
            }
            return count;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }
}
