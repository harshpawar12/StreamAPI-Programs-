package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Max in List:");
		 int max=a.stream().mapToInt(i->i).max().getAsInt();
		 System.out.println(max);

	}

}
