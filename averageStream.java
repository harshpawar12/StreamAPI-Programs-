package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class averageStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Average in List:");
		double b=a.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println(b);

	}

}
