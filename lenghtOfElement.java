package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lenghtOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList("java","c","cpp","python"));
        System.out.println("Original List:");
        System.out.println(a1);
        System.out.println("Lenght of Group:");
        List <String> b=a1.stream().sorted().toList();
        System.out.println(b);
        

	}

}
