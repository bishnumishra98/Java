// Note that methods of Collection interface apply to all child interfaces of it.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        // Creating an ArrayList object which belongs to List interface, which belongs to Collection interface.
        ArrayList<Integer> arr1 = new ArrayList<>();

        // 1. add()
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1);   // o/p: [10, 20, 30]

        // 2. size()
        System.out.println(arr1.size());   // o/p: 3

        // 3. remove()
        arr1.remove(1);   // removes element at 1st index from arr1
        System.out.println(arr1);   // o/p: [10, 30]

        // 4. addAll()
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.addAll(arr1);
        System.out.println(arr2);   // o/p: [1, 2, 3, 10, 30]

        // 5. clear()
        arr1.clear();
        System.out.println(arr1);   // o/p: []

        // 6. iterator()
        Iterator<Integer> it = arr2.iterator();   // declaring an iterator 'it' of type Integer
        while(it.hasNext()) {   // hasNext() returns true if next element is present in list, and then advances the iterator to next element
            System.out.print(it.next() + " ");   // next() returns the current element and advances the iterator to next element
        }
    }
}
