// A convenient way to create a heap in Java is by using priority queue.
// By default, a min-heap is created using priority queue.

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapMethods {
    public static void main(String[] args) {
        // Create a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements into the heap
        minHeap.offer(10);
        minHeap.offer(5);
        minHeap.offer(20);
        minHeap.offer(1);

        // Display the heap's minimum element
        System.out.println("Min element: " + minHeap.peek());

        // Remove elements (this will remove the minimum element each time)
        while (!minHeap.isEmpty()) {
            System.out.println("Removed: " + minHeap.poll());
        }

        // ---------------------------------------------------------------------------------

        // Create a PriorityQueue with a custom comparator for Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements into the Max-Heap
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(20);
        maxHeap.offer(1);

        // Display the heap's maximum element
        System.out.println("Max element: " + maxHeap.peek());

        // Remove elements from the heap (this will remove the maximum element each time)
        while (!maxHeap.isEmpty()) {
            System.out.println("Removed: " + maxHeap.poll());
        }
    }
}
