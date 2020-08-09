class PrimeNo
{  public static void main(String ar[])
   {  int n=Integer.parseInt(ar[0]),i;
      for(i=2;i<=n/2;i++)
      {  if(n%i==0)
         {  System.out.println("Not a Prime Number."); 
            break;
         }
      }
      if(i>n/2)
      System.out.println("Prime Number.");
   }
}