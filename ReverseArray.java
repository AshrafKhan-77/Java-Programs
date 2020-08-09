import java.util.Scanner;
class ReverseArray
{	public static void main(String args[])
	{ Scanner scan = new Scanner(System.in);
	  int i,j,temp;
	  int A[] = new int[10];
	  System.out.print("\nEnter 10 elements into array : ");
		for(i=0;i<10;i++)
		{ A[i] = scan.nextInt(); }
		for(i=0,j=9;i<10 && j>=0;i++,j--)
		{ if(i>j)
		   break;
		  temp=A[i];
		  A[i]=A[j];
		  A[j]=temp;
		}
	  System.out.print("\nReversed array : ");
		for(i=0;i<10;i++)
		{  System.out.print(A[i]+" ");  }
	}
}