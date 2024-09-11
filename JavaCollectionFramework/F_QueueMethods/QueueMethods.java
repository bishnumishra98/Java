
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        // 1. Create a queue using LL (LinkedList, ArrayDequeue and PriorityQueue, all implement the Queue interface)
        Queue<Integer> q1 = new LinkedList<>();

        // 2. add(): Inserts an element into the queue. If the task is successful, it returns true, else throws an exception.

        // 3. offer(): Inserts an element into the queue. If the task is successful, it returns true, else false
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println(q1);   // o/p: [10, 20, 30]

        // 4. element(): Returns the head of queue. Throws an exception if the queue is empty.

        // 5. peek(): Returns the head of queue. Returns null if queue is empty.
        System.out.println(q1.peek());   // o/p: 10

        // 6. remove(): Returns head of queue and then removes the head. Throws an exception if queue is empty.

        // 7. poll(): Returns head of queue and then removes the head. Returns null if the queue is empty.
        System.out.println(q1.poll());   // o/p: 10, then it removes 10 from queue
        System.out.println(q1);   // o/p: [20, 30]

        // DEQUEUE: In dequeue, functions like addFirst(), addLast(), removeFirst(), removeLast(),
        //          offerFirst(), offerLast(), peekFirst(), peekLast(), etc will work.
    }
}
