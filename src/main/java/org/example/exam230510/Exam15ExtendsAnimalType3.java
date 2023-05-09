package org.example.exam230510;

import org.example.exam230510.model.AnimalType3;
import org.example.exam230510.model.CatType3;
import org.example.exam230510.model.DogType3;

public class Exam15ExtendsAnimalType3 {
    public static void main(String[] args) {
        // 다형성을 보여주는 Animal 참조변수를 사용
        AnimalType3 myDog = new DogType3("흑시바", "시바");
        AnimalType3 myCat = new CatType3("메주", 7);

        myDog.eat();  // 오버라이딩된 메서드 사용
        myCat.eat();  // 오버라이딩된 메서드 사용
    }
}