class LowestUniqueInteger{
	public static void main(String[] args)
	{
		int[] arr = {1,8,2,5,2,1,6,9,7,8,4};
		int[] count = new int[10];
		int[] uniqueArr = new int[10];
		int j=0;
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			++count[arr[i]];
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==1)
			{
				uniqueArr[j++]=i;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(uniqueArr[0]==arr[i])
			{
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("Unique Integer:" + uniqueArr[0]);
	}
}