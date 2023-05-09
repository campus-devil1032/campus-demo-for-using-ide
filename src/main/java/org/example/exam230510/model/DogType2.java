package org.example.exam230510.model;

// Dog 클래스는 Animal 클래스를 상속받음

public class DogType2 extends AnimalType2 {
    public String breed;

    public DogType2() {
        super(); // 부모 클래스의 기본 생성자 호출
        this.breed = "Unknown";
    }

    public DogType2(String name, String breed) {
        super(name); // 부모 클래스의 오버로드된 생성자 호출
        this.breed = breed;
    }

    public void bark() {
        System.out.println(this.name + " 왕왕...");
    }
}
