package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionDemo11 {

	public static void main(String[] args) {
		
		String sentance= "one two one two three one four three my name is Alice";
		String words[]=sentance.split(" ");
		Map<String,Integer> counters=new HashMap();
		
		
//		for(String word:words)
//			{
//			if(counters.containsKey(word))
//				counters.put(word, counters.get(word)+1);
//			else
//				counters.put(word, 1);
//			}
		
		
		for(String word:words)
		counters.put(word, counters.getOrDefault(word, 0)+1);
	
		
		System.out.println(counters);
	}
	
/*	
 word 
 one

one 2
two 1	
		*/
}
