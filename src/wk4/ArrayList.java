package wk4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
    public void add(int index, E element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return null;
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
