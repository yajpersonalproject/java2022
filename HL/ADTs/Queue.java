/*
 * ADT: queue skeleton -- FIFO
 * Complete the following methods:
 * 	enqueue, dequeue, isEmpty, printQueue
 *
 * Requirements for this challenge:
 *  IBIO.java, Node.java, QueueTest.java
 */

public class Queue
{
    Node head;
    Node tail;

    public boolean isEmpty()
    {
        return head == null;
        // no need to check for the tail
    }

    public void enQueue(int data)
    {
        Node newNode = new Node(data);
        if( isEmpty() )
        {
            head = newNode;
        } else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public int deQueue()
    {
        if (!isEmpty())
        {
            int d = head.data;
            head = head.next;
            return d;
        } else
        {
            System.out.println("Queue is empty.");
            return 0;
        }
    }

    public void printQueue()
    {
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null)
        {
            System.out.print(temp.data);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}


