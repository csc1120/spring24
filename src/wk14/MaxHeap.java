package wk14;

import java.util.ArrayList;
import java.util.Collections;

public class MaxHeap {
    private ArrayList<Integer> values;
    public MaxHeap() {
        values = new ArrayList<>();
    }

    private int parent(int index) {
        return (index - 1) /2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return left(index) + 1;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public int size() {
        return values.size();
    }

    public void add(int value) {
        values.add(value);
        int index = size() - 1;
        while (index > 0 && value > values.get(parent(index))) {
            Collections.swap(values, index, parent(index));
            index = parent(index);
        }
    }

    public int extractMax() {
        return 0;
    }

    public int getMax() {
        return values.getFirst();
    }
}