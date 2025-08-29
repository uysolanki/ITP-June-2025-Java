//calculate the sqr of each element and store in a separate list and display
package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeStyleString {

	public static void main(String[] args) {
		List<String> numbers=new ArrayList(Arrays.asList("one","two","three","four","five","six"));
		
		//List<Integer> lengths=numbers.stream().map(s->s.length()).collect(Collectors.toList());
		
		List<Integer> lengths=numbers.stream().map(DeclarativeStyleString::getLength).collect(Collectors.toList());
		
		System.out.println(lengths);
		
	}


public static int getLength(String str)
{
	return str.length();
}
}