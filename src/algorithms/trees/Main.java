package algorithms.trees;

public class Main {
    public static void main(String[] args) {
        Node root = new Node();
        root.data = 2;

        BinarySearch tree = new BinarySearch();
        tree.root = root;
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
    }
}
