package org.example.exam230515;

import org.example.exam230515.model.Exam06Animal;
import org.example.exam230515.model.Exam06Dog;

public class Exam06GetClassType2 {
	public static void main(String[] args) {
		Exam06Animal myDog = new Exam06Dog();
		System.out.println(myDog.getClass().getName()); // myDog 객체의 클래스 이름 출력

		Exam06Animal myAnimal = new Exam06Animal();
		System.out.println(myAnimal.getClass().getName()); // myAnimal 객체의 클래스 이름 출력
	}
}