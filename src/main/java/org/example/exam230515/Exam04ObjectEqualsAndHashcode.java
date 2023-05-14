package org.example.exam230515;

import org.example.exam230515.model.Exam04Employee;
import org.example.exam230515.model.Exam04Person;

import java.util.HashSet;
import java.util.Set;

public class Exam04ObjectEqualsAndHashcode {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        Exam04Person p1 = new Exam04Person("Alice", 20);
        Exam04Person p2 = new Exam04Person("Alice", 20);
        Exam04Person p3 = new Exam04Person("Bob", 30);

        Exam04Employee e1 = new Exam04Employee("Charlie", 25, "IT");
        Exam04Employee e2 = new Exam04Employee("Charlie", 25, "Sales");
        Exam04Employee e3 = new Exam04Employee("David", 35, "HR");

        // Person 객체를 HashSet 컬렉션에 추가합니다.
        set.add(p1);
        set.add(p2);
        set.add(p3);

        // Employee 객체를 HashSet 컬렉션에 추가합니다.
        set.add(e1);
        set.add(e2);
        set.add(e3);

        // HashSet 컬렉션에 있는 모든 객체를 출력합니다.
        for (Object obj : set) {
            System.out.println(obj);
        }

        // 위의 for문과 아래의 while문은 같다.
        // while (iterator.hasNext()) {
        //     Object obj = iterator.next();
        //     System.out.println(obj);
        // }

        // HashSet 컬렉션에서 Person 객체를 검색합니다.
        Exam04Person p = new Exam04Person("Alice", 20);
        if (set.contains(p)) {
            System.out.println("set에서 값 찾음. Person " + p);
        }
    }
}