package wk6;

import java.util.*;

public class LinkedList<E> implements List<E> {
    private Node<E> head;

    private static final class Node<E> {
        E value;
        Node<E> next;

        private Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        private Node(E value) {
            this(value, null);
        }
    }

    @Override
    public void add(int index, E element) {
        // TODO
    }

    public boolean add(E element) {
        Node<E> newGal = new Node<>(element);
        if (isEmpty()) {
            head = newGal;
        } else {
            Node<E> walker = head;
            while (walker.next != null) {
                walker = walker.next;
            }
            walker.next = newGal;
        }
        return true;
    }

    @Override
    public boolean contains(Object target) {
        return contains(target, head);
    }

    private static boolean contains(Object target, Node node) {
        boolean found = false;
        if (node != null) {
            if (Objects.equals(node.value, target)) {
                found = true;
            } else {
                found = contains(target, node.next);
            }
        }
        return found;
    }

    public void clear() {
        head = null;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " size: " + size());
        }
        return get(index, head);
    }

    private E get(int index, Node<E> node) {
        return index == 0 ? node.value : get(index - 1, node.next);
//        E returnValue = node.value;
//        if (index > 0) {
//            returnValue = get(index - 1, node.next);
//        }
//        return returnValue;
    }

    @Override
    public int indexOf(Object o) {
        // TODO
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public E set(int index, E element) {
        // TODO
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // TODO
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        E removedElement;
        if (0 == index) {
            removedElement = head.value;
            head = head.next;
        } else {
            Node<E> walker = head;
            for (int i = 0; i < index - 1; i++) {
                walker = walker.next;
            }
            removedElement = walker.next.value;
            walker.next = walker.next.next;
        }
        return removedElement;
    }

    public int size() {
        int size = 0;
        Node<E> walker = head;
        while (walker != null) {
            walker = walker.next;
            size++;
        }
        return size;
    }

    @Override
    public Object[] toArray() {
        // TODO
        return new Object[0];
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