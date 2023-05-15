package org.example.exam230515;

// A 클래스는 print() 메서드를 가진 부모 클래스입니다.
class A {
	public void print() {
		System.out.println("A");
	}
}

// B 클래스는 A 클래스를 상속받아 print() 메서드를 오버라이드합니다.
class B extends A {
	@Override
	public void print() {
		System.out.println("B");
	}
}

// C 클래스도 A 클래스를 상속받아 print() 메서드를 오버라이드합니다.
class C extends A {
	@Override
	public void print() {
		System.out.println("C");
	}
}

// D 클래스는 B 클래스와 C 클래스를 상속받습니다.
// 하지만 자바에서는 다중 상속을 지원하지 않으므로 컴파일 오류가 발생합니다.
//class D extends B, C {
//
//    // 아래 print() 메서드는 누구에게서 받은 확장시킨 함수인가? 라는게 다이아몬드 상속 문제입니다.
//    @Override
//    public void print() {
//
//        System.out.println("C? D?");
//    }
//}

// Main 클래스에서 D 클래스의 인스턴스를 생성하고 print() 메서드를 호출합니다.
public class Exam01DiamondProblem {
	public static void main(String[] args) {
		// 다중 상속을 지원하지 않으므로, 아래 코드는 컴파일 오류가 발생합니다.
		// D d = new D();
		// d.print();
	}
}