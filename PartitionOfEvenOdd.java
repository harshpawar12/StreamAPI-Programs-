package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOfEvenOdd {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(5, 10, 2, 3, 4));
        System.out.println("Original List:");
        System.out.println(a1);
        System.out.println("Partitioning the List into Even & Odd numbers");

       
      
        Map<Boolean, List<Integer>>b= a1.stream().collect(Collectors.partitioningBy(i->i%2==0));
        List<Integer>EvenNumber=b.get(true);
        List<Integer>Oddnumber=b.get(false);
        System.out.println(EvenNumber+" "+Oddnumber);
    }
}
