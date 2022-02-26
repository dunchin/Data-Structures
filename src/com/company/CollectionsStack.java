package com.company;

import java.util.Stack;

public class CollectionsStack {

    public static void main(String[] args) {

        Stack<String> animals = new Stack<String>() ;

        animals.push("Lion") ;
        animals.push("Tiger") ;
        animals.push("Horse") ;
        animals.push("Cat") ;

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals);

        System.out.println(animals.peek());



    }


}
