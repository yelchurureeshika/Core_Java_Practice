package Collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue <Integer> q=new PriorityQueue<>();

        q.offer(10);
        q.offer(20);
        q.add(30);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        Collections.addAll(q,40,50);
        System.out.println(q);

    }
}
