package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumber {
	/*
	 * Q3. Write a method that takes a list of
	 *  doubles as input and returns the average 
	 *  of the numbers in the list. Use the Stream 
	 *  API to solve this problem.
	 */
	
	public static double isAverge(List<Integer> al)
	{
		
		double d=al.stream().mapToDouble(i->i).average().getAsDouble();
			
				return d;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList(Arrays.asList(12,34,12,56,78));
		System.out.println("average of List Element:");
		System.out.println(isAverge(al));
	}

}
