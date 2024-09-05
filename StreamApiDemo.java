package StreamAPI;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,2,3,4));
		System.out.println("filtre using Even numbers:");

		List b=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(b);
		System.out.println("filtre using odd numbers:");
		List c=al.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println(c);
		System.out.println("Distict method");
		List De=al.stream().distinct().collect(Collectors.toList());
		System.out.println(De);
		System.out.println("Even number and there square:using map");
		List EvenSq=al.stream().filter(i->i%2==0).map(i->i*i).toList();
		System.out.println(EvenSq);
		System.out.println("Odd number and there square:using map");
		List ODDSq=al.stream().filter(i->i%2==1).map(i->i*i).toList();
		System.out.println(ODDSq);
		System.out.println("sum of all element in List:");
		System.out.println(al.stream().mapToInt(i->i).sum());
		System.out.println("Average of all element in List:");
		Double avg=al.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println(avg);
		System.out.println("maximum in  List:");
		int max=al.stream().mapToInt(i->i).max().getAsInt();
		System.out.println(max);
		System.out.println("minimum in  List:");
		int min=al.stream().mapToInt(i->i).min().getAsInt();
		System.out.println(min);
		
	}

}
