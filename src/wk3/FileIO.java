package wk3;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String filename = "data/delaysByAirline.txt";
        List<Entry> entries = new ArrayList<>();
        try (Scanner in = new Scanner(Files.newInputStream(Path.of(filename)))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (line.length() > 0 && '#' != line.charAt(0)) {
                    entries.add(new Entry(line));
                }
            }
            entries.forEach(e -> System.out.println(e.airline));
        }
    }
}
