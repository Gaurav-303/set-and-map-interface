package custom_objects;

import java.util.Set;
import java.util.TreeSet;

public class MainApp {
    public static void main(String[] args) {
        Set<Person> set1 = new TreeSet<>();
        set1.add(new Person("Alice", 30));
        set1.add(new Person("Bob", 25));

        Set<Person> set2 = new TreeSet<>();
        set2.add(new Person("Bob", 25));
        set2.add(new Person("Charlie", 35));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Person> unionSet = PersonSetOperations.union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Person> differenceSet = PersonSetOperations.difference(set1, set2);
        System.out.println("Difference: " + differenceSet);
    }
}
