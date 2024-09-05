package StreamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lengthGreater5 {
/*
 * Given a list of strings, write a program to 
 * filter out strings that have a length greater than 5.
Filter Numbers Greater Than a Value:
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String>al=new LinkedList(Arrays.asList("java","harsh","killer","c"));
	
	List a=al.stream().filter(i->i.length()>5).toList();
	System.out.println(a);
	
		

	}

}
