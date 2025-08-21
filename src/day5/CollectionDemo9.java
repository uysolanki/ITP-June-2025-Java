package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionDemo9 {

	public static void main(String[] args) {
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",87.5);
		Student s4=new Student(33,"Hardik",57.5);
		
		Map<String,Student> m100=new HashMap();
		m100.put("first", s1);
		m100.put("second", s2);
		m100.put("third", s3);
		//m100.putIfAbsent("Second", s4);
		
		
		//System.out.println(m100.get("second").getSname());
		
		System.out.println(m100.getOrDefault("firsty", s4));
		
		System.out.println(m100);
		
	}

}
