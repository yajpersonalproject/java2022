public class Node
{
    Node left;
    String key; // data
    Node right;

    public Node() { }

    public Node(String data)
    {
        key = data;
        left= null;
        right = null;
    }

    public String toString()
    {
        return key;
    }

}
