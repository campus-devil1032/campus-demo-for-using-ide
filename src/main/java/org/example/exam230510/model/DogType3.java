package org.example.exam230510.model;

// Dog 클래스는 Animal 클래스를 상속받음
public class DogType3 extends AnimalType3 {
    public String breed;

    public DogType3() {
        super();
        this.breed = "Unknown";
    }

    public DogType3(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // 부모 클래스의 eat 메서드를 오버라이딩
    @Override
    public void eat() {
        System.out.println(this.name + " 낼름낼름...");
    }

    public void bark() {
        System.out.println(this.name + " 왕왕...");
    }
}
