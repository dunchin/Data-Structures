package com.company;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {

    public static void main(String[] args) {


        //elements Not ordered
        Set<Integer> set = new HashSet<Integer>() ;

        set.add(1) ;
        set.add(2) ;
        set.add(3) ;
        set.add(4) ;

        System.out.println(set);

        set.remove(4) ;

        System.out.println(set);

        System.out.println(set.contains(1));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
     }
}
