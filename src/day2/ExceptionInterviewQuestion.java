package day2;

public class ExceptionInterviewQuestion {

	public static void main(String[] args) {
		int value=test();
		System.out.println(value);

	}

	private static int test() {
		try
		{
			int result=10/0;
			return 1;
		}
		catch(ArithmeticException e1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

}
