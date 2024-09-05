package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListUppercase {
//Q6. Implement a program to convert a list of strings to uppercase using streams.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>(Arrays.asList("java","python","c","cpp"));
		System.out.println("original List:");
		System.out.println(al);
		System.out.println("making it uppercase:");
List<String> up=al.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
		System.out.println(up);
	}

}
