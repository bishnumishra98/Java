// Set is a data structure that stores only unique elements

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        // 1. Creating a set using HashSet
        Set<Integer> set = new HashSet<>();
        Set<Integer> anotherSet = new HashSet<>();

        // 2. add(): adds the specified element to the set
        set.add(5);
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set);   // o/p: [20, 5, 10]
        anotherSet.add(20);
        anotherSet.add(20);
        anotherSet.add(30);
        anotherSet.add(30);
        System.out.println(anotherSet);   // o/p: [20, 30]

        // 3. addAll(): adds all the elements from the specified collection to the set
        set.addAll(anotherSet);
        System.out.println(set);   // o/p: [20, 5, 10, 30]

        // 4. size(): returns the number of elements in the set
        System.out.println(set.size());   // o/p: 4

        // 5. remove(): removes the specified element from the set
        set.remove(5);
        System.out.println(set);   // o/p: [20, 10, 30]

        // 6. removeAll(): removes all elements that are present in the specified collection from the set
        set.removeAll(anotherSet);
        System.out.println(set);   // o/p: [10]

        // 7. retainAll(): retains only the elements in this set that are contained in the specified collection
        set.add(30);
        set.add(40);
        anotherSet.add(30);   // adding common element for testing retainAll()
        set.retainAll(anotherSet);
        System.out.println("Set after retaining common elements with anotherSet: " + set);   // o/p: [30]

        // 8. contains(): checks if the set contains the specified element
        System.out.println(set.contains(30));   // o/p: true

        // 9. containsAll(): checks if the set contains all elements of the specified collection
        System.out.println(set.containsAll(anotherSet));   // o/p: false

        // 10. hashCode(): returns the hash code value for the set
        System.out.println(set.hashCode());   // o/p: 30

        // 11. clear(): removes all elements from the set
        set.clear();
        System.out.println(set);   // o/p: []
    }
}
