package org.example.exam230515.exam14;

// Bird 클래스는 Walkable과 Flyable 두 인터페이스를 모두 구현합니다.
class Bird implements Walkable, Flyable {
    public void walk() {
        System.out.println("The bird is walking");
    }

    public void fly() {
        System.out.println("The bird is flying");
    }
}
