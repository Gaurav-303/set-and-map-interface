package set_interface;

import java.util.*;

public class RemoveElementProblem {

    public static Set<Integer> removeLessThan(TreeSet<Integer> set, int threshold) {
        set.removeIf(n -> n < threshold);
        return set;
    }

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original Set: " + numbers);
        Set<Integer> result = removeLessThan(numbers, 3);

        System.out.println("After removing < 3: " + result);
    }
}

