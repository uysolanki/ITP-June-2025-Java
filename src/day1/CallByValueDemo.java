package day1;

public class CallByValueDemo{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30};
		System.out.println(arr[0]); //10
		test(arr[0]);
		System.out.println(arr[0]); //10

	}
	
	public static void test(int brr)
	{
		System.out.println(brr); //10
		brr=99;
		System.out.println(brr); //99
	}

}
