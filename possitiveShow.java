package StreamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class possitiveShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList<Integer>al=new LinkedList<Integer>(Arrays.asList(1,-1,4,-6,-67,100));
	
	List a=al.stream().filter(i->i>0).toList();
	System.out.println(a);

	}

}
