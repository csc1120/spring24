package wk3;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String filename = "data/delaysByAirline.txt";
        try (DataInputStream in = new DataInputStream(Files.newInputStream(Path.of(filename)))) {
            for (int i = 0; i < 50; i++) {
                System.out.println(in.readDouble());
            }
        }
    }
}
