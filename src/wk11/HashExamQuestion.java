package wk11;

import java.util.Set;
import java.util.TreeSet;

public class HashExamQuestion<E extends Comparable<? super E>> {
    private Set<E>[] table;

    public HashExamQuestion() {
        table = new TreeSet[117];
    }

    public boolean contains(E target) {
        int index = Math.abs(target.hashCode() % table.length);
        boolean found = false;
        if (table[index] != null) {
            found = table[index].contains(target);
        }
        return found;
    }
}
