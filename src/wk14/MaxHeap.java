package wk14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MaxHeap {
    private LinkedList<Integer> values;
    public MaxHeap() {
        values = new LinkedList<>();
    }

    private static int parent(int index) {
        return (index - 1) /2;
    }

    private static int left(int index) {
        return 2 * index + 1;
    }

    private static int right(int index) {
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
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        Collections.swap(values, 0, size() - 1);
        int max = values.removeLast();
        int index = 0;
        boolean doneSwapping = false;
        while (!doneSwapping && indexValid(index)) {
            if (indexValid(right(index)) && values.get(right(index)) > values.get(left(index))) {
                if (values.get(index) < values.get(right(index))) {
                    Collections.swap(values, index, right(index));
                    index = right(index);
                } else {
                    doneSwapping = true;
                }
            } else if (indexValid(left(index)) && values.get(index) < values.get(left(index))) {
                Collections.swap(values, index, left(index));
                index = left(index);
            } else {
                doneSwapping = true;
            }
        }
        return max;
    }

    private boolean indexValid(int index) {
        return index < size();
    }

    public int getMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return values.getFirst();
    }
}