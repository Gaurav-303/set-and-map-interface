package custom_objects;

import java.util.Set;
import java.util.TreeSet;

public class PersonSetOperations {

    public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
        Set<Person> result = new TreeSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
        Set<Person> result = new TreeSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
