package set_interface;

import java.util.*;

public class SetPerformanceComparison {

    private static void testPerformance(Set<Integer> set, String setName, int dataSize) {
        long start, end;

        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            set.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(setName + " - Add: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            set.contains(i);
        }
        end = System.currentTimeMillis();
        System.out.println(setName + " - Contains: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            set.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println(setName + " - Remove: " + (end - start) + " ms");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        int dataSize = 1_000_000;

        testPerformance(new HashSet<>(), "HashSet", dataSize);
        testPerformance(new LinkedHashSet<>(), "LinkedHashSet", dataSize);
        testPerformance(new TreeSet<>(), "TreeSet", dataSize);
    }
}

