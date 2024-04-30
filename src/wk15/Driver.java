package wk15;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Driver {
    public static void main(String[] args) {
        List<String> animals = List.of("sheep", "dog", "chicken", "turkey", "cow", "horse",
                "pig", "bull");
        Consumer<String> enlouded = animal -> {
            System.out.println(animal + " says " + animalToSound.get(animal));
            WavPlayer.play("data/" + animalToSound.get(animal) + ".wav");
        };
        animals.forEach(enlouded);

    }










    private static Map<String, String> animalToSound = Map.of("sheep", "baa",
            "dog", "bark", "chicken", "cluck", "turkey", "gobble",
            "cow", "moo", "bull", "moo", "horse", "neigh", "pig", "oink");
}
