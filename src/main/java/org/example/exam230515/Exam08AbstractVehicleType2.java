package org.example.exam230515;


import org.example.exam230515.model.Exam08Cat;
import org.example.exam230515.model.Exam08Dog;

public class Exam08AbstractVehicleType2 {
    public static void main(String[] args) {
        Exam08Dog myDog = new Exam08Dog();
        myDog.makeSound(); // The dog barks

        Exam08Cat myCat = new Exam08Cat();
        myCat.makeSound(); // The cat meows
    }
}