import java.util.*;
class FindDistance{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x1,x2,y1,y2;
		double dist;
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance - "+String.format("%.2f", dist));
	}
}