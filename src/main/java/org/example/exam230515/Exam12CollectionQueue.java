package org.example.exam230515;

import java.util.*;

public class Exam12CollectionQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("Python");
        queue.add("JavaScript");

        System.out.println(queue.poll()); // Java
        System.out.println(queue.poll()); // Python
        System.out.println(queue.poll()); // JavaScript
    }
}