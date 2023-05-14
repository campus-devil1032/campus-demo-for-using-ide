package org.example.exam230515;

import java.util.HashSet;
import java.util.Set;

public class Exam11CollectionSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");  // Set은 중복된 원소를 허용하지 않습니다.

        System.out.println(set); // [Java, Python]
    }
}