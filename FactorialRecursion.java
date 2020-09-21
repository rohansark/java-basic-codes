import java.util.Scanner;
class FactorialRecursion{
	
	static int factorial(int num){
		if(num>=1)
			return num*factorial(num-1);
		else
			return 1;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}
}