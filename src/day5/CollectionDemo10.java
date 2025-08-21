package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionDemo10 {

	public static void main(String[] args) {
		
		int numbers[]= {1,2,3,4,5};
//		int oddc=0,evenc=0;
//		
//		for(int n:numbers)
//		{
//			if(n%2==0)
//				evenc++;
//			else
//				oddc++;
//		}
//		
//		System.out.println("Odd Count" + oddc);
//		System.out.println("Even Count" + evenc);
		Map<String,Integer> counters=new HashMap();
		counters.put("evenc", 0);
		counters.put("oddc", 0);
		
		for(int n:numbers)
			{
			if(n%2==0)
				counters.put("evenc", counters.get("evenc")+1);
			else
				counters.put("oddc", counters.get("oddc")+1);
			}
		System.out.println(counters);
	}
	
	

		
}
