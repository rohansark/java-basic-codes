import java.util.Scanner;
class SecondLastWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int len = arr.length;
		System.out.println("Second Last Word is - "+arr[len-2]);
		
	}
}