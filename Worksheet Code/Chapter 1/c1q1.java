
public class c1q1
{
	public static void main(String[] args)
	{
		String name = IBIO.inputString("Enter your name: ");
		int x = IBIO.inputInt("Enter how many times you want your name to be printed: ");
		for(int i = 0; i < x; i++){
			IBIO.output(name);
		}
	}
}
