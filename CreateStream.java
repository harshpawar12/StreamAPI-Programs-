package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList a=new ArrayList(Arrays.asList(11,2,3,45,67));
	System.out.println("Original List:");
	System.out.println(a);
	
	List b=a.stream().toList();
	System.out.println("Using the Stream:");
	System.out.println(b);
	
	

	}

}
