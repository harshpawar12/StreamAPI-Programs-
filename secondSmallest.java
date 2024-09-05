package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class secondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(5,10,2,3,4));
		System.out.println("sec List:");
		System.out.println(a1);
		System.out.println("secondSmallest in the List:");
		int secmax=a1.stream().sorted().skip(1).findFirst().get();
		System.out.println(secmax);

	}

}
