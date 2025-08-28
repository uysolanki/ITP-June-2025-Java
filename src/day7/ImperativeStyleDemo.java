//calculate the sqr of each element and store in a separate list and display
package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeStyleDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		List<Integer> sqrNumbers=new ArrayList();
		
		for(int number:numbers)
		{
			int sqr=number*number;
			sqrNumbers.add(sqr);
		}
		
		for(int sqrNum:sqrNumbers)
		{
			System.out.println(sqrNum);
		}
		
	}

}
