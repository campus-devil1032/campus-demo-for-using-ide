package org.example.exam230510.model;

// Student 클래스 정의
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
