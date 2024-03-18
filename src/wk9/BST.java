package wk9;

public class BST<E extends Comparable> {
    private Node<E> root;

    private final static class Node<E> {
        E value;
        Node<E> leftKid;
        Node<E> rightKid;

        Node(E value, Node<E> leftKid, Node<E> rightKid) {
            this.value = value;
            this.leftKid = leftKid;
            this.rightKid = rightKid;
        }

        Node(E value) {
            this(value, null, null);
        }
    }

    public BST() {
        root = null;
    }

    public boolean add(E element) {
        if (element == null) {
            throw new IllegalArgumentException("I refuse to store null");
        }
        boolean changed = false;
        if (isEmpty()) {
            root = new Node<>(element);
            changed = true;
        } else {
            changed = add(element, root);
        }
        return changed;
    }

    private boolean add(E element, Node<E> subroot) {
        boolean changed = false;
        Node<E> kid = new Node<>(element);

        if (element.compareTo(subroot.value) < 0) {
            if (subroot.leftKid == null) {
                subroot.leftKid = kid;
                changed = true;
            } else {
                changed = add(element, subroot.leftKid);
            }
        } else if (element.compareTo(subroot.value) > 0) {
            if (subroot.rightKid == null) {
                subroot.rightKid = kid;
                changed = true;
            } else {
                changed = add(element, subroot.rightKid);
            }
        }
        return changed;
    }

    public void clear() {
        root = null;
    }

    public boolean contains(Object target) {
        return false;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return 0;
    }
}
