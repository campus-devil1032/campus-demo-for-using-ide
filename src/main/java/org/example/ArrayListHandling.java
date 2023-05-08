package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println("정렬 전: " + list);
        Collections.sort(list);
        System.out.println("정렬 후: " + list);
    }
}
