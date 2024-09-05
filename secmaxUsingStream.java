package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class secmaxUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,2,3,4));
		System.out.println("List are:");
		System.out.println(al);
		
		
		System.out.println("Descending order is:");
		List<Integer> l=al.stream().sorted((a,b)->b-a).toList();
		System.out.println(l);
		System.out.println("secmax are:");
		int a=l.stream().skip(1).findFirst().get();
		System.out.println(a);
		
		
	


	}

}
