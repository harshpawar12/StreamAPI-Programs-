package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secminUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,2,3,4));
		System.out.println(al);
		System.out.println("secmin in List");
		int secmin=al.stream().sorted().skip(1).findFirst().get();
		System.out.println(secmin);
		


	}

}
