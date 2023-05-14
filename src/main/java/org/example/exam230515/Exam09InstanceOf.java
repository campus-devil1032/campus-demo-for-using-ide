package org.example.exam230515;

public class Exam09InstanceOf {
    public static void main(String[] args) {
        Exam09Animal myDog = new Exam09Dog();
        Exam09Animal myCat = new Exam09Cat();

        System.out.println(myDog instanceof Exam09Animal); // true
        System.out.println(myDog instanceof Exam09Dog);   // true
        System.out.println(myDog instanceof Exam09Cat);   // false

        System.out.println(myCat instanceof Exam09Animal); // true
        System.out.println(myCat instanceof Exam09Dog);   // false
        System.out.println(myCat instanceof Exam09Cat);   // true
    }
}