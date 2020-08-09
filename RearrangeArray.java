class RearrangeArray
{
	public static void main(String ar[])
	{
	int i,j;
	int A[]={1,2,3,4,5,6,7,8,9,10};
	int B[]=new int[10];
	System.out.println("\nPresent Array Elements : ");
		for(i=0;i<10;i++)
		{
		System.out.print(A[i]+" ");
		}
		for(i=0,j=9;i<10 && j>=0;i++,j--)
		{
		B[i]=A[j];
		}
		for(i=0;i<10;i++)
		{
		A[i]=B[i];
		}
	System.out.println("\n\nArray in Reversed order : ");
		for(i=0;i<10;i++)
		{
		System.out.print(A[i]+" ");
		}
	}
}