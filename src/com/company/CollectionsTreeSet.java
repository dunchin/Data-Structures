package com.company;

import java.util.TreeSet;

public class CollectionsTreeSet {

    public static void main(String[] args) {

        //Elements are sorted - O(log of n)

        TreeSet<Integer> set = new TreeSet<Integer>() ;

        set.add(2) ;
        set.add(1) ;
        set.add(-1) ;

        System.out.println(set) ;
        set.remove(1) ;

        System.out.println(set);

        System.out.println(set.contains(1));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
