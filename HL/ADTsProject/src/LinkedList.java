public class LinkedList
{
    Node start;

    public LinkedList() { }

    public LinkedList(int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        start = newNode;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void append(int data)
    {
        Node newNode = new Node(data);
        if( isEmpty() )
        {
            start = newNode;
            return;
        }
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
        System.out.print("start");
        while(temp != null)
        {
            System.out.print(" -> " + temp.data);
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

        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(5);
        list2.append(2);
        list2.printLinkedList();
    }
}
