import java.util.Scanner;
class PalindromeSteps{
	public static void main(String[] args)
	{
		boolean isPalindrome = false;
		int count=0;
		int temp,rev=0,rem=0,sum=0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(isPalindrome!=true)
		{
			temp=num;
			while(num!=0)
			{
				rem=num%10;
				num=num/10;
				rev = rev*10+rem;
			}
			sum=rev+temp;
			if(sum==temp)
			{
				isPalindrome=true;
			}
			else
				num=sum;
			
			count++;
		}
		System.out.println(count);
	}
}