package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortStringAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>(Arrays.asList("java","python","c","cpp"));
		System.out.println(al);
		System.out.println("making in asecnding order.");
		List <String> so=al.stream().sorted().toList();
		System.out.println(so);
		


	}

}
