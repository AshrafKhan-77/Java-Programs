class GreatOf3
{
	public static void main(String args[])
	{
	//System.out.println("Enter 3 Numbers : ");
	int i1=Integer.parseInt(args[0]);
	int i2=Integer.parseInt(args[1]);
	int i3=Integer.parseInt(args[2]);
		if(i1>i2)
		{
		if(i1>i3)
		System.out.println("1st number is greatest.");
		else
		System.out.println("3rd number is greatest.");
		}
		else
		{
		if(i2>i3)
		System.out.println("2nd number is greatest.");
		else
		System.out.println("3rd number is greatest.");
		}
	}
}