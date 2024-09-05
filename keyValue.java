package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class keyValue {
	/*
	 * Q5. Write a method that takes a list of Student 
	 * objects as input, where each Student has a name and a grade. 
    The method should return a map where the keys
     are the distinct grades and the values are lists 
     of students who have that grade. Use the Stream API 
     to solve this problem.
A list of Student objects:
Student("Alice", "A")
Student("Bob", "B")
Student("Charlie", "A")
Student("David", "C")
Student("Eve", "B")
Output:
A map with grades as keys and lists of students as values:
"A" -> ["Alice", "Charlie"]
"B" -> ["Bob", "Eve"]
"C" -> ["David"]
*/
	
	
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add("java");
		al.add("kava");
		al.add("Bio");
		al.add("C++");
	
		
		ArrayList al1=new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("A");
		al1.add("D");
		
		al.addAll(al1);
		//Collections.addAll(al, al1);
		System.out.println(al1);
		
		
		
	
			
		
	}

}
