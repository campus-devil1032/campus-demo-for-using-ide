package org.example.exam230515.model;

// Animal 클래스를 상속받은 Dog 클래스
public class Exam08Dog extends Exam08Animal {
	// 추상 메서드 구현
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}
