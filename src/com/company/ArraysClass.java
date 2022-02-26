package com.company;

import java.sql.Array;
import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        int [] arr =  {1,2,3,4,5,6} ;

        int index = Arrays.binarySearch(arr , 1) ;

        System.out.println( index ) ;

        Arrays.sort(arr) ;

        Arrays.fill(arr , 12) ;

        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
