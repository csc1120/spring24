package wk3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FileIO {
    public static void main(String[] args) throws IOException {
//        Function<String, Integer> func = (s -> s.length());
//        List<String> strings = List.of("Luke", "Sam", "Jack");
//        System.out.println(strings.stream()
//                .map(func)
//                .toList());
        String filename = "data/delaysByAirline.txt";
        List<Entry> entries = new ArrayList<>();
        try (Scanner in = new Scanner(Files.newInputStream(Path.of(filename)))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (!line.isEmpty() && '#' != line.charAt(0)) {
                    entries.add(new Entry(line));
                }
            }
            entries.forEach(e -> System.out.println(e.airline));
        }
    }
}
