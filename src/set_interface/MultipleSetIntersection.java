package set_interface;

import java.util.*;

public class MultipleSetIntersection {

    public static Set<Integer> intersectionOfSets(List<Set<Integer>> sets) {
        if (sets == null || sets.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> result = new HashSet<>(sets.get(0));

        for (int i = 1; i < sets.size(); i++) {
            result.retainAll(sets.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);

        System.out.println("Input: " + sets);
        System.out.println("Intersection: " + intersectionOfSets(sets));
    }
}

