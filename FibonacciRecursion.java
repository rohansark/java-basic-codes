import java.util.Scanner;
class FibonacciRecursion{
	static int fibonacci(int n){
		if(n==0)
		{
			return n;
		}
		if(n==1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
		
	}
}