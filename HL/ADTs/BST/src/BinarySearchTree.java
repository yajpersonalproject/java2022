// WIP!!!

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(String data) {
        Node newNode = new Node(data);
        this.root = newNode;
        System.out.println("BST root created with data: " + data);
    }

    public BinarySearchTree(Node root) {
        System.out.println("BST root created with data: " + root.key);
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(String data) {
        Node temp = new Node(data);
        if (this.isEmpty()) {
            root = temp;
            System.out.println("BST root created with data: " + data);
        } else {
            insert(root, temp);
        }
    }

    public void insert(Node node, Node insertion) {
        if (insertion.key.compareToIgnoreCase(node.key) > 0) {
            if (node.right == null) {
                System.out.println("Adding " + insertion + " to the RIGHT of " + node);
                node.right = insertion;
            } else {
                insert(node.right, insertion);
            }
        }
        if (insertion.key.compareToIgnoreCase(node.key) < 0) {
            if (node.left == null) {
                System.out.println("Adding " + insertion + " to the LEFT of " + node);
                node.left = insertion;
            } else {
                insert(node.left, insertion);
            }
        }
    }

    public boolean search(String data) {
        return search(root, data);
    }
    public boolean search(Node node, String data) {
        if (node == null)
            return false;
        if (data.equalsIgnoreCase(node.key))
            return true;
        else if (data.compareToIgnoreCase(node.key) > 0)
            return search(node.right, data);
        else //if(data.compareToIgnoreCase(node.key) < 0)
            return search(node.left, data);
    }


}
