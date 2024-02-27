package wk7;

import java.util.LinkedList;

public class Queue<E> implements PureQueue<E> {
    private LinkedList<E> worker;

    public Queue() {
        worker = new LinkedList<>();
    }

    @Override
    public boolean offer(E element) {
        return worker.add(element);
    }

    @Override
    public E poll() {
        return isEmpty() ? null : worker.removeFirst();
    }

    @Override
    public E peek() {
        return isEmpty() ? null : worker.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return worker.isEmpty();
    }
}
