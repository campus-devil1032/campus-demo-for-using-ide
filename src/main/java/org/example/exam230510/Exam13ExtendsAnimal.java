package org.example.exam230510;


import org.example.exam230510.model.Cat;
import org.example.exam230510.model.Dog;

public class Exam13ExtendsAnimal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();  // 부모 클래스의 메서드 사용
        myDog.bark(); // 자신의 메서드 사용

        myCat.eat();  // 부모 클래스의 메서드 사용
        myCat.meow(); // 자신의 메서드 사용
    }
}