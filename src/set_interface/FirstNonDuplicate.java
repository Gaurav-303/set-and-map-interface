package set_interface;

import java.util.*;

public class FirstNonDuplicate {

    public static Integer findFirstNonDuplicate(List<Integer> numbers) {
        Set<Integer> seenOnce = new LinkedHashSet<>();
        Set<Integer> seenMultiple = new HashSet<>();

        for (int num : numbers) {
            if (seenMultiple.contains(num)) {
                continue;
            }
            if (seenOnce.contains(num)) {
                seenOnce.remove(num);
                seenMultiple.add(num);
            } else {
                seenOnce.add(num);
            }
        }

        // First element in seenOnce is the answer
        if (!seenOnce.isEmpty()) {
            return seenOnce.iterator().next();
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        System.out.println("Input: " + input);
        System.out.println("First non-duplicate: " + findFirstNonDuplicate(input));
    }
}

