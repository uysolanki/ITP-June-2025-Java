package day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CollectionDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Apple Juices");
		int apple=sc.nextInt();
		System.out.println("Enter Number of Mango Juices");
		int mango=sc.nextInt();
		System.out.println("Enter Number of Orange Juices");
		int orange=sc.nextInt();
		
		int minSeconds=calculateTime(apple,mango,orange);
		System.out.println("Minimum time taken "+minSeconds);
		
	}

	private static int calculateTime(int apple, int mango, int orange) {
		PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
		pq.add(apple);
		pq.add(mango);
		pq.add(orange);
		int j1,j2;
		int seconds=0;
		Iterator itr=pq.iterator();
		while(!pq.isEmpty())
		{
			j1=0;
			j2=0;
			
			if(itr.hasNext())
				j1=pq.remove();
			
			if(itr.hasNext())
				j2=pq.remove();
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;
			}
			
			if(j2>0 && j1==0)
			{
				seconds+=j2;
				break;
			}
			
			if(j1>0 && j2>0)
			{
				seconds++;
				j1--;
				j2--;
			}
			
			if(j1>0)
				pq.add(j1);
			if(j2>0)
				pq.add(j2);
				
		}
		
		return seconds;
	}

}
