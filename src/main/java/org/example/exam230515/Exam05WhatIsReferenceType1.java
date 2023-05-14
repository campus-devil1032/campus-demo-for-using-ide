package org.example.exam230515;


import org.example.exam230515.model.Exam05Dog;

public class Exam05WhatIsReferenceType1 {
    public static void main(String[] args) {
        Exam05Dog myDog = new Exam05Dog("Fido"); // myDog 변수는 새로 생성된 Dog 객체를 참조합니다.
        myDog.bark(); // 참조를 통해 Dog 객체의 메서드를 호출합니다.

        Exam05Dog anotherDog = myDog; // anotherDog 변수도 같은 Dog 객체를 참조합니다.
        anotherDog.bark(); // 이것 역시 참조를 통해 Dog 객체의 메서드를 호출합니다.

        System.out.println(myDog == anotherDog); // 두 변수가 같은 객체를 참조하므로, 이는 true를 출력합니다.
    }
}