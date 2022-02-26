package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<String>(Comparator.reverseOrder()) ;

        pq.add("Pankaj") ;
        pq.add("Anil") ;
        pq.add("Rajesh") ;

        System.out.println(pq);

        pq.poll() ;

        System.out.println(pq);

        System.out.println(pq.peek());




    }
}
