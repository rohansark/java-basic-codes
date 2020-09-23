import java.util.Scanner;
class PrimeInRange{
	public static void main(String[] args)
	{
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range and ending range :");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==1)
				System.out.print(i+" ");
			c=0;
		}
	}
}