package org.example.exam230510;

import java.util.ArrayList;

// 부모 클래스 Animal 정의
class Animal {
    static final int ANIMAL_LEG_NUMBER = 4;

    // final 키워드를 사용하여 오버라이드를 막은 메서드
    final void eat() {
        System.out.println("Animal is eating...");
    }
}

// Dog 클래스는 Animal 클래스를 상속
class Dog extends Animal {
    // Animal 클래스의 eat 메서드는 final로 선언되었기 때문에 오버라이드할 수 없음
    // 아래 코드는 컴파일 에러를 발생시킴
    /*
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }
    */
}

public class Exam16ExtendsAnimalType4WithFinalMethod {

    public static void main(String[] args) {

        final int x = 10; // x는 이후에 변경할 수 없습니다.
        final ArrayList<String> list = new ArrayList<>(); // list 참조는 변경할 수 없지만,
        list.add("hello"); // list가 참조하는 객체의 상태는 변경할 수 있습니다.

        // Dog 클래스의 인스턴스 생성
        Dog myDog = new Dog();
        myDog.eat();  // Animal 클래스의 eat 메서드 호출
    }
}
