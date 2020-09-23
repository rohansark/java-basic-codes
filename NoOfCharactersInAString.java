import java.util.Scanner;
class NoOfCharactersInAString{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str;
		str = sc.nextLine();
		int length = str.length();
		for(int i =0;i<length;i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
