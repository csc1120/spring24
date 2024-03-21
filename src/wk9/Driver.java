package wk9;

public class Driver {
    public static void main(String[] args) {
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
