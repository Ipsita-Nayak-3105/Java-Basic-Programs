class EvenOdd {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public static int isEvenOdd(int num) {
		return (num % 2);
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			int num = Integer.parseInt(args[0]);
			int res = isEvenOdd(num);
			if (res == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		} else
			System.out.println("no command line args found");
	}

	@Override
	public String toString() {
		return "EvenOdd []";
	}
}