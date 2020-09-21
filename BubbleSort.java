class BubbleSort{
	public static void main(String[] args){
		int[] a = {50,5,78,9,28,1};
		int i,j,k,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(k=0;k<a.length;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println("\n");
		}
		
	}
}