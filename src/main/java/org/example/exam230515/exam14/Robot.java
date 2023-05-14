package org.example.exam230515.exam14;

// Robot 클래스는 Movable 인터페이스를 구현합니다.
class Robot implements Movable {
    public void walk() {
        System.out.println("The robot is walking");
    }

    public void fly() {
        System.out.println("The robot is flying");
    }

    public void move() {
        System.out.println("The robot is moving");
    }
}
