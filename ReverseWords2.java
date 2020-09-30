import java.util.*;
class ReverseWords2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] sb = sentence.split(" ");
		int len = sb.length-1;
		String res="";
		for(int i=0;i<=len;i++)
		{
			int wordLen=sb[i].length()-1;
			for(int j=wordLen;j>=0;j--)
			{
				res+=sb[i].charAt(j);
			}
			//res+=" ";
		}
		System.out.println(res);
		
		if(res.equals(sentence))
		{
			System.out.println(" Palindrome ");
		}
	}
}