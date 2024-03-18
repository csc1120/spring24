package wk9;

public class Driver {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        System.out.println(tree.add("monopoly"));
        System.out.println(tree.add("monopoly"));
        System.out.println(tree.add("pass"));
        System.out.println(tree.add("go"));
        System.out.println(tree.add("chance"));
    }
}
