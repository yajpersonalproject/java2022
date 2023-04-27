public class LinkedList
{
    Node start;

    public LinkedList(int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        start = newNode;
    }

    public void append(int data)
    {
        Node newNode = new Node(data);
        Node temp = start;
        while(temp.hasNext())
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printLinkedList()
    {
        Node temp = start;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList(5);
        list.append(7);
        list.append(3);
        list.printLinkedList();
    }
}
