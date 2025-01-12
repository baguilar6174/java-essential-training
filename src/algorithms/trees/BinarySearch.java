package algorithms.trees;

public class BinarySearch {
    Node root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node node, int value) {
        if (root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            // insert on right
            root.right = insert(root.right, value);
        }
        return root;
    }
}
