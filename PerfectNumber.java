import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			System.out.println("The number is a perfect number");
		}
		else
			System.out.println("NO");
		
	}
}