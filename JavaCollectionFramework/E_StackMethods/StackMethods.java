// Stack follows LIFO property

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        // 1. Creation of a stack
        Stack<Integer> st = new Stack<>();

        // 2. push()
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);   // o/p: [10, 20, 30]

        // 3. pop()
        st.pop();
        System.out.println(st);   // o/p: [10, 20]

        // 4. peek()
        System.out.println(st.peek());   // o/p: 20

        // 5. search(): Returns the index of element in stack based on 1 based indexing, i.e., the topmost element of stack has index of 1,
        //              followed by 2, 3 and so on. If element not found, it returns -1.
        System.out.println(st.search(20));   // o/p: 1
        System.out.println(st.search(10));   // o/p: 2
        System.out.println(st.search(15));   // o/p: -1
    }
}
