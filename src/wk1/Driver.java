package wk1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Path path = Path.of("data/delaysByAirline.txt");
        try (Scanner in = new Scanner(path)) {
            in.nextLine();
            in.nextLine();
            int numCancelled = in.nextInt();
            String temp = in.next();
            int percentCancelled = Integer.parseInt(temp.substring(0, temp.length()-1));
            int numDelayed = in.nextInt();
            temp = in.next();
            int percentDelayed = Integer.parseInt(temp.substring(0, temp.length()-1));
            String airline = in.nextLine();
            System.out.println(numCancelled + " flights cancelled on " + airline);
        } catch (IOException e) {
            System.out.println("Error reading the file. Terminating...");
        }
    }
}
