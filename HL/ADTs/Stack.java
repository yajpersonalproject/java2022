
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

