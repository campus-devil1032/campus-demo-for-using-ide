package org.example.exam230515.exam14;

// Movable 인터페이스는 Walkable과 Flyable 인터페이스를 모두 확장합니다.
interface Movable extends Walkable, Flyable {
    void move();
}