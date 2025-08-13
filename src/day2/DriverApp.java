package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverApp {

	public static void main(String[] args) {
		Amitabh a1;
		a1=new Abhishek();
		
		a1.home();
		a1.car();

		System.out.println(a1.qualification);
		
		int num=10;
		int deno=0;
		double result=num/deno;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


//method belongs to the object
//data belongs to the ref