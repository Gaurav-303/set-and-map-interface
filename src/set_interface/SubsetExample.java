package set_interface;

import java.util.*;

public class SubsetExample {

    public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
        return setB.containsAll(setA);
    }

    public static void main(String[] args) {
        Set<Integer> hashSetA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> hashSetB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("HashSet subset: " + isSubset(hashSetA, hashSetB));

        Set<Integer> linkedSetA = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> linkedSetB = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("LinkedHashSet subset: " + isSubset(linkedSetA, linkedSetB));

        Set<Integer> treeSetA = new TreeSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> treeSetB = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("TreeSet subset: " + isSubset(treeSetA, treeSetB));
    }
}

