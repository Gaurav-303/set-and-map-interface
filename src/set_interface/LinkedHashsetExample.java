package set_interface;

import java.util.*;

public class LinkedHashsetExample {


    public static Set<String> removeDuplicates(List<String> items) {
        return new LinkedHashSet<>(items);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        Set<String> result = removeDuplicates(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
