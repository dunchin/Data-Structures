package collections;

import java.util.ArrayDeque;

public class CollectionArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> pq = new ArrayDeque<Integer>() ;

        pq.offer(1) ;
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offerFirst(6);
        pq.offerLast(7);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.pollFirst());

        System.out.println(pq.pollLast());

        System.out.println(pq);










    }
}
