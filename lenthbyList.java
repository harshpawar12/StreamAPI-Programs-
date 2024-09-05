package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class lenthbyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList(Arrays.asList("java","c++","Python","cpp"));
		System.out.println("List are:");
		System.out.println(al);
		System.out.println("Lenght of List:");
System.out.println(al.stream().sorted((a,b)->a.length()-b.length()).toList());
	}

}
