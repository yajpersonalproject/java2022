public class LinkedList
{
    Node start;
    int size;
    public LinkedList()
    {
        start = null;
        size = 0;
    } // creates an empty LL

    public LinkedList(int data) // creates a LL with a starting node
    {
        Node newNode = new Node(data);
        newNode.next = null;
        start = newNode;
        size = 1;
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
            size = 1;
            return;
        }
        Node temp = start;
        while(temp.hasNext()) // or while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public boolean delete(int dataToDelete)
    {
        if(isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return false;
        }
        if(start.data == dataToDelete)
        {
            start = start.next;
            size--;
            return true;
        }
        Node prev = start;
        Node current = start.next;
        while(current != null)
        {
            if(current.data == dataToDelete)
            {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = prev.next;
            current = current.next;
        }
        return false;
    }

    public void deleteAt(int index)
    {

        size--;
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
        System.out.println(" -> null\tsize: " + size);
    }


}
