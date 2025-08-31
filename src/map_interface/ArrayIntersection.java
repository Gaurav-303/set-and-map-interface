package map_interface;

import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (map.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}

