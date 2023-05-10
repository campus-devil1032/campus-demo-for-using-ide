package org.example.exam230510.model;

// Cat 클래스도 Animal 클래스를 상속받음
public class CatType2 extends AnimalType2 {
    public int lives;

    public CatType2() {
        super(); // 부모 클래스의 기본 생성자 호출
        this.lives = 9;
    }

    public CatType2(String name, int lives) {
        super(name); // 부모 클래스의 오버로드된 생성자 호출
        this.lives = lives;
    }

    public void meow() {
        System.out.println(this.name + " 냐옹...");
    }
}