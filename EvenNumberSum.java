package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberSum {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>al=new ArrayList(Arrays.asList(1,2,3,4,45,6));
		System.out.println("original List:");
		System.out.println(al);
		int a=al.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		System.out.println("sum of Even number:");
		System.out.println(a);
		
		
	}

}
