package wk7;

public class CircularQueue<E> implements PureQueue<E> {
    private static final int DEFAULT_CAPACITY = 7;
    private E[] buffer;
    private int front;
    private int back;
    private boolean isEmpty;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        buffer = (E[]) new Object[capacity];
        front = 0;
        back = 0;
        isEmpty = true;
    }

    @Override
    public boolean offer(E element) {
        boolean changed = false;
        // make sure not full
        if (isEmpty || front != back) {
            changed = true;
            buffer[back] = element;
            back = (back + 1) % buffer.length;
            isEmpty = false;
        }
        return changed;
    }

    @Override
    public E poll() {
        E returnValue = null;
        if (!isEmpty) {
            returnValue = buffer[front];
            buffer[front] = null;
            front = (front + 1) % buffer.length;
            isEmpty = front == back;
        }
        return returnValue;
    }

    @Override
    public E peek() {
        return isEmpty ? null : buffer[front];
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }
}
