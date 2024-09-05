package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortAscStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a=new ArrayList(Arrays.asList("java","cpp","c#","python"));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Sorted order in List:");
		List <String> b=a.stream().sorted().toList();
		System.out.println(b);

	}

}
