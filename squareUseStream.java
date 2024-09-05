package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class squareUseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,2,3,45,67));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Square of List elemnt:");
		List <Integer>b=a.stream().map(i->i*i).toList();
		System.out.println(b);

	}

}
