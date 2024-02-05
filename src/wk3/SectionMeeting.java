package wk3;

import java.util.List;

public class SectionMeeting {
    private String courseCode;
    private String sectionNumber;
    private String title;
    private boolean[] daysOfWeek;
    private int startTime;
    private int endTime;
    public static final List<String> DAYS = List.of("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday");

    public SectionMeeting(String line) {
        String[] fields = line.split(",");
        final int sectionNumberIndexStart = 10;
        final int daysOfWeekStartIndex = 2;
        final int startTimeIndex = daysOfWeekStartIndex + 5;
        final int endTimeIndex = startTimeIndex + 1;
        courseCode = fields[0].substring(0, sectionNumberIndexStart);
        sectionNumber = fields[0].substring(sectionNumberIndexStart).trim();
        title = fields[1];
        daysOfWeek = new boolean[5];
        for (int i = 0; i < 5; i++) {
            daysOfWeek[i] = !fields[i + daysOfWeekStartIndex].isEmpty();
        }
        String start = fields[startTimeIndex];
        startTime = Integer.parseInt(start.substring(0, start.indexOf(":")));
        String end = fields[endTimeIndex];
        endTime = Integer.parseInt(end.substring(0, end.indexOf(":"))) + 1;
    }

    public boolean meetsAt(String day, int hour) {
        return (startTime <= hour && hour < endTime) && daysOfWeek[DAYS.indexOf(day)];
    }

    public boolean meetsOn(String day) {
        return daysOfWeek[DAYS.indexOf(day)];
    }

    public String getSectionDescription() {
        return courseCode + "/" + sectionNumber + ", " + title;
    }
}
