/*Program to find the sum of the series 1 + x + x^2+ x^3+ .. + x^n*/
import java.util.Scanner;
import java.lang.Math;
class SeriesPower{
	public static void main(String[] args){
		double sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Enter the max power :");
		int pow = sc.nextInt();
		for(double i=1;i<pow;i++)
		{
			sum=sum+(double)Math.pow(num,i);
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}