package wk9;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Consumer;

public class BST<E extends Comparable<? super E>> implements Set<E> {
    private Node<E> root;

    private final static class Node<E> {
        E value;
        Node<E> parent;
        Node<E> leftKid;
        Node<E> rightKid;

        Node(E value, Node<E> parent, Node<E> leftKid, Node<E> rightKid) {
            this.value = value;
            this.parent = parent;
            this.leftKid = leftKid;
            this.rightKid = rightKid;
        }

        Node(E value, Node<E> parent) {
            this(value, parent, null, null);
        }

        Node(E value) {
            this(value, null, null, null);
        }
    }

    public BST() {
        root = null;
    }

    public BST(E[] values) {
        Arrays.sort(values);
        addSorted(values, 0, values.length);
    }

    private void addSorted(E[] values, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            add(values[middle]);
            addSorted(values, start, middle);
            addSorted(values, middle + 1, end);
        }
    }

    @Override
    public boolean add(E element) {
        if (element == null) {
            throw new IllegalArgumentException("I refuse to store null");
        }
        boolean changed;
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
        Node<E> kid = new Node<>(element, subroot);

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

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public boolean contains(Object target) {
        if (root == null) {
            return false;
        }
        return target.getClass().isAssignableFrom(root.value.getClass())
                && contains((E) target, root);
    }

    private boolean contains(E target, Node<E> subroot) {
        boolean found = false;
        if (subroot != null) {
            int comparison = target.compareTo(subroot.value);
            if (comparison == 0) {
                found = true;
            } else if (comparison < 0) {
                found = contains(target, subroot.leftKid);
            } else {
                found = contains(target, subroot.rightKid);
            }
        }
        return found;
    }

    public boolean containsNonRecursive(Object target) {
        if (!target.getClass().isAssignableFrom(root.value.getClass())) {
            return false;
        }
        Node<E> walker = root;
        boolean found = false;
        while (walker != null && !found) {
            int comparison = walker.value.compareTo((E) target);
            if (comparison == 0) {
                found = true;
            } else if (comparison < 0) {
                walker = walker.rightKid;
            } else {
                walker = walker.leftKid;
            }
        }
        return found;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node<E> subroot) {
        int size = 0;
        if (subroot != null) {
            size = 1 + size(subroot.leftKid) + size(subroot.rightKid);
        }
        return size;
    }

    @Override
    public String toString() {
        return toString(root, 0);
    }

    private String toString(Node<E> subroot, int level) {
        final int spacing = 5;
        return subroot == null ? ""
                : toString(subroot.rightKid, level + 1)
                + " ".repeat(level * spacing) + subroot.value + "\n"
                + toString(subroot.leftKid, level + 1);
    }

    public int height() {
        return height(root) - 1;
    }

    private int height(Node<E> subroot) {
        return subroot == null ? 0
                : 1 + Math.max(height(subroot.leftKid), height(subroot.rightKid));
    }

    public void orderedPrint() {
        orderedPrint(root);
    }

    private void orderedPrint(Node<E> subroot) {
        if (subroot != null) {
            orderedPrint(subroot.leftKid);
            System.out.println(subroot.value);
            orderedPrint(subroot.rightKid);
        }
    }

    public void preOrder(Consumer<E> consumer) {
        preOrder(consumer, root);
    }

    private void preOrder(Consumer<E> consumer, Node<E> subroot) {
        if (subroot != null) {
            consumer.accept(subroot.value);
            preOrder(consumer, subroot.leftKid);
            preOrder(consumer, subroot.rightKid);
        }
    }

    public void postOrder(Consumer<E> consumer) {
        postOrder(consumer, root);
    }

    private void postOrder(Consumer<E> consumer, Node<E> subroot) {
        if (subroot == null) {
            return;
        }

        postOrder(consumer, subroot.leftKid);
        postOrder(consumer, subroot.rightKid);
        consumer.accept(subroot.value);
    }
}