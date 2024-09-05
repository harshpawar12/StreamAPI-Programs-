package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		
		System.out.println("printing the Even in List:");
	List b=a.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(b);
		
	}

}
