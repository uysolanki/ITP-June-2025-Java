//keep the odd numbers as it is double the even
package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeStyleAshwin {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		List<Integer> ashNumbers =numbers.stream().map(DeclarativeStyleAshwin::getAsh).collect(Collectors.toList());
		System.out.println(ashNumbers);
	}



public static int getAsh(int n)
{
	if(n%2==0)
		return n*2;
	else
		return n;
}
}