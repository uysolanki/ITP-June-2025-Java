package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class CollectionDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList(Arrays.asList(10,21,33,40,50));
		System.out.println(arr1.size());
		
		//System.out.println(arr1.get(5));  //throws IOOBE
		
		
		ListIterator<Integer> litr=arr1.listIterator();
		while(litr.hasNext())
		{
			int n=litr.next();
			if(n%2==1)
				litr.set(n+1);
		}
		
		System.out.println(arr1);
	}

}
