
public class ArrayDemo 
{
	public static void printArray(int[] a)
	{
		if(a.length > 0)
		{	for(int index = 0; index < a.length; index++)
			{	System.out.println("[" + index + "] " + a[index]);
			}
		} else {
			System.out.println("nothing inside of numbers array");
		}
	}
	
	public static void main (String[] args)
	{
		int[] numbers; // declaration
		numbers = new int[10]; // initialisation
		System.out.println(numbers);
		printArray(numbers);
		
	}
}

