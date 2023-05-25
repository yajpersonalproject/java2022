public class S2ExamC
{
    
    public static boolean isLetter(char c)
    {
		char[] punctuation = { ',', '.', '\"', '\'', ':', ';', '(', ')', '?', '!' };
		boolean isLetter = true;
		for(int p = 0; p < punctuation.length; p++)
		{	if( c == punctuation[p] )
			{	isLetter = false;
				break;
			}
		}
		return isLetter;
	}
    
    public static int nLetters(String words) {
        int letterCount = 0;
        // int index = 0; // used with while loop alternative only
        char[] wordc = words.toCharArray();
        // while (wordc[index] != ' ') while loop alternative
        for(int index = 0; wordc[index] != ' '; index++)
        {
			if( isLetter(wordc[index]) == true )	
			{	letterCount = letterCount + 1;
			}
			// index++; // used with while loop alternative only
        }
        return letterCount;
    }
    
    public static int nWords(String sentence)
    {
		int wordCount = 1;
		int index = 0;
		char[] sentc = sentence.toCharArray();
		while(sentc[index] != '.')
		{
			if(sentc[index] == ' ')
			{	wordCount++;
			}
			index++;
		}
		return wordCount;
	}
	
	// Construct the algorithm for a method ... avWordsavWords(...) that returns the average length of words in a given sentence. Remember that the average length will be the sum of the lengths divided by the number of words in the sentence.

    public static void main(String[] args)
    {
        System.out.println("nLetters(\"green, \") = " + nLetters("green, "));
        System.out.println("nLetters(\"green \") = " + nLetters("green "));
        System.out.println("nWords(\"Uno dos tres cuatro.\") = " + nWords("Uno dos tres cuatro."));
        System.out.println("nWords(\"Uno dos tres cuatro cinco seis siete.\") = " + nWords("Uno dos tres cuatro cinco seis siete."));
        System.out.println("nWords(\"Hello, weird world. OFS here.\") = " + nWords("Hello, weird world. OFS here."));
    }
}
