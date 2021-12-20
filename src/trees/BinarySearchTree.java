package trees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    static Node root = null;

    public static void insertData(int data) {
        root = insert(root, data);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void traverse(Node root) {
        if (root == null)
            return;
        traverse(root.left);
        System.out.print(root.data + " ");
        traverse(root.right);
    }

    public static boolean search(int data) {
        return search(root, data);
    }

    public static boolean search(Node root, int data) {

        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data > root.data) {
            return search(root.right, data);
        } else {
            return search(root.left, data);
        }
    }

    public static void main(String[] args) {

        insertData(10);
        insertData(20);
        insertData(30);
        insertData(40);
        insertData(50);
        insertData(60);
        traverse(root);
        System.out.println("\nElement Present: " + search(100));
    }
}