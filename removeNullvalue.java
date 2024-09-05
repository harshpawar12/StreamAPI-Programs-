package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeNullvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>a=new ArrayList(Arrays.asList(11,4,7,90,45,67,null,null));
		System.out.println("Original List:");
		System.out.println(a);
		System.out.println("Remove the null value:");
		List b=a.stream().filter(i->i!=null).toList();
		System.out.println(b);

	}

}
