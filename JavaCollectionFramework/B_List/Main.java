import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List interface
        ArrayList<Integer> arr = new ArrayList<>();

        // 1. add()
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);   // o/p: [10, 20, 30]

        // 2. size()
        System.out.println(arr.size());   // o/p: 3

        // 3. remove()
        arr.remove(1);   // removes element at 1st index from arr
        System.out.println(arr);   // o/p: [10, 30]

        // 4. iterator()
        
        
    }
}
