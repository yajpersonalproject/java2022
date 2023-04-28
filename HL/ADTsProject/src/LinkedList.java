public class LinkedList
{
    Node start;

    public LinkedList() { } // creates an empty LL

    public LinkedList(int data) // creates a LL with a starting node
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
        while(temp.hasNext()) // or while(temp.next != null)
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


}
