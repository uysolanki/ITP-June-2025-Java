package day5;

import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		ArrayList<String> bcaStudents=new ArrayList();
		bcaStudents.add("Alice");
		bcaStudents.add("Ben");
		bcaStudents.add("Chris");
		
		ArrayList<String> enggStudents=new ArrayList();
		enggStudents.add("David");
		enggStudents.add("Elcid");
		enggStudents.add("Frank");
		
		System.out.println(bcaStudents);
		System.out.println("Count of BCA Students " +bcaStudents.size());
		System.out.println(enggStudents);
		System.out.println("Count of Engg Students " +enggStudents.size());
		
		ArrayList<String> itpStudents=new ArrayList();
		itpStudents.addAll(enggStudents);
		itpStudents.addAll(bcaStudents);
		System.out.println("Count of ITP Students " +itpStudents.size());
		
		System.out.println("Student at Index 4 in ITP Students" + itpStudents.get(4));
		
	}

}
