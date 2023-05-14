package org.example.exam230515.model;

public class Exam07PersonType2 {
    private String name;
    private int age;

    public Exam07PersonType2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "~~~~ Exam07Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} ~~~";
    }
}