package day3;

import java.util.Scanner;

public class TurfAppProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your Name");
		String customerName=sc.next();
		System.out.println("Please enter your Date of Play in DD-Mon-YYYY format");
		String dateOfPlay=sc.next();
		System.out.println("Please enter time in 24 Hour format");
		String timeOfPlay=sc.next();
		System.out.println("Choose Court");
		System.out.println("1.Cricket");
		System.out.println("2.Footabll");
		int courtType=sc.nextInt();
		
		switch(courtType)
		{
		case 1 : double rate=800.0;
				 System.out.println("****Invoice****");
				 System.out.println("Abc Turf, JM Road Pune");
				 System.out.println("Customer Name "+customerName);	
				 System.out.println("Date Of Play "+dateOfPlay);	
				 System.out.println("Time Of Play "+timeOfPlay);
				 System.out.println("Court :Cricket");
				 System.out.println("Price : "+rate);
				 break;
		case 2: double rate1=1200.0;
				 System.out.println("****Invoice****");
				 System.out.println("Abc Turf, JM Road Pune");
				 System.out.println("Customer Name "+customerName);	
				 System.out.println("Date Of Play "+dateOfPlay);	
				 System.out.println("Time Of Play "+timeOfPlay);
				 System.out.println("Court :Football");
				 System.out.println("Price : "+rate1);
				 break;
	
		default : System.out.println("Invalid Choice");
		}
	}

}
