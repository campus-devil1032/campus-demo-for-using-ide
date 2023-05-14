package org.example.exam230515;

public class Exam05WhatIsReferenceType2 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        System.out.println("obj1 hash: " + System.identityHashCode(obj1)); // obj1의 해시코드 출력
        System.out.println("obj2 hash: " + System.identityHashCode(obj2)); // obj2의 해시코드 출력
        System.out.println("obj3 hash: " + System.identityHashCode(obj3)); // obj3의 해시코드 출력
    }
}