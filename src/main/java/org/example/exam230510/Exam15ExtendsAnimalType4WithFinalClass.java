package org.example.exam230510;

// final 키워드를 사용하여 상속을 막은 클래스
final class FinalAnimal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// FinalAnimal 클래스는 final로 선언되었기 때문에 상속받을 수 없음
// 아래 코드는 컴파일 에러를 발생시킴
/*
class Dog extends FinalAnimal {
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }
}
*/

public class Exam15ExtendsAnimalType4WithFinalClass {
    public static void main(String[] args) {
        // final 클래스의 인스턴스 생성 가능
        FinalAnimal myAnimal = new FinalAnimal();
        myAnimal.eat();
    }
}