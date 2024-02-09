package wk4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileIO {

    public void inSearchOfNSquared(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
        String filename = "data/sections20230829.csv";
        try (Stream<String> stream = Files.lines(Path.of(filename))) {
            long count = stream.map(line -> new SectionMeeting(line))
                    .filter(m -> m.meetsAt("Monday", 16) ||
                            m.meetsAt("Tuesday", 16) ||
                            m.meetsAt("Wednesday", 16) ||
                            m.meetsAt("Thursday", 16) ||
                            m.meetsAt("Friday", 16))
                    .count();
            System.out.println(count);
        }
    }

    public static void main2(String[] args) throws IOException {
        String filename = "data/delaysByAirline.txt";
        try (Stream<String> stream = Files.lines(Path.of(filename))) {
            stream.filter(line -> line.charAt(0) != '#')
                    .map(line -> new Entry(line))
                    .map(entry -> entry.airline)
                    .forEach(System.out::println);
        }
    }
}
