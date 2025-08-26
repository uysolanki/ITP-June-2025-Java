package day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo12 {

	public static void main(String[] args) {
		
		String sentance= "one two nine one two three one four three my name is Alice";
		String words[]=sentance.split(" ");
		Map<Integer, Set<String>> groupByLength=new HashMap();
		
		for(String word:words)
		{
			int length=word.length();
			groupByLength.putIfAbsent(length, new HashSet());	
			
			groupByLength.get(length).add(word);
		}
		
		System.out.println(groupByLength);

	
		
		
	}
	
/*	
 word 		length  
 nine		4



3  [one]						[one,two]
4  [nine]                        [nine]
		*/
}
