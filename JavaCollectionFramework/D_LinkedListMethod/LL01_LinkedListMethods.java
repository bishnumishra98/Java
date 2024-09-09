// Linked list in Java are doubly linked list.
// All methods of ArrayList mentioned in 'C_ArrayListMethods\L02_ArrayListMethods.java' are also applicable for LinkedList,
// except ensureCapacity().

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LL01_LinkedListMethods {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
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

        // 7. indexOf(): Returns the index of an element in list
        System.out.println(l1.indexOf(10));   // o/p: 2

        // 8. lastIndexOf(): Returns index of last occurrence of an element in list. If element is not present, it returns -1. 
        System.out.println(l1.lastIndexOf(30));   // o/p: 1

        // 9. addFirst()
        l1.addFirst(50);
        System.out.println(l1);   // o/p: [50, 200, 30, 10]
        
        // 10. addLast()
        l1.addLast(60);
        System.out.println(l1);   // o/p: [50, 200, 30, 10, 60]

        // 11. getFirst()
        System.out.println(l1.getFirst());   // o/p: 50

        // 12. getLast()
        System.out.println(l1.getLast());   // o/p: 60

        // 13. removeFirst()
        l1.removeFirst();
        System.out.println(l1);   // o/p: [200, 30, 10, 60]

        // 14. removeLast()
        l1.removeLast();
        System.out.println(l1);   // o/p: [200, 30, 10]
    }
}
