package org.example.exam230515;


import org.example.exam230515.model.Exam03PersonType2;

public class Exam03ObjectEqualsType2 {
    public static void main(String[] args) {
        Exam03PersonType2 Exam03PersonType21 = new Exam03PersonType2("John", 25);
        Exam03PersonType2 Exam03PersonType22 = new Exam03PersonType2("John", 25);

        System.out.println(Exam03PersonType21.equals(Exam03PersonType22)); // true를 출력
    }
}