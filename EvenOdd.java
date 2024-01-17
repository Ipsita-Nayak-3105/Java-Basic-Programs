class EvenOdd
{
	public static int isEvenOdd(int num)
	{
		return(num%2);
	}
	public static void main(String []args)
	{
		if(args.length>0)
		{
		int num=Integer.parseInt(args[0]);
		int res=isEvenOdd(num);
		if(res==0)
		  System.out.println("Even");
		else
		  System.out.println("Odd");
		}
		else
			System.out.println("no command line args found");
	}
}