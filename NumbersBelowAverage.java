import java.util.Scanner;
class NumbersBelowAverage
{ public static void main(String[ ] args)
{ Scanner scan=new Scanner(System.in);
  float sum=0.0f , avg;
  int ar[]=new int[10],i,count=0;
  System.out.println("\nEnter 10 numbers into array : ");
  for(i=0;i<10;i++)
  { ar[i] = scan.nextInt(); 
    sum = sum + ar[i]; }
  avg = sum/10;
  System.out.println("Average = "+avg);
  for(i=0;i<10;i++)
  { if(ar[i]<avg)	count++;}
  System.out.print("No. of elements less than average = "+count);
}}