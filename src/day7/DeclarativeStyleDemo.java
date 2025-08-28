//calculate the sqr of each element and store in a separate list and display
package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeStyleDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		//double each element and store in a separate list
		List<Integer> sqrNumbers=numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(sqrNumbers); //[2,4,6,8,10];
		
		//double each element and store in a separate list and display
		numbers.stream().map(n->n*2).forEach(n->System.out.println(n));
		
		//double only odd element and store in a separate list and display
		List<Integer> sqrofOddNumbers=numbers.stream().filter(n->n%2==1).map(n->n*2).collect(Collectors.toList());
		System.out.println(sqrofOddNumbers);
	}

}
