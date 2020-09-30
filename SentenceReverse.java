import java.util.*;
class SentenceReverse{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int len = sentence.length();
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(sentence.charAt(i));
		}
	}
}