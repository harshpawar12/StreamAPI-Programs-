package StreamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringEmptyRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String >al=new LinkedList(Arrays.asList("java","c#"," ","kive"));
	
	List a=al.stream().filter(i->!i.equals(" ")).toList();
	System.out.println(a);

	}

}
