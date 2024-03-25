package wk11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Driver {
    public static void main(String[] args) {
        final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        Map<String, Integer> daysOfWeek = new TreeMap<>();
        daysOfWeek.put("Sunday", 0);
        daysOfWeek.put("Monday", 1);
        daysOfWeek.put("Tuesday", 2);
        daysOfWeek.put("Wednesday", 3);
        daysOfWeek.put("Thursday", 4);
        daysOfWeek.put("Friday", 5);
        daysOfWeek.put("Saturday", 6);
        System.out.println("Enter your favorite day");
        Scanner in = new Scanner(System.in);
        String favoriteDayOfWeek = in.next();
        int favoriteDay = daysOfWeek.get(favoriteDayOfWeek);
        String day = days[(favoriteDay + 2) % days.length];
        System.out.println("Two days after your favorite day is: " + day);
    }
}
