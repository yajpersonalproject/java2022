
public class Stack
{
	Node top = null;
	
	public boolean isEmpty()
	{
		if( top == null )
			return true;
		else
			return false;
		// alternatively, return top==null;
	}
	
	// public void push(Node newNode) OR
	public void push(int d)
	{
		Node newNode = new Node();
		newNode.data = d;
		newNode.next = null;
		
		if( isEmpty() )
			top = newNode;
		else
		{	newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop()
	{
		int d = top.data;
		top = top.next;
		return d;
	}
		
	public void printStack()
	{
		Node temp = top;
		System.out.print("top -> ");
		while( temp != null )
		{
			System.out.print(temp.data);
			System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}

