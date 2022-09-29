/*
 * 
 */


public class Triangular
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos");
		int howMany ;
		do
		{
			howMany	= IBIO.inputInt("How many terms? ");
			while(howMany < 0)
			{
				IBIO.output("Error! positives only!");
				howMany = IBIO.inputInt("Terms? ");
			}
			if(howMany != 0)
			{
				int sum = 0;
				double average = 0;
				for(int i = 1; i <= howMany; i++)
				{
					sum = sum + i;
					average = average + sum;
					if(howMany <= 20)
					{	IBIO.out(sum);
						if(i < howMany)
						{	IBIO.out(", ");
						}
					}
				}
				if(howMany > 20)
				{	IBIO.output(sum);
				}
				int n = sum;
				int digitsCounter = 0;
				do
				{	n = n / 10;
					digitsCounter = digitsCounter + 1;
				} while( n > 0 );
				IBIO.output("");
				IBIO.output(sum + " has " + digitsCounter + " digits");
				IBIO.output("Average = " + average);
			}
		} while(howMany != 0);
	}
}

