package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class concatListTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,11,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		ArrayList<Integer>b=new ArrayList<Integer>(Arrays.asList(100,200,300));
		System.out.println("concat two List:");
		System.out.println(" "+Stream.concat(a.stream(), b.stream()).toList());
		

	}

}
