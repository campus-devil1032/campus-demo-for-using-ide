package org.example.exam230510;


import org.example.exam230510.model.CatType2;
import org.example.exam230510.model.DogType2;

public class Exam14ExtendsAnimalType2 {
    public static void main(String[] args) {
        DogType2 myDogType2 = new DogType2("누렁이", "골든 리트리버");
        CatType2 myCatType2 = new CatType2("삼색이", 7);

        myDogType2.eat();  // 부모 클래스의 메서드 사용
        myDogType2.bark(); // 자신의 메서드 사용

        myCatType2.eat();  // 부모 클래스의 메서드 사용
        myCatType2.meow(); // 자신의 메서드 사용
    }
}