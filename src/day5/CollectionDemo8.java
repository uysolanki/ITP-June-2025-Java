package day5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionDemo8 {

	public static void main(String[] args) {
		Map<String,Double> emps=new LinkedHashMap();
		emps.put("Alice", 800.0);
		emps.put("Ben", 900.0);
		emps.put("Chris", 1000.0);
		emps.put("Tom", 700.0);
		emps.put("John", 1200.0);
		//emps.put("Chris", 1100.0);  //duplicate key, it will override the value
		System.out.println(emps);
		
		//display maxSal 
		double maxSal=0;
		String maxEmp=null;
		for(Entry<String,Double> emp:emps.entrySet())			//maxSal
		{														//0				800>0 True
			if(emp.getValue()>maxSal)							//800			900>800True
			{													//900			1000>900True
				maxSal=emp.getValue();							//1000          700>1000 False
				maxEmp=emp.getKey();
			}													//1000          1200>1000 True
		}														//1200          loop end
		System.out.println(maxSal);
		System.out.println(maxEmp);
		
		
		//display maxSal part 2 
			maxSal=0;
			Entry<String,Double> maxEmployee=null;
				for(Entry<String,Double> emp:emps.entrySet())			//maxSal
				{														//0				800>0 True
					if(emp.getValue()>maxSal)							//800			900>800True
					{		
						maxSal=emp.getValue();												//900			1000>900True
						maxEmployee=emp;
					}													//1000          1200>1000 True
				}														//1200          loop end
				System.out.println("Maximum sal is " + maxEmployee.getValue() + " earned by " + maxEmployee.getKey());
		
		//display emp earning maxSal 
	}

}
