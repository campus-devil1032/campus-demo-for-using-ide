package org.example.exam230510.model;

// Cat 클래스도 Animal 클래스를 상속받음
public class CatType3 extends AnimalType3 {
    public int lives;

    public CatType3() {
        super();
        this.lives = 9;
    }

    public CatType3(String name, int lives) {
        super(name);
        this.lives = lives;
    }

    // 부모 클래스의 eat 메서드를 오버라이딩
    @Override
    public void eat() {
        System.out.println(this.name + " 깨작깨작...");
    }

    public void meow() {
        System.out.println(this.name + " 야옹...");
    }
}
