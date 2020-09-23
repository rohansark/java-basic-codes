import java.util.Scanner;
class ReverseANumber{
	public static void main(String[] args){
		int rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		System.out.println(rev);
		
	}
}