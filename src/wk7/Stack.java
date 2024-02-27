package wk7;

import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> implements PureStack<E> {
    private List<E> worker;

    public Stack(List<E> datastructure) {
        worker = datastructure;
    }

    @Override
    public void push(E element) {
        worker.add(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return worker.removeLast();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return worker.getLast();
    }

    @Override
    public boolean isEmpty() {
        return worker.isEmpty();
    }
}
