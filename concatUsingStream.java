package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class concatUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println("First List:");
		System.out.println(al);
		ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(5,10,2,3,4));
		System.out.println("sec List:");
		System.out.println(a1);
		System.out.println("Concated List:");
	System.out.println(""+Stream.concat(al.stream(), a1.stream()).toList());



	}

}
