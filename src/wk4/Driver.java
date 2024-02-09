package wk4;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("sam");
        words.add("pressure");
        words.add("coffee");
        words.add("sore");
        System.out.println(words.get(2));
    }
}
