import java.util.Scanner;
class FibonacciIterative{
	public static void main(String[] args){
		int sum,num1=0,num2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want to print :");
		int num = sc.nextInt();
		System.out.print("0"+" "+"1");
		for(int i=2;i<num;i++)
		{
			sum = num1+num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" "+sum+" ");
			
		}
		
		
	}
}