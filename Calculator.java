import java.util.*;
class Calculator{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char operator = sc.next().charAt(0);;
		int a = sc.nextInt();
		int b = sc.nextInt();
		double result;
		switch(operator)
		{
			case '+':
				result = a+b;
				System.out.println(result);
				break;
			case '-':
				result = a-b;
				System.out.println(result);
				break;
			case '*':
				result = a*b;
				System.out.println(result);
				break;
			case '/':
				try{
					result = a/b;
					System.out.println(result);
				}
				catch(Exception e)
				{
					System.out.println("Divide by zero error ");
				}
				break;
			default:
				System.out.println("WRONG INPUT");
		}
	}
}