package org.example.exam230515;


import org.example.exam230515.model.Exam03PersonType2;

public class Exam03ObjectEqualsType2 {
    public static void main(String[] args) {
        Exam03PersonType2 exam03PersonType1 = new Exam03PersonType2("John", 25);
        Exam03PersonType2 exam03PersonType2 = new Exam03PersonType2("John", 25);

        System.out.println(exam03PersonType1.equals(exam03PersonType2)); // true를 출력
    }
}
