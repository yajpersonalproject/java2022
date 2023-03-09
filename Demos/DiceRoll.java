
public class DiceRoll {
	
	static final int MAXROLLS = 100;
	static final int MAXSIDES = 8;
	
	public static int randInt(int n)
	{
		int r = (int)((Math.random() * n) + 1);
		return r;
	}
	public static void main (String[] args) {
		System.out.println("This program simulates " + MAXROLLS + " rolls of a " + MAXSIDES + " sided dice\n");
		int[] rolls = new int[MAXROLLS];
		int[] stats = new int[MAXSIDES];
		// first we roll the dice
		for(int i = 0; i < MAXROLLS; i++)
		{	int roll = randInt(MAXSIDES);
			rolls[i] = roll;
			//System.out.println( roll );
		}
		
		for(int side = 0; side < MAXSIDES; side++)
		{	System.out.print( (side+1) + " ");
			int c = 0;
			for(int r = 0; r < 100; r++)
			{	if( rolls[r] == side+1 )
				{	System.out.print("X");
					c++;
				}
			}
			stats[side] = c;
			System.out.println("    " + c);
		}
				
	}
}


