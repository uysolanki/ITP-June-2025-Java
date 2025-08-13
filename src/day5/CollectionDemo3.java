package day5;

import java.util.ArrayList;

public class CollectionDemo3 {

	public static void main(String[] args) {
		ArrayList<String> bcaStudents=new ArrayList();
		bcaStudents.add("Alice");
		bcaStudents.add("Ben");
		bcaStudents.add("Chris");
		
		if(bcaStudents.contains("Tom"))
		{
			System.out.println("Tom is doing BCA");
		}
		else
		{
			System.out.println("Tom is not doing BCA");
		}
		
		ArrayList<String> enggStudents=new ArrayList();
		enggStudents.add("David");
		enggStudents.add("Elcid");
		enggStudents.add("Frank");
		
		System.out.println(bcaStudents);
		System.out.println("Count of BCA Students " +bcaStudents.size());
		System.out.println(enggStudents);
		System.out.println("Count of Engg Students " +enggStudents.size());
		
		ArrayList<ArrayList<String>> itpStudents=new ArrayList();
		itpStudents.add(bcaStudents);
		itpStudents.add(enggStudents);
		
		System.out.println("Count of ITP Students " +itpStudents.size());
		System.out.println(itpStudents.get(1).get(2));
		
		
		for(int i=0;i<itpStudents.size();i++)
		{
			System.out.println(itpStudents.get(i).get(0));
		}
		
	}

}
