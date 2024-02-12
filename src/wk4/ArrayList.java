package wk4;

import java.util.*;

public class ArrayList<E> implements List<E> {
    private Object[] data;

    public ArrayList() {
        data = new Object[0];
    }

    @Override
    public boolean add(E element) {
        Object[] biggerGuy = new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            biggerGuy[i] = data[i];
        }
        biggerGuy[data.length] = element;
        data = biggerGuy;
        return true;
    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Stupid index:" + index + " size: " + size());
        }
        Object[] biggerGuy = new Object[data.length + 1];
        for (int i = 0; i < index; i++) {
            biggerGuy[i] = data[i];
        }
        biggerGuy[index] = element;
        for (int i = index; i < data.length; i++) {
            biggerGuy[i + 1] = data[i];
        }
        data = biggerGuy;
    }

    @Override
    public void clear() {
        data = new Object[0];
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target) >= 0;
    }

    @Override
    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public int indexOf(Object target) {
        int foundAt = -1;
        for (int i = 0; foundAt == -1 && i < data.length; i++) {
            if (Objects.equals(target, data[i])) {
                foundAt = i;
            }
        }
        return foundAt;
    }

    @Override
    public boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Stupid index:" + index + " size: " + size());
        }
        Object[] smallerGuy = new Object[data.length - 1];
        for (int i = 0; i < index; i++) {
            smallerGuy[i] = data[i];
        }
        for (int i = index; i < smallerGuy.length; i++) {
            smallerGuy[i] = data[i + 1];
        }
        E elementWeRemoved = (E) data[index];
        data = smallerGuy;
        return elementWeRemoved;
    }

    @Override
    public boolean remove(Object target) {
        int index = indexOf(target);
        if (index >= 0) {
            remove(index);
        }
        return index >= 0;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Stupid index:" + index + " size: " + size());
        }
        E soonToBeReturned = (E) data[index];
        data[index] = element;
        return soonToBeReturned;
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, data.length);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Too lazy");
    }
}
