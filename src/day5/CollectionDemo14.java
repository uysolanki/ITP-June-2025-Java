package day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo14 {

	public static void main(String[] args) {
		//input=input.replaceAll("[^A-Za-z]", "").toLowerCase();
		String sentance= "listen silent note tone bca abc cab mango apple";
		String words[]=sentance.split(" ");
		Map<String, Set<String>> groupByAnagram=new HashMap();
		
		for(String word:words)					//word     arr1						 arr1 after sort        	key 
		{										//listen   ['l','i','s','t','e','n'] ['e','i','l','n','s','t']  "eilnst"
			char[] arr1=word.toCharArray(); 						
			Arrays.sort(arr1);
			String key=new String(arr1);
			
			groupByAnagram.putIfAbsent(key, new HashSet());
			
			groupByAnagram.get(key).add(word);
		}
		
		System.out.println(groupByAnagram.values());	
	}
}
//A
//eilnst   [silent]
//eont     [tone,note]
//abc      [abc,cab,bac]

//B
//[[silent,listen],[tone,note],[abc,cab,bac]]

