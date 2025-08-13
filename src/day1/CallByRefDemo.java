package day1;

public class CallByRefDemo{

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a); //10
		test(a);
		System.out.println(a); //10

	}
	
	public static void test(int z)
	{
		System.out.println(z); //10
		z=99;
		System.out.println(z); //99
	}

}
