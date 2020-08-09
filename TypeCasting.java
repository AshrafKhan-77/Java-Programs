class TypeCasting
{
	public static void main(String[ ] args)
	{
	char ch = 'A';	//Unicode for 'A' is 65
	int i = (int)ch;
	System.out.println("\nchar ch = 'A' to int = "+i);
	int j = 97;	//97 is Unicode for 'a'
	char ch1 = (char)j;
	System.out.println("int j = 97 to char = "+ch1);
	double d = 1000;
	float f = (float)d;
	int k = (int)f;
	byte b = (byte)k;
	System.out.println("double = "+d+"\nfloat = "+f+"\nint = "+k+"\nbyte = "+b);
	}
}