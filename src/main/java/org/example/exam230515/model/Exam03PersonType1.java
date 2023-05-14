package org.example.exam230515.model;

public class Exam03PersonType1 {
    private String name;
    private int age;

    public Exam03PersonType1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // obj가 Person의 인스턴스인지 확인
        if (obj instanceof Exam03PersonType1) {
            Exam03PersonType1 otherExam03PersonType1 = (Exam03PersonType1) obj;
            // 이름과 나이가 동일한 경우 true를 반환
            return this.name.equals(otherExam03PersonType1.name) && this.age == otherExam03PersonType1.age;
        }
        return false; // obj가 Person의 인스턴스가 아니거나 이름과 나이가 동일하지 않은 경우 false를 반환
    }
}