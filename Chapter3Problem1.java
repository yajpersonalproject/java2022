/*
 * Chapter 3 problem 1
 * 
 */


public class Chapter3Problem1
{
	
	public static void main (String[] args)
	{
		int x;
		do
		{	x = IBIO.inputInt("Enter a number less than 100: ");
		} while( x <= 0 || x >= 100 || x % 2 != 0);
		IBIO.output("Thank you");
	}
}

/* Output:

Enter a number less than 100: Enter a number less than 100: -5
Enter a number less than 100: 1111
Enter a number less than 100: 1
Enter a number less than 100: 6
Thank you

*/
