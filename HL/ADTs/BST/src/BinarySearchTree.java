// WIP!!!

public class BinarySearchTree
{
    Node root;

    public BinarySearchTree() { }

    public BinarySearchTree(String data)
    {
        Node newNode = new Node(data);
        this.root = newNode;
    }

    public BinarySearchTree(Node root)
    {
        this.root = root;
    }

    public void insert(Node node, String data)
    {
        if( node == null) // base case
        {
            Node temp = new Node(data);
            node = temp;
            return;
        }
        if(data.compareToIgnoreCase(node.key) > 0)
        {
            insert(node.right, data);
        }
        if(data.compareToIgnoreCase(node.key) < 0)
        {
            insert(node.left, data);
        }

    }

    public void insert(Node node, Node insertion)
    {
        if( node == null) // base case
        {
            node = insertion;
            return;
        }
        if(insertion.key.compareToIgnoreCase(node.key) > 0)
        {
            if(node.right == null)
            {
                node.right = insertion;
            } else
            {
                insert(node.right, insertion);
            }
        }
        if(insertion.key.compareToIgnoreCase(node.key) < 0)
        {
            if(node.left == null)
            {
                node.left = insertion;
            } else
            {
                insert(node.left, insertion);
            }
        }
    }

}
