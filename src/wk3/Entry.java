package wk3;

import java.util.Scanner;

public final class Entry {
    public final int numCanceled;
    public final double percentCanceled;
    public final int numDelayed;
    public final double percentDelayed;
    public final String airline;

    public Entry(String line) {
        Scanner in = new Scanner(line);
        numCanceled = in.nextInt();
        percentCanceled = parsePercent(in.next());
        numDelayed = in.nextInt();
        percentDelayed = parsePercent(in.next());
        airline = in.nextLine().substring(1);
    }

    private static int parsePercent(String value) {
        return Integer.parseInt(value.substring(0, value.length() - 1));
    }
}
