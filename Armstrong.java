import java.util.Scanner;
import  java.lang.Math;
class Armstrong{
	public static void main(String[] args){
		int c=0,a,numOfDigits=0,rev=0,pow;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int temp = n;
		while(n>0)
		{
			a = n%10;
			n = n/10;
			numOfDigits++;
			rev = rev*10+a;
		}
		System.out.println("Number of digits : "+numOfDigits);	
		System.out.println("Reverse : "+rev);
		a=0;
		int new2=temp;
		while(temp>0)
		{
			a = temp%10;
			temp = temp/10;
			pow = (int)Math.pow(a,numOfDigits);
			System.out.println("hi"+pow);
			c = c + pow;
		}
		System.out.println("check "+c);
		if(c == new2)
		{
			System.out.println("Yes");			
		}
		else
			System.out.println("No");	
		
	}

}