package org.example.exam230515;

// A 클래스는 print() 메서드를 가진 부모 클래스입니다.
//class A {
//    public void print() {
//        System.out.println("A");
//    }
//}

// B 클래스도 print() 메서드를 가지고 있습니다.
//class B {
//    public void print() {
//        System.out.println("B");
//    }
//}

// C 클래스는 A 클래스와 B 클래스를 상속받습니다.
// 하지만 자바에서는 다중 상속을 지원하지 않으므로 컴파일 오류가 발생합니다.
//class C extends A, B {
//    @Override
//    public void print() {
//        // 이 함수는 어디서 확장한 것일까요? A? B?
//    }
//}

// Main 클래스에서 C 클래스의 인스턴스를 생성하고 print() 메서드를 호출합니다.
public class Exam02IncreaseComplexProblem {
    public static void main(String[] args) {
        // 다중 상속을 지원하지 않으므로, 아래 코드는 컴파일 오류가 발생합니다.
        C c = new C();
        c.print();
    }
}