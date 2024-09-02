import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import  java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(1);  // Queue: [1]
        q.add(2);  // Queue: [1, 2]

        // offer is similar to add; it adds the element to the queue
        q.offer(15);  // Queue: [1, 2, 15]
        q.offer(16);  // Queue: [1, 2, 15, 16]
        q.add(3);  // Queue: [1, 2, 15, 16, 3]

        // Printing the current queue
        System.out.println(q);  // Output: [1, 2, 15, 16, 3]

        // Removing and printing the head of the queue
        System.out.println(q.poll());  // Output: 1, Queue: [2, 15, 16, 3]

        // Printing the head of the queue without removing it
        System.out.println(q.peek());  // Output: 2, Queue: [2, 15, 16, 3]

        // Removing and printing the head of the queue
        System.out.println("remove " + q.remove());  // Output: remove 2, Queue: [15, 16, 3]

        // Printing the head of the queue without removing it
        System.out.println(q.peek());  // Output: 15, Queue: [15, 16, 3]

        // Removing and printing the head of the queue
        System.out.println(q.poll());  // Output: 15, Queue: [16, 3]

        // TODO: ArrayDequeue
        Deque<Integer> aqd=new ArrayDeque<>();
        aqd.addFirst(1);
        aqd.addFirst(2);
        aqd.add(3);
        aqd.offer(4);
        aqd.offerLast(10);
        aqd.offerFirst(20);

        System.out.println(aqd);

        aqd.poll();
        System.out.println(aqd);

        aqd.pollFirst();
        System.out.println(aqd);

        aqd.pollLast();
        System.out.println(aqd);


        // Priority  Queue
        // minimum top pe rhega hmesha
        PriorityQueue<Integer> pq=new  PriorityQueue<>();
        pq.offer(11);
        pq.offer(2);
        pq.offer(12);
        pq.offer(3);
        pq.add(13);

        System.out.println(pq);
        System.out.println(pq.peek());
        // max heap
        PriorityQueue<Integer> pq2=new  PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(1);
        pq2.offer(11);
        pq2.offer(14);
        pq2.offer(2);

        System.out.println(pq2);

    }
}
