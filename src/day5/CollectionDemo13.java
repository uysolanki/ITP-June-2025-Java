package day5;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionDemo13 {

	public static void main(String[] args) {
		
		String sentance= "Mahendra Singh Dhoni";
		//String sentance= "tom";
		//String sentance=null;
		//String sentance="";
		try
		{
			
			if (sentance.length()==0)
				throw new NullPointerException();
			
		sentance=sentance.replaceAll("[^A-Za-z]", "").toLowerCase();
		
		Map<Character,Integer> counter=new LinkedHashMap();   //['m','a'...]		key
		for(char key:sentance.toCharArray())			//					a
			counter.put(key, counter.getOrDefault(key, 0)+1);
		
		int flag=0;
		char ch=' ';
		for(char key:sentance.toCharArray())				//key
		{													//m
			if(counter.get(key)==1)
			{
				ch=key;
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("No Char found");
		}
		else
		{
			System.out.println("First repeated char is "+ch);
		}
		}
		catch(NullPointerException e1)
		{
			System.out.println("Please enter valid string");
		}
		
		
	}
}
/*
 m   1
 a	 2
 h   3
 e   1
 n   3
 d   2
 r   1
 s   1
 i   2
 g	 1
 o   1
 
 */
 
//eilnst   [silent]
//eont     [tone,note]
//abc      [abc,cab,bac]

//B
//[[silent,listen],[tone,note],[abc,cab,bac]]

