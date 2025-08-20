package day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo7 {

	public static void main(String[] args) {
//		Set<String> months=new HashSet(Arrays.asList("Apr", "Feb", "Jan", "March", "May"));
//		System.out.println(months);
//		
//		
//		Set<String> months1=new LinkedHashSet(Arrays.asList("Apr", "Feb", "Jan", "March", "May"));
//		System.out.println(months1);
//		
//		Set<String> months2=new TreeSet(Arrays.asList("Jan", "Feb", "March", "Apr", "May"));
//		System.out.println(months2);
//		
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",87.5);
		
		System.out.println("Attendance List");
		Set<Student> attendanceStudents=new TreeSet(new RnoComparator());
		attendanceStudents.add(s1);
		attendanceStudents.add(s2);
		attendanceStudents.add(s3);
		System.out.println(attendanceStudents);
		
		System.out.println("Exam Seating List");
		Set<Student> examSeatingStudents=new TreeSet(new NameComparator());
		examSeatingStudents.add(s1);
		examSeatingStudents.add(s2);
		examSeatingStudents.add(s3);
		System.out.println(examSeatingStudents);
		
		
		System.out.println("Results List");
		Set<Student> examResultsStudents=new TreeSet(new PerComparator());
		examResultsStudents.add(s1);
		examResultsStudents.add(s2);
		examResultsStudents.add(s3);
		System.out.println(examResultsStudents);
	}

}
