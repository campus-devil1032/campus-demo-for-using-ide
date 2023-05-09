package org.example.exam230510.model;

// 부모 클래스
public class AnimalType3 {
    public String name;

    public AnimalType3() {
        this.name = "Animal";
    }

    public AnimalType3(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " 쩝쩝...");
    }
}
