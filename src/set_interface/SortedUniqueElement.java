package set_interface;

import java.util.*;

public class SortedUniqueElement{

    // Method to return unique sorted elements
    public static Set<Integer> getSortedUnique(List<Integer> numbers) {
        return new TreeSet<>(numbers);  // TreeSet handles both uniqueness + sorting
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 2, 9, 1, 2, 9);

        Set<Integer> result = getSortedUnique(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}

