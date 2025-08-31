package map_interface;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "programming";  // you can take user input too
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies: " + freqMap);
    }
}

