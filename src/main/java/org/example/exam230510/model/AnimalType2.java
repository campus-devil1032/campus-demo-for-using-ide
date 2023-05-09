package org.example.exam230510.model;

// 부모 클래스
public class AnimalType2 {
    public String name;

    public AnimalType2() {
        this.name = "Animal";
    }

    public AnimalType2(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " 쩝쩝...");
    }
}
