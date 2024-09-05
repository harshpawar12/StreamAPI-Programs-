package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commaSeprater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList(Arrays.asList("java","c++","Python","cpp"));
		

System.out.println(al.stream().map(i->i).collect(Collectors.joining("k")).toString());
	}

}
