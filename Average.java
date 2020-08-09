import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
	float sum=0.0f,avg;
	Scanner scan=new Scanner(System.in);
	int ar[]=new int[50];
	System.out.print("\nEnter no. of elements in array : ");
	int n=scan.nextInt();
	System.out.println("Enter "+n+" elements into array : ");
		for(int i=0;i<n;i++)
		{
		ar[i]=scan.nextInt();
		sum=sum+ar[i];
		}
	avg=sum/n;
	System.out.println("Average = "+avg);
	}
}