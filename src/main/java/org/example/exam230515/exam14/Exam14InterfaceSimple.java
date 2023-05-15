package org.example.exam230515.exam14;

// 인터페이스 정의
interface Animal {
    boolean THIS_IS_VERY_IMPORTANT_BOOLEAN = true;

    void makeSound(); // 인터페이스 메서드 (본체가 없습니다)
}

// 인터페이스를 구현하는 클래스 정의
class Cat implements Animal {
    // 인터페이스에서 정의된 메서드를 구현합니다
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog implements Animal {
    // 인터페이스에서 정의된 메서드를 구현합니다
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Exam14InterfaceSimple {

    public static void main(String[] args) {
        Cat myCat = new Cat(); // Cat 객체 생성
        Dog myDog = new Dog(); // Dog 객체 생성

        myCat.makeSound(); // Meow
        myDog.makeSound(); // Woof
    }
}