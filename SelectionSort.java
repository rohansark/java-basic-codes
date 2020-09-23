import java.util.Scanner;
class SelectionSort{
	public static void main(String[] args)
	{
		int[] a= {10,9,12,1,6,6};
		int min,i,j,temp;
		for(i=0;i<a.length-1;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			temp = a[i];
			a[i] = a[min];
			a[min]=temp;
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]+" ");
				
			}
			System.out.println("\n");
			
		}
		
		
	}
	
}