package org.example.exam230515;

import java.util.ArrayList;
import java.util.List;

public class Exam10CollectionList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");  // List는 중복된 원소를 허용합니다.

        System.out.println(list); // [Java, Python, Java]
    }
}