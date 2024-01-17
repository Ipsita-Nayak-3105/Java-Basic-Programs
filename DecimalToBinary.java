class DecimalToBinary
{
	public static void main(String []args)
	{
		int num = 15;
		String s="";
	while(num>0)
		{ 
		   int rev=num%2;
		s = rev+s;
		num=num/2;
		}
	System.out.println(s);
}
}