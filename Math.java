class ArithOp
{   int a,b;

    void Add(int a,int b)
    {  System.out.println("a + b = "+(a+b));  }
	
    void Subtract(int a,int b)
    {  System.out.println("a - b = "+(a-b));  }

    void Divide(int a,int b)
    {  System.out.println("a / b = "+(a/b));  }

    void Multiply(int a,int b)
    {  System.out.println("a * b = "+(a*b));  }

    void Modulous(int a,int b)
    {  System.out.println("a % b = "+(a%b)); }
}

public class Math
{   public static void main(String ar[ ])
    {   ArithOp op=new ArithOp();
        int a=Integer.parseInt(ar[0]);
        int b=Integer.parseInt(ar[1]);
        op.Add(a,b);
        op.Subtract(a,b);
        op.Divide(a,b);
        op.Multiply(a,b);
        op.Modulous(a,b);
    }
}