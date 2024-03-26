package wk11;

import java.util.*;

public class HashTable<E> implements Set<E> {
    private int size;
    private List<E>[] table;
    public static final int DEFAULT_CAPACITY = 30;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        size = 0;
        table = new List[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object target) {
        int index = Math.abs(target.hashCode()) % table.length;
        List<E> bucket = table[index];
        return bucket != null && bucket.contains(target);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E element) {
        int index = Math.abs(element.hashCode()) % table.length;
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        boolean added = !table[index].contains(element);
        if (added) {
            table[index].add(element);
        }
        return added;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
