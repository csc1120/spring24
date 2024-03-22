package wk9;

public class Driver {
    public static void main(String[] args) {
        TrinaryTree<Integer> treeLeft = new TrinaryTree<>(7,
                new TrinaryTree<>(1), null, null);
        TrinaryTree<Integer> treeMid = new TrinaryTree<>(3,
                new TrinaryTree<>(1),
                new TrinaryTree<>(3),
                new TrinaryTree<>(12));
        TrinaryTree<Integer> treeRight = new TrinaryTree<>(5,
                null, new TrinaryTree<>(100), new TrinaryTree<>(8));
        TrinaryTree<Integer> tree = new TrinaryTree<>(8, treeLeft, treeMid, treeRight);
        System.out.println(tree);
    }

    public static void main2(String[] args) {
        String[] words = {"The", "day", "started", "early", "and", "ended", "late"};
        BST<String> tree = new BST<>(words);
        System.out.println(tree);
        System.out.println(tree.height());
//        System.out.println(tree.add("monopoly"));
//        System.out.println(tree.add("monopoly"));
//        System.out.println(tree.add("pass"));
//        System.out.println(tree.add("go"));
//        System.out.println(tree.add("chance"));
    }
}
