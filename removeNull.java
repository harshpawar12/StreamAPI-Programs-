package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,2,3,4));
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println("removed null value:");
		List l=al.stream().filter(i->i!=null).toList();
		System.out.println(l);


	}

}
