package day5;

import java.util.Arrays;

public class AnagramStringDemo {

	public static void main(String[] args) {
		String str1="listeny";
		String str2="silent";
		
		
		char[] arr1=str1.toCharArray(); //['l','i','s','t','e','n']
		char[] arr2=str2.toCharArray(); //['s','i','l','e','n','t']
		
		Arrays.sort(arr1);  //['e','i','l','n','s','t']
		Arrays.sort(arr2);  //['e','i','l','n','s','t']
		
		String newstr1=new String(arr1);  // "eilnst"
		String newstr2=new String(arr2);  // "eilnst"
		
		if(newstr1.equals(newstr2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}

}
