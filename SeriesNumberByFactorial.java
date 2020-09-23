/*Java Program to find the sum of a Series 1/1! + 2/2! + 3/3! + 4/4! +…….+ n/n!*/
import java.util.Scanner;
class SeriesNumberByFactorial{
	static double factorial(int n){
		if(n>=1)
			return n*factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args){
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum = sum+(i/factorial(i));
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}