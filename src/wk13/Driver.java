package wk13;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sam Schoenfeld",
                new Address("111 Main Place", "Fieldstone", 52230)));
        students.add(new Student("Jack Dorner",
                new Address("101 Main Place", "Stonefield", 52203)));
        System.out.println(students);

        List<Student> students2 = new ArrayList<>(students.size());
        for (Student student : students) {
            students2.add(new Student(student));
            System.out.print("");
        }
    }
}
