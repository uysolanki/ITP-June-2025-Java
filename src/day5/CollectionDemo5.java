package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class CollectionDemo5 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
		pq.add(10);
		pq.add(21);
		pq.add(5);
		pq.add(40);
		pq.add(50);
		pq.add(45);

		
		System.out.println(pq.remove());
		System.out.println("SIZE " +pq.size());
		
		System.out.println(pq.remove());
		System.out.println("SIZE " +pq.size());
	}

}
