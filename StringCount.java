package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCount {
	/*
	 * Q2. Write a method that takes a sentence 
	 * as input and returns the count of words in
	 *  the sentence. Assume that words are separated
	 *   by spaces. Use the Stream API to solve this problem.
	 */
	public static void main(String[] args) {
		
		String s1="java is simple language";
		
		String s2[]=s1.split(" ");
		
		List al=new ArrayList<>(Arrays.asList(s2));
		System.out.println("count of word");
		System.out.println(al.stream().filter(i->i!=" ").count());
	
		
		
		
		
		
	}

}
