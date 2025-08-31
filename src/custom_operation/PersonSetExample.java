package custom_operation;


import java.util.*;

public class PersonSetExample {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30)); // duplicate, won't be added

        System.out.println("People in set: " + people);

        Person checkPerson = new Person("Alice", 30);
        System.out.println("Contains Alice(30)? " + people.contains(checkPerson));
    }
}
