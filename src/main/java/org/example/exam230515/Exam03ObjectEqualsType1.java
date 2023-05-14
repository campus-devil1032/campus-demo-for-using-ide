package org.example.exam230515;


import org.example.exam230515.model.Exam03PersonType1;

// equals()를 재정의하여 객체의 참조를 비교하지 않고 객체가 논리적으로 동일 한지를 비교한다.
public class Exam03ObjectEqualsType1 {
    public static void main(String[] args) {
        Exam03PersonType1 exam03PersonType11 = new Exam03PersonType1("John", 25);
        Exam03PersonType1 exam03PersonType12 = new Exam03PersonType1("John", 25);

        System.out.println(exam03PersonType11.equals(exam03PersonType12)); // true를 출력
    }
}