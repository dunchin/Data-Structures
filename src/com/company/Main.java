package com.company;

import java.util.ArrayList;
import java.util.Iterator;

class LearnCollections {

    public static void main(String[] args) {
        // ArrayList - add method
        ArrayList<String > Students = new ArrayList<String>() ;
        Students.add("P") ;
        Students.add("Dogra") ;
        Students.add("P") ;


        System.out.println("Students: " + Students);
        Students.add(1, "Pankaaj");
        // -addAll - method
        System.out.println( "Updated: " + Students);


        ArrayList<String> list = new ArrayList<String>() ;
        list.add("Harshit") ;

        Students.addAll(list) ;

        System.out.println("Students + list by addAll Method : " + Students) ;
        System.out.println(Students.get(0));

        Students.remove(0) ;

        System.out.println("After Removing 0th index by remove method: " + Students);


        //To remove a particular value i.e. String
        Students.remove(String.valueOf("Dogra")) ;
        System.out.println("After removing particular value: " + Students);

        Students.set(0, "Pankaj ") ;
        System.out.println(Students);

        System.out.println(Students.contains("Harshit") );

        // Clear method
        // Students.clear();
        // System.out.println("After Removing all elements " + Students );

        for(String element: Students)
        {
            System.out.println("For Method: " + element);
        }

        Iterator<String> it = Students.iterator()  ;
        while(it.hasNext())
        {
            System.out.println("Iterator : " + it.next());
        }




    }
}
