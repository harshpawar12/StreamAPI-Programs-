package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UppercaseMakeStream {
/*
 * Q6. Implement a program to convert a list 
 * of strings to uppercase using streams.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a=new ArrayList(Arrays.asList("java","cpp","c#","python"));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("making uppercase:");
		List<String> b=a.stream().map(i->i.toUpperCase()).toList();
		System.out.println(b);

	}

}
