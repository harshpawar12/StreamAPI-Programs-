package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,3,2,11,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("removing the Distict:");
		List b=a.stream().distinct().toList();
		System.out.println(b);

	}

}
