package wk9;

public class TrinaryTree<E> {
    private E element;
    private TrinaryTree<E> leftSubTree;
    private TrinaryTree<E> middleSubTree;
    private TrinaryTree<E> rightSubTree;

    public TrinaryTree(E element, TrinaryTree<E> leftSubTree, TrinaryTree<E> middleSubTree,
                       TrinaryTree<E> rightSubTree) {
        this.element = element;
        this.leftSubTree = leftSubTree;
        this.middleSubTree = middleSubTree;
        this.rightSubTree = rightSubTree;
    }

    public TrinaryTree(E element) {
        this(element, null, null, null);
    }

    public boolean isLeaf() {
        return leftSubTree == null && middleSubTree == null && rightSubTree == null;
    }

    public TrinaryTree<E> getLeft() {
        return leftSubTree;
    }

    public TrinaryTree<E> getMiddle() {
        return middleSubTree;
    }

    public TrinaryTree<E> getRight() {
        return rightSubTree;
    }

    @Override
    public String toString() {
        return toString(this);
    }

    private static String toString(TrinaryTree tree) {
        return tree.element.toString()
                + (tree.leftSubTree == null ? "" : ", " + toString(tree.leftSubTree))
                + (tree.middleSubTree == null ? "" : ", " + toString(tree.middleSubTree))
                + (tree.rightSubTree == null ? "" : ", " + toString(tree.rightSubTree));
    }
}















