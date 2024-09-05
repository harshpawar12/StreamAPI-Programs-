package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LongestString {

	
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList("java", "c", "cpp", "python"));
        System.out.println("Original List:");
        System.out.println(a1);
        System.out.println("Finding the longest string:");

        String longestString = a1.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest string: " + longestString);
    }
}
