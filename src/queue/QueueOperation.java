package queue;

import java.util.*;
public class QueueOperation {

    public static void main(String[] args) throws IllegalStateException{


    // Queue<Integer> q = new LinkedList<Integer>();
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("queue size: " + q.size());
        System.out.println("queue is empty or not : " + q.isEmpty());
        System.out.println("queue : " + q);


        System.out.println("peak element :" + q.peek());
        System.out.println("poll element after remove : " + q.poll());
        System.out.println("peek element : " + q.peek());
    }
}
