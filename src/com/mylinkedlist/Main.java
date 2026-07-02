/**
 *  Java program to use addLast() method of LinkedList.
 */

package com.mylinkedlist;

import java.util.LinkedList;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating LinkedList object.
        LinkedList<String> myList = new LinkedList<>();

        // Adding elements myList.
        myList.add("Autumn");
        myList.addFirst("Summer");
        myList.add("Winter");
        myList.addLast("Spring");

        // Printing elements of myList to console.
        System.out.println("List : " + myList); // Output: List : [Summer, Autumn, Winter, Spring]

    }
}