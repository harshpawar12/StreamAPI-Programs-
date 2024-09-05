package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumEleStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Sum of Element:");
		int sum=a.stream().mapToInt(i->i).sum();
		System.out.println(sum);

	}

}
