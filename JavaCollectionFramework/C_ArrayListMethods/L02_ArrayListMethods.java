package C_ArrayListMethods;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class L02_ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        // 1. get(i): returns element at ith index
        System.out.println(l1.get(1));   // o/p: 20

        // 2. set(i, element): sets element at ith index
        l1.set(1, 200);   // o/p: [10, 200, 30]
        System.out.println(l1);

        // 3. toArray(): coverts a collection into array
        Object[] arr = l1.toArray();   // every class in Java is either a direct or indirect subclass of the Object class
                                      // toArray() returns an array of type Object
        for(Object element: arr) {
            System.out.print(element + " ");   // o/p: 10 200 30
        }
        System.out.println();

        // 4. contains(): Returns true if element is present in list, else false
        System.out.println(l1.contains(30));   // o/p: true

        // 5. Collections.sort(): sorts a collection in ascending or desecnding order
        Collections.sort(l1);
        System.out.println(l1);   // o/p: [10, 30, 200]
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);   // o/p: [200, 30, 10]

        // 6. isEmpty(): Returns true if list is empty, else false
        System.out.println(l1.isEmpty());   // o/p: false

        // 7. ensureCapacity(): Ensures that the ArrayList has at least the specified capacity. This is beneficial to avoid the
        //                      overhead of resizing the ArrayList when adding more elements than its current capacity. If more
        //                      elements are added than the capacity specified, the ArrayList will still resize as needed.
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.ensureCapacity(100);   // ensures that the ArrayList can hold at least 100 elements
        l2.add(10);
        l2.add(12);
        l2.add(14);
        l2.add(16);
        System.out.println(l2);   // o/p: [10, 12, 14, 16]

        // 8. indexOf(): Returns the index of an element in list
        System.out.println(l2.indexOf(14));   // o/p: 2
    }
}
