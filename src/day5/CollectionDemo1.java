package day5;

import java.util.ArrayList;

public class CollectionDemo1 {

	public static void main(String[] args) {
		ArrayList collect1=new ArrayList();
		collect1.add("Alice");  //0
		
		int i=10;	//primitive data  //1
		collect1.add(i); 
		
		
		
		System.out.println("My name is "+collect1.get(0));
		System.out.println("My jersey no is "+collect1.get(1));
		
		int nameLength=  ((String)collect1.get(0)).length();
		
		int j=(Integer)collect1.get(1);
		
		
		ArrayList<String> collect2=new ArrayList();
		collect2.add("Alice");
		collect2.add("Ben");
		
		collect2.get(0).length();
	}

}
