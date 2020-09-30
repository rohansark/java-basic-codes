import java.util.*;
class ReverseWords{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] sb = sentence.split(" ");
		int len = sb.length-1;
		String res="";
		for(int i=len;i>=0;i--)
		{
			res+=sb[i]+" ";
		}
		System.out.println(res);
		System.out.println(res.substring(0, res.length() - 1));
	}
}