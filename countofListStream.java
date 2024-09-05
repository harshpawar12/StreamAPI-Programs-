package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class countofListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("count of list number:");
		System.out.println(a.stream().count());

	}

}
