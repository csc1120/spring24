package wk3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String filename = "data/delaysByAirline.txt";
        try (Stream<String> stream = Files.lines(Path.of(filename))) {
            stream.filter(line -> line.charAt(0) != '#')
                    .map(line -> new Entry(line))
                    .map(entry -> entry.airline)
                    .forEach(System.out::println);
        }
    }
}
