package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassss {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>() ;

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
        System.out.println(Collections.frequency(arr, 4));
        Collections.sort(arr);
        System.out.println(arr) ;


    }
}
