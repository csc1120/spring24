package wk7;

public interface PureStack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
}
